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
//		System.out.println(git.addFiles("test/abcddd.txt","something","test git put"));
//		SubmissionDAOImp s = SubmissionDAOImp.getInstance();
//		s.downloadAllSubmission(10);
//		connectGit();
	}

//	public static void connectGit() throws InvalidRemoteException, TransportException, GitAPIException, IOException {
//		File f = new File("./github");
//		if (f.exists()) {
//			deleteDir(f);
//		}
//		TextProgressMonitor consoleProgressMonitor = new TextProgressMonitor(new PrintWriter(System.out));
//		SshSessionFactory sshSessionFactory = new JschConfigSessionFactory() {
//
//			@Override
//			protected void configure(Host hc, Session session) {
//				// TODO Auto-generated method stub
//	            session.setConfig("StrictHostKeyChecking", "no");
//
//			}
//			@Override
//	        protected JSch createDefaultJSch(FS fs) throws JSchException  {
//	            JSch jSch = super.createDefaultJSch(fs);
//	            jSch.addIdentity("/path/to/key", "super-secret-passphrase".getBytes());
//	            return jSch;
//	        }
//
//		};
//		CredentialsProvider c = new UsernamePasswordCredentialsProvider("CuHuyHoangMinh","dragonMINH1998");
//
//		Git git = Git.cloneRepository().setProgressMonitor(consoleProgressMonitor).setDirectory(f)
//				.setURI("https://github.com/CuHuyHoangMinh/leetcodePractice.git")
//				.setTransportConfigCallback(new TransportConfigCallback() {
//
//					@Override
//					public void configure(Transport transport) {
//						// TODO Auto-generated method stub
//						SshTransport sshTransport = (SshTransport) transport;
//						sshTransport.setSshSessionFactory(sshSessionFactory);
//					}
//					
//					
//
//				}).call();
//		Repository repo = git.getRepository();
//		FileWriter test = new FileWriter("./github/test.txt");
//		test.write("something");
//		test.close();
//		AddCommand add = git.add();
//
//		add.addFilepattern("/github/test.txt").call();
//		git.commit().setMessage("test git").call();
//		git.push().call();
//
//	}
	
//	public static void connectGit() throws IOException {
//		GitHub github = new GitHubBuilder().withOAuthToken("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").build();
//		GHRepository repo = github.createRepository("https://github.com/CuHuyHoangMinh/leetcodePractice.git")
//								.downloads(true).;
//		github.checkApiUrlValidity();
//	}

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
