package DAO;
import java.util.*;

import model.Submission;
public interface SubmissionDAO {
	List<Submission> getAllSubmission();
	Submission getSubmissionbyID(Long id);
	

}
