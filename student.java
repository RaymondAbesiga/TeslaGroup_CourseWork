
package ray.courseworkutms;

public class Student extends User {
    private String studentId;
    private String faculty;
    

    public Student(String userId, String name, String email, String password, String studentId, String faculty) {
        super(userId, name, email, password);
        this.studentId = studentId;
          this.faculty = faculty;
    }

    @Override
    public String requestTransport(String destination, String time, String reason,String action) {
            return "Student" +" "+ getName() + " (Faculty: " + faculty + ") requested transport to " +
                destination + " at " + time + ". Reason: " + reason + " Type of vehicle needed:"+action;
    }

    public String getStudentId() {
        return studentId;
    }
    public String getFaculty() {
        return faculty;
    }
    
    
}
