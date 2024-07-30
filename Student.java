import java.util.ArrayList;
import java.util.List;

public class Student {
    private String id;
    private List<String> submissions;

    public Student(String id) {
        this.id = id;
        this.submissions = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void submitAssignment(String className, String assignment) {
        submissions.add(className + ": " + assignment);
    }

    public List<String> getSubmissions() {
        return submissions;
    }
}
