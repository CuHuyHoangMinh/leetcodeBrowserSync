package DAO;
import java.util.*;

import model.Submission;
public interface SubmissionDAO {
	List<Submission> getAllSubmission();
	Map<Long, Submission> getSubmissionMap();
	Submission getSubmissionbyID(Long id);
	SubmissionDAO initAll();
	

}
