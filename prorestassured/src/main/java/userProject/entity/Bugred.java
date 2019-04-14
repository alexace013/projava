package userProject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Bugred {
    private String name;
    private String email;
    private String password;
    private String avatar;
    private String birthday;
    private String gender;
    private String hobby;
    @JsonProperty("date_start") private String dateStart;

    public Bugred() {
    }

    public Bugred(String name, String email, String password, String avatar, String birthday, String gender, String hobby, String dateStart) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.avatar = avatar;
        this.birthday = birthday;
        this.gender = gender;
        this.hobby = hobby;
        this.dateStart = dateStart;
    }

    @Override
    public String toString() {
        return "Bugred {\n" +
                "name = '" + name + '\'' +
                ",\nemail = '" + email + '\'' +
                ",\npassword = '" + password + '\'' +
                ",\navatar = '" + avatar + '\'' +
                ",\nbirthday = '" + birthday + '\'' +
                ",\ngender = '" + gender + '\'' +
                ",\nhobby = '" + hobby + '\'' +
                ",\ndateStart = '" + dateStart + '\'' +
                "\n" + '}';
    }
}