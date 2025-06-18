package MainApplication;

public class Admin extends Account {
    private String AuthPassword;

    public Admin(int id, String name, String password){
        id = id;
        name = name;
        AuthPassword = password;
    }
}

