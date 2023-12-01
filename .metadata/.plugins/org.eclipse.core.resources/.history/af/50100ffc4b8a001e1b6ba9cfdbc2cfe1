package minh.leetcodesync;

import java.io.*;
import java.net.URISyntaxException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import org.json.*;

import DAO.SubmissionDAOImp;
import controller.controller;
import io.github.cdimascio.dotenv.Dotenv;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		SubmissionDAOImp s = SubmissionDAOImp.getInstance();
		s.downloadAllSubmission();
	}

	public static void invoke() throws URISyntaxException, IOException {
		OkHttpClient client = new OkHttpClient.Builder().readTimeout(1000, TimeUnit.MILLISECONDS)
				.writeTimeout(1000, TimeUnit.MILLISECONDS).build();
		String username = "CuHuyHoangMinh";
		MediaType mediaType = MediaType.parse("application/json");
		String query = String.format(
				"{\"query\":\"query  getUserProfile($username: String!) { allQuestionsCount { difficulty count } matchedUser(username: $username) { contributions { points } profile { reputation ranking } submissionCalendar submitStats { acSubmissionNum { difficulty count submissions } totalSubmissionNum { difficulty count submissions } } } } \",\"variables\":{\"username\":\"%s\"}}",
				username);
		RequestBody body = RequestBody.create(query, mediaType);
		Request request = new Request.Builder().url("https://leetcode.com/graphql/").post(body).build();
//		System.out.println(query);
		try {
			Response response = client.newCall(request).execute();
			String responseString = response.body().string();
			JSONObject jsonObject = new JSONObject(responseString);
			System.out.println(jsonObject.toString());
			System.out.println(response.message());
			
		} catch (IOException | JSONException ex) {
			System.out.println(ex.getMessage());
			return;
		}
	}
	
	public static void downloadSubmission() throws URISyntaxException, IOException  {
		OkHttpClient client = new OkHttpClient.Builder().readTimeout(1000, TimeUnit.MILLISECONDS)
				.writeTimeout(1000, TimeUnit.MILLISECONDS).build();
		MediaType mediaType = MediaType.parse("application/json");
		Dotenv dotenv = Dotenv.configure()
				.directory("./")
				.ignoreIfMalformed()
		        .ignoreIfMissing()
		        .load();
						
		String csrtf = dotenv.get("leetcodecsrftoken");
		String session = dotenv.get("leetcodesession");
		
		Request request = new Request.Builder().url("https://leetcode.com/api/submissions/")
												.header("X-Requested-With", "XMLHttpRequest")
												.header("X-CSRFToken", csrtf )
												.header("Cookie", "csrftoken="+csrtf+";LEETCODE_SESSION="+session)
												.build();
		
		try {
			Response response = client.newCall(request).execute();
			String responseString = response.body().string();
			JSONObject jsonObject = new JSONObject(responseString);
			System.out.println(jsonObject.toString());
			System.out.println(response.message());
		}catch (IOException | JSONException ex) {
			System.out.println(ex.getMessage());
			return;
		}
		

		
	}
}

