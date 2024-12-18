import java.util.*; // for now
import java.util.concurrent.TimeUnit;

public class Assignment {
    private String title;
    private String subject;
    private Date dueDate;
    private int weight;
    private int estimatedTime;
    private int timeRemaining;
    private int priority;
    private AssignmentComplexity complexity;
    
    public Assignment(String assignmentTitle,String assignmentSubject,int time,int weight) {
        title = assignmentTitle;
        subject = assignmentSubject;
        complexity = new AssignmentComplexity(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(int estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public AssignmentComplexity getComplexity() {
        return complexity;
    }

    public void setComplexity(AssignmentComplexity complexity) {
        this.complexity = complexity;
    }

    public int getDaysUntilDue() {
        if (dueDate == null) {
            throw new IllegalStateException("Due date is not set.");
        }

        Date today = new Date(); // current date
        long diffInMillis = dueDate.getTime() - today.getTime(); // milliseconds

        return (int) TimeUnit.MILLISECONDS.toDays(diffInMillis);
    }
}
