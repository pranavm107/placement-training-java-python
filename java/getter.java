class Instagram {

    private String username;
    private String password;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void display() {
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

public class getter {

    public static void main(String[] args) {

        Instagram account = new Instagram();

        account.setUsername("pranav123");
        account.setPassword("MyPassword@123");

        account.display();
    }
}