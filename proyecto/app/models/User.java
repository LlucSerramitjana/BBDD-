package models;
import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class User extends Model {
    public String password;
    public String fullname;
    public boolean isAdmin;

    @OneToMany
    public List<Calendari> calendaris;
    @OneToMany
    public List<Event> events;
    public User(String password, String fullname) {
        this.password = password;
        this.fullname = fullname;
    }
}

