
package ray.courseworkutms;

public abstract class User {
    private String userId;
    private String name;
    private String email;
    private String password;

    public User(String userId, String name, String email, String password) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    // Login method
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    // Abstract method
    public abstract String requestTransport(String destination, String time, String reason,String action);

    // Getters
    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}