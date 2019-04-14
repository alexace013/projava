package userProject.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bugred {
    private String name;
    private String email;
    private String password;

    public Bugred() {
    }

    public Bugred(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Bugred {\n" +
                "name = '" + name + '\'' +
                ",\nemail = '" + email + '\'' +
                ",\npassword = '" + password + '\'' +
                "\n" + '}';
    }
}