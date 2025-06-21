package ray.courseworkutms;

public class Main {
    public static void main(String[] args) {
        
        Student student1 = new Student("01", "Emmanuel Okello", "emma@gmail.com", "pass1", "S001", "FST");
        Student student2 = new Student("02", "Iserene Annet", "iserene12@gmail.com", "pass2", "S002", "Health");
        Lecturer lecturer = new Lecturer("03", "Eng. Bazigu", "Balex@vu.ac.ug", "pass3", "Staff");
        TransportOfficer officer = new TransportOfficer("004", "Mr. TIBU", "tibu43@gmail.com", "pass4", "000", "6 O'clock");


        System.out.println("\n===========================\n        USER LOGIN\n===========================");

        if (student1.login("emma@gmail.com", "pass1")) {
            String faculty = student1.getFaculty() != null ? student1.getFaculty() : "Unknown Faculty";
            System.out.println("--> " + student1.getName() + " (Faculty: " + faculty + ") Successfully logged in .");
        }
        if (student2.login("iserene12@gmail.com", "pass2")) {
            String faculty = student2.getFaculty() != null ? student2.getFaculty() : "Unknown Faculty";
            System.out.println("--> " + student2.getName() + " (Faculty: " + faculty + ") Successfully logged in.");
        }
        if (lecturer.login("Balex@vu.ac.ug", "pass3")) {
            String department = lecturer.getDepartment() != null ? lecturer.getDepartment() : "Unknown Department";
            System.out.println("--> " + lecturer.getName() + " (Department: " + department + ")Successfully logged in.");
        }
        if (officer.login("tibu43@gmail.com", "pass4")) {
            String officerId = officer.getOfficerId() != null ? officer.getOfficerId() : "N/A";
            System.out.println("--> " + officer.getName() + " (Officer ID: " + officerId + ") Successfully logged in.");
        }

      
        System.out.println("\n===========================\n   TRANSPORT REQUESTS (OVERRIDEN)\n===========================");
        System.out.println("." + student1.requestTransport("Gulu", "11:30 AM", "'Outing'", "Bus"));
        System.out.println("." + student2.requestTransport("Mbale", "8:00 AM", "'Games'", "Van"));
        System.out.println("." + lecturer.requestTransport("Market Plaza", "9:00 AM", "'Lectures'", "Van"));
        System.out.println("." + officer.requestTransport("Masindi", "1:00 PM", "'Pick students going for Inter-University games'", "Bus"));

       
        System.out.println("\n===========================\n   DRIVER ASSIGNMENT (OVERLOADED)\n===========================");
        officer.assignDriver();
        officer.assignDriver("Bus");
        officer.assignDriver("Day", "DRV170");

        
        System.out.println("\n===========================\n       VEHICLE INFORMATION\n===========================");

        bus bus = new bus("B100", "Coaster", 20, "Kampala - Masindi", "Tracy");
        Van van = new Van("V010", "Toyota Drone", 34, "Mbale - Gulu", "Okello");

        bus.displayInfo();
        van.displayInfo();

        
        System.out.println("\n===========================\n   MODIFYING VEHICLE PROPERTIES\n===========================");
        System.out.println("Van Capacity: " + van.getCapacity() + " passengers");
        van.setCapacity(18);
        System.out.println("New Van Capacity: " + van.getCapacity() + " passengers");

       
        System.out.println("\n===========================\n  VEHICLE INTERFACE IMPLEMENTATIONS\n===========================");

        System.out.println("BUS:");
        bus.scheduleRoute("Kampala - Masindi");
        bus.serviceVehicle();
        bus.trackLocation();

        System.out.println(" VAN:");
        van.scheduleRoute("Mbale - Gulu");
        van.serviceVehicle();
        van.trackLocation();

       
        System.out.println("\n===========================\n      SYSTEM DEMO COMPLETE\n===========================\n");
    }
}
