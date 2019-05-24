package userProject.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Bugred {

    private String name;
    private String surname;
    private String email;
    private String password;
    private String avatar;
    private String birthday;
    private String gender;
    private String hobby;
    @JsonProperty("date_start")
    private String dateStart;
}