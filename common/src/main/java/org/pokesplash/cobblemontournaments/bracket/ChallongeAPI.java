package org.pokesplash.cobblemontournaments.bracket;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Class that has standard HTTP methods that interact with the challonge API.
 */
public class ChallongeAPI {
	// Base route of the challonge API.
	private final String APIEndpoint = "https://api.challonge.com/v1/";

	/**
	 * Method to call the GET method on the API.
	 * @param substring The route of the API.
	 * @return JSON response as a string.
	 */
	public String get(String substring) {
		try {
			URL url = new URL(APIEndpoint + substring);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");

			BufferedReader in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			con.disconnect();

			return content.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Method to call the POST method on the API.
	 * @param substring The route of the API.
	 * @param body The body of the POST request, as a JSON string.
	 * @return JSON response as a string.
	 */
	public String post(String substring, String body) {
		try {
			URL url = new URL(APIEndpoint + substring);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("POST");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);

			try(OutputStream os = con.getOutputStream()) {
				byte[] input = body.getBytes("utf-8");
				os.write(input, 0, input.length);
			}

			BufferedReader in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			con.disconnect();

			return content.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * Method to call the DELETE method on the API.
	 * @param substring The route of the API.
	 */
	public String delete(String substring, String body) {
		try {
			URL url = new URL(APIEndpoint + substring);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("DELETE");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);

			try(OutputStream os = con.getOutputStream()) {
				byte[] input = body.getBytes("utf-8");
				os.write(input, 0, input.length);
			}

			BufferedReader in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			con.disconnect();

			return content.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	/**
	 * Method to call the PUT method on the API.
	 * @param substring The route of the API.
	 * @param body The body of the API request.
	 * @return JSON response as a String.
	 */
	public String put(String substring, String body) {
		try {
			URL url = new URL(APIEndpoint + substring);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("PUT");
			con.setRequestProperty("Content-Type", "application/json");
			con.setDoOutput(true);

			try(OutputStream os = con.getOutputStream()) {
				byte[] input = body.getBytes("utf-8");
				os.write(input, 0, input.length);
			}

			BufferedReader in = new BufferedReader(
					new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			con.disconnect();

			return content.toString();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
