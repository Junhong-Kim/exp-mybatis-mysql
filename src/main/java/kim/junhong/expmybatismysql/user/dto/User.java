package kim.junhong.expmybatismysql.user.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    private int seq;
    private String name;
    private String country;

    public User(int seq, String name, String country) {
        this.seq = seq;
        this.name = name;
        this.country = country;
    }
}
