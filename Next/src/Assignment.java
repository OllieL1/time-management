import java.util.*; // for now

public class Assignment {
    String title;
    String subject;
    Date dueDate;
    int weight;
    AssignmentComplexity complexity;
    
    public Assignment(String assignmentTitle,String assignmentSubject,int time,int weight) {
        title = assignmentTitle;
        subject = assignmentSubject;
        complexity = new AssignmentComplexity(time, weight);
    }
}
