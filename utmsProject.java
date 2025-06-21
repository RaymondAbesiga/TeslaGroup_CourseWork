package ray.teslagroupcoursework;

interface Serviceable {
    void performService();
}

interface Trackable {
    void trackLocation();
}

interface Schedulable {
    void scheduleRoute(Route route);
}


class Route {
    private String routeId;
    private String startPoint;
    private String endPoint;

    public Route(String routeId, String startPoint, String endPoint) {
        this.routeId = routeId;
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public String getRouteId() {
        return routeId;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }
}


abstract class Vehicle implements Serviceable, Trackable, Schedulable {
    private String vehicleId;
    private String licensePlate;
    private String model;

    public Vehicle(String vehicleId, String licensePlate, String model) {
        this.vehicleId = vehicleId;
        this.licensePlate = licensePlate;
        this.model = model;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}


class Bus extends Vehicle {

    public Bus(String vehicleId, String licensePlate, String model) {
        super(vehicleId, licensePlate, model);
    }

    @Override
    public void performService() {
        System.out.println("Performing maintenance service on the bus with ID: " + getVehicleId());
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking GPS location of bus ID: " + getVehicleId());
    }

    @Override
    public void scheduleRoute(Route route) {
        System.out.println("Scheduling bus ID " + getVehicleId() + " for route " + route.getRouteId());
    }
}


class Van extends Vehicle {

    public Van(String vehicleId, String licensePlate, String model) {
        super(vehicleId, licensePlate, model);
    }

    @Override
    public void performService() {
        System.out.println("Performing maintenance service on the van with ID: " + getVehicleId());
    }

    @Override
    public void trackLocation() {
        System.out.println("Tracking GPS location of van ID: " + getVehicleId());
    }

    @Override
    public void scheduleRoute(Route route) {
        System.out.println("Scheduling van ID " + getVehicleId() + " for route " + route.getRouteId());
    }
}


class Driver {
    private String driverId;
    private String name;
    private String licenseNumber;

    public Driver(String driverId, String name, String licenseNumber) {
        this.driverId = driverId;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}


abstract class User {
    private String userId;
    private String name;
    private String username;
    private String password;

    public User(String userId, String name, String username, String password) {
        this.userId = userId;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public abstract void requestTransport();
}


class Student extends User {

    private String studentId;

    public Student(String userId, String name, String username, String password, String studentId) {
        super(userId, name, username, password);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public void requestTransport() {
        System.out.println("Student " + getName() + " requests transport for campus commute.");
    }
}


class Lecturer extends User {

    private String faculty;

    public Lecturer(String userId, String name, String username, String password, String faculty) {
        super(userId, name, username, password);
        this.faculty = faculty;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    @Override
    public void requestTransport() {
        System.out.println("Lecturer " + getName() + " requests transport to go for a lecture at market plaza.");
    }
}


class TransportOfficer extends User {

    private String officeId;

    public TransportOfficer(String userId, String name, String username, String password, String officeId) {
        super(userId, name, username, password);
        this.officeId = officeId;
    }

    public String getOfficeId() {
        return officeId;
    }

    public void setOfficeId(String officeId) {
        this.officeId = officeId;
    }

    @Override
    public void requestTransport() {
        System.out.println("Transport Officer " + getName() + " coordinating transport services.");
    }
   
    public void assignDriver(Driver driver, String vehicleType) {
        System.out.println("Assigning driver " + driver.getName() + " to vehicle type: " + vehicleType);
    }

    public void assignDriver(Driver driver, String shiftStart, String shiftEnd) {
        System.out.println("Assigning driver " + driver.getName() + " for shift: " + shiftStart + " to " + shiftEnd);
    }
}
public class utmsProject {
    public static void main(String[] args) {

        Student student = new Student("U001", "Flavia Tracy", "tracy123", "password", "S1001");
        Lecturer lecturer = new Lecturer("U002", "Eng. Bazigu", "bazieng", "password", "Engineering");
        TransportOfficer officer = new TransportOfficer("U003", "Kauma", "amuak", "password", "TO-01");

        Bus bus = new Bus("B001", "UAP-523", "Volvo");
        Van van = new Van("V002", "UBP-789", "Toyota");

        Driver driver1 = new Driver("D001", "Raymond", "DL123456");

        student.requestTransport();    
        lecturer.requestTransport();   
        officer.requestTransport();    

        bus.performService();
        van.trackLocation();

        Route route1 = new Route("R001", "Main Gate", "Library");
        bus.scheduleRoute(route1);
        van.scheduleRoute(route1);

        officer.assignDriver(driver1, "Bus");
        officer.assignDriver(driver1, "08:00", "16:00");
    }
}