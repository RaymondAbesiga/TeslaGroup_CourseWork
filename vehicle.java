
package ray.courseworkutms;

public abstract class Vehicle{
private String VehicleID;
private String model;
private int capacity;
private String assignedRoute;
private String assigneddriver;
    private String mocel;
    private final String assignedDriver;
    private String AssignedDriver;

public Vehicle(String vehicleID,String model,int capacity,String assignedDriver,String assignedRoute){
this.VehicleID = vehicleID;
this.model = model;
this.capacity = capacity;
this.assignedDriver = assignedDriver;
}
public String getVehicleID(){
    String vehicleID = null;
return vehicleID;
}
public String getModel(){
    return model;
}
public int getCapacity(){
return capacity;
}
public String getAssignedRoute(){
return assignedRoute;
}
public String getAssignedDriver(){
return assignedDriver;
}
public void setVehicleID(String vehicleID){
this.VehicleID = vehicleID;
}
public void setModel(String model){
this.model =model;
}
public void setCapacity(int capacity){
this.capacity = capacity;
}
public void setAssignedRoute(String assignedRoute){
    this.assignedRoute = assignedRoute;
}
public void setAssignedDriver(String assignedDriver){
this.AssignedDriver = assignedDriver;
}
public abstract void serviceVehicle();

public abstract void scheduleRoute(String route);

public void displayInfo(){
System.out.println("Vehicle ID: " + VehicleID + ",Model: " + model +",Capacity:"+ capacity +",Assigned Route:"+ (assignedRoute !=null? assignedRoute:"None")+"Assigned Driver:"+(assignedDriver!=null? assignedDriver:"None"));

}

    String getVehicleId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getRoute() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    String getDriverName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    void trackLocation() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

