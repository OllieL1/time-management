public class AssignmentComplexity {
    private Assignment assignment;
    private int complexity;

    public AssignmentComplexity(Assignment assignment) {
        this.assignment = assignment;
    }

    public int calculateComplexity() {
        return (assignment.getPriority() * 2) + assignment.getEstimatedTime() + (5 / assignment.getDaysUntilDue());
    }
}
