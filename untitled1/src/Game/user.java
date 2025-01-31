package Game;

public class user {
    private String username;
    private String password;

    public user(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public user() {
    }

    public String getPassword() {
        return password;
    }

    public String getUsername() {
        return username;
    }

    public user setUsername(String username) {
        this.username = username;
        return this;
    }

    public user setPassword(String password) {
        this.password = password;
        return this;
    }
}
