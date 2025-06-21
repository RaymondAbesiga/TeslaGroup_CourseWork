
package ray.courseworkutms;



public class TransportOfficer extends User {
    private String officerId;
    private String shift;

    public TransportOfficer(String userId, String name, String email, String password, String officerId, String shift) {
        super(userId, name, email, password);
        this.officerId = officerId;
        this.shift = shift;
    }

    @Override
    public String requestTransport(String destination,String time, String reason,String action) {
        return "Transport Officer " + getName() + " (Officer ID: " + officerId + ") assigned driver to " +
               destination + " at " + time + ". Reason: " + reason + " Vehicle needed:" + action;
    }

    // Overloaded Methods
    public void assignDriver() {
        System.out.println("Assigning driver");
    }

    public void assignDriver(String vehicleType) {
        System.out.println("Assigning driver for vehicle type: " + vehicleType);
    }

    public void assignDriver(String shiftTime, String driverId) {
        System.out.println("Assigning driver " + driverId + " for shift: " + shiftTime);
    }

    public String getOfficerId() {
        return officerId;
    }

    public String getShift() {
        return shift;
    }
}
