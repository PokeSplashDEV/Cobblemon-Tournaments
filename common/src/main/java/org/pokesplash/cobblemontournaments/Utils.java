package org.pokesplash.cobblemontournaments;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.CompletionHandler;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.function.Consumer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class Utils {
	// Base path for the mods folder.
	public static final String BASE_PATH = new File("").getAbsolutePath() + "/config/cobblemontournaments/";

	/**
	 * Method to write some data to file.
	 * @param filePath the directory to write the file to
	 * @param filename the name of the file
	 * @param data the data to write to file
	 * @return true if writing to file was successful
	 */
	public static boolean writeFileAsync(String filePath, String filename, String data) {
		try {
			Path path = Paths.get(BASE_PATH + filePath + filename);

			// If the path doesn't exist, create it.
			if (!Files.exists(Paths.get(BASE_PATH + filePath))) {
				Files.createDirectory(Path.of(BASE_PATH + filePath));
			}

			// Write the data to file.
			AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.WRITE,
					StandardOpenOption.CREATE,
					StandardOpenOption.TRUNCATE_EXISTING);
			ByteBuffer buffer = ByteBuffer.allocate(1024);
			buffer.put(data.getBytes());
			buffer.flip();

			fileChannel.write(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
				@Override
				public void completed(Integer result, ByteBuffer attachment) {
					attachment.clear();
				}

				@Override
				public void failed(Throwable exc, ByteBuffer attachment) {
					exc.printStackTrace();
				}
			});
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Method to read a file asynchronously
	 * @param filePath the path of the directory to find the file at
	 * @param filename the name of the file
	 * @param callback a callback to deal with the data read
	 * @return true if the file was read successfully
	 */
	public static boolean readFileAsync(String filePath, String filename, Consumer<String> callback) {
		try {
			Path path = Paths.get(BASE_PATH + filePath + filename);

			// If the directory doesn't exist, return false.
			if (!Files.exists(Paths.get(BASE_PATH + filePath))) {
				return false;
			}

			// Read the file.
			AsynchronousFileChannel fileChannel = AsynchronousFileChannel.open(path, StandardOpenOption.READ);
			ByteBuffer buffer = ByteBuffer.allocate(1024);

			fileChannel.read(buffer, 0, buffer, new CompletionHandler<Integer, ByteBuffer>() {
				@Override
				public void completed(Integer result, ByteBuffer attachment) {
					attachment.flip();
					byte[] data = new byte[attachment.limit()];
					attachment.get(data);
					callback.accept(new String(data));
					attachment.clear();
				}

				@Override
				public void failed(Throwable exc, ByteBuffer attachment) {
					exc.printStackTrace();
				}
			});
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * Method to check if a directory exists. If it doesn't, create it.
	 * @param subpath The directory to check.
	 * @return the directory as a File.
	 */
	public static File getDirectory(String subpath) {
		File dir = new File(BASE_PATH + subpath);
		if (!dir.exists()) {
			dir.mkdirs();
		}
		return dir;
	}

	/**
	 * Finds a file from a directory.
	 * @param dir the directory to check for the file.
	 * @param filename the file to check for.
	 * @return A list of files that match the filename.
	 */
	private static String[] findFileName(File dir, String filename) {
		return dir.list((dir1, name) -> name.equals(filename));
	}

	/**
	 * Method to create a new gson builder.
	 * @return Gson instance.
	 */
	public static Gson newGson() {
		return new GsonBuilder().setPrettyPrinting().create();
	}
}
