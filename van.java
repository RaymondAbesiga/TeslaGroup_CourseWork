
package ray.courseworkutms;

public class Van extends Vehicle implements Serviceable, Schedulable, Trackable {

    public Van(String vehicleID, String model, int capacity,String assignedriver,String assignedroute) {
        super(vehicleID, model, capacity, assignedriver,assignedroute);
    }

    @Override
    public void serviceVehicle() {
        System.out.println("Van " + getVehicleID() + " heading to Toyota service station Jinja Road.");
    }

    @Override
    public void scheduleRoute(String route) {
        System.out.println("Van " + getVehicleID() + " is scheduled to transport students along route: " + route);
    }

    public void trackLocation() {
        System.out.println("Van " + getVehicleID() + " being parked at VU Main Campus near VC's Vehicle.");
    }
}
