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
//import org.kohsuke.github.GHRepository;
//import org.kohsuke.github.GitHub;
//import org.kohsuke.github.GitHubBuilder;

import DAO.SubmissionDAOImp;
import controller.GitController;
import controller.LeetcodeSyncCommand;
import io.github.cdimascio.dotenv.Dotenv;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args)
			throws IOException, JSONException {
		LeetcodeSyncCommand.syncLeetCode();
	}

	public static boolean deleteDir(File f) {
		File[] allFiles = f.listFiles();
		if (allFiles != null) {
			for (File fi : allFiles) {
				deleteDir(fi);
			}
		}
		return f.delete();
	}

}
