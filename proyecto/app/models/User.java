package models;
import java.util.*;
import javax.persistence.*;

import play.db.jpa.*;

@Entity
public class User extends Model {
    public int id;
    public String password;
    public String fullname;
    public boolean isAdmin;

    @OneToMany
    public List<Calendari> calendaris;
    @OneToMany
    public List<Event> events;
    public User(int id, String password, String fullname) {
        this.id = id;
        this.password = password;
        this.fullname = fullname;
    }
}

