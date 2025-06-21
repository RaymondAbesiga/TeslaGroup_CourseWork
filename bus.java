
package ray.courseworkutms;




public class bus extends Vehicle implements Serviceable, Schedulable, Trackable {

    public bus(String vehicleID, String model, int capacity,String assignedriver,String assignedroute) {
        super(vehicleID, model, capacity, assignedriver, assignedroute);
    }

    @Override
    public void serviceVehicle() {
        System.out.println("Bus " + getVehicleID() + " Stolen and the incident being handled by Police.");
    }

    @Override
    public void scheduleRoute(String route) {
        System.out.println("Bus " + getVehicleID() + " is enroute to: " + route);
    }

    public void trackLocation() {
        System.out.println("Bus " + getVehicleID() + " seen heading to Makerere Business School Nakawa.");
    }
}

