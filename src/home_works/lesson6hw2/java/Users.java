package home_works.lesson6hw2.java;

import java.util.Date;

public class Users {
    private long id;
    private String nick;
    private String password;
    private String email;
    private Date dateUser;
    private double karma;
    private String ip;

    public Users(long id, String nick, String password, String email, Date dateUser, double karma, String ip) {
        this.id = id;
        this.nick = nick;
        this.password = password;
        this.email = email;
        this.dateUser = dateUser;
        this.karma = karma;
        this.ip = ip;
    }
}
