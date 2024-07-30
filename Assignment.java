import java.util.HashMap;
import java.util.Map;

public class Assignment {
    private String title;
    private String description;
    private String dueDate;
    private Map<String, String> submissions; // Maps student ID to submission content

    public Assignment(String title, String description, String dueDate) {
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        this.submissions = new HashMap<>();
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public Map<String, String> getSubmissions() {
        return submissions;
    }

    // Methods
    public void submit(String studentId, String content) {
        submissions.put(studentId, content);
        System.out.println("Assignment submitted by Student " + studentId + ".");
    }

    public String getSubmission(String studentId) {
        return submissions.get(studentId);
    }

    public void listSubmissions() {
        System.out.println("Submissions for Assignment: " + title);
        for (Map.Entry<String, String> entry : submissions.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() + " - Submission: " + entry.getValue());
        }
    }
}
