package model;

public class Administrator {

    private int adminId;
    private String name;
    private String username;
    private String password;

    public Administrator(int adminId, String name,
                         String username, String password) {
        this.adminId = adminId;
        this.name = name;
        this.username = username;
        this.password = password;
    }

    public int getAdminId() {
        return adminId;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public boolean login(String username, String password) {
        return this.username.equals(username)
                && this.password.equals(password);
    }

    @Override
    public String toString() {
        return "Administrator ID: " + adminId +
                ", Name: " + name +
                ", Username: " + username;
    }
}