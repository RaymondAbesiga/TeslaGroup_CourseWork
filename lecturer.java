package ray.courseworkutms;

public class Lecturer extends User {
    private final String department;

    public Lecturer(String userId, String name, String email, String password, String department) {
        super(userId, name, email, password);
        this.department = department;
    }

    @Override
    public String requestTransport(String destination, String time, String reason, String action) {
        return "Lecturer " + getName() + " (Department: " + department + ") requested transport to " +
               destination + " at " + time + ". Reason: " + reason + " Type of vehicle needed: " + action;
    }

    public String getDepartment() {
        return department;
    }

    public static void main(String[] args) {
        // Example usage
        Lecturer lecturer = new Lecturer("B15", "Eng Balex", "balex@vu.ac.ug", "pass90", "SAD");
        String request = lecturer.requestTransport("Main Campus", "05:30", "Evening Lecture", "Approve");
        System.out.println(request);
    }
}