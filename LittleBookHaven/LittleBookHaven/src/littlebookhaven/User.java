package littlebookhaven;

public class User {
    private int userID;
    private String username;
    private String password;
    private String role;

    public User() {}

    public User(int userID, String username, String password, String role) {
        this.userID = userID;
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public User(String username, String password, String role) {
        this.username = username;
        this.password = password;
        this.role = role;
    }

    public int getUserID() { return userID; }
    public void setUserID(int userID) { this.userID = userID; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}

class Cashier extends User { 

    public Cashier(int userID, String username, String password) {
        super(userID, username, password, "Cashier"); 
    }

    public Cashier(String username, String password) {
        super(username, password, "Cashier"); 
    }

    public void viewBookDetails(User loggedInUser) {
        BookDetailsFrame bd = new BookDetailsFrame(loggedInUser);
        bd.setVisible(true);
    }

    public void addBook(User loggedInUser) {
        AddNewBookFrame ab = new AddNewBookFrame(loggedInUser);
        ab.setVisible(true);
    }

    public void searchByCategory(User loggedInUser) {
        SearchBookFrame ab = new SearchBookFrame(loggedInUser);
        ab.setVisible(true);
    }
}

class Manager extends Cashier {

    public Manager(int userID, String username, String password) {
        super(userID, username, password); 
        setRole("Manager"); 
    }

    public Manager(String username, String password) {
        super(username, password);
        setRole("Manager");
    }

    public void createCashierAccount(User loggedInUser) {
        CreateCashierAccountFrame cc = new CreateCashierAccountFrame(loggedInUser);
        cc.setVisible(true);
    }
}
