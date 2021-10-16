package controllers;

import play.*;
import play.mvc.*;
import play.db.jpa.JPA;

import java.util.*;

import models.*;

import javax.persistence.Query;

public class Application extends Controller {
    public static void login(String Name, String Pwd){
        User us = User.find("byFullnameAndPassword", Name, Pwd).first();
        if(us != null){
            renderText("login " + Name);
        }
        else
            renderText("Abans registrar-se");
    }

    public static void index(int i) {
        new User(1234, "pwd", "Lluc").save();
        new User(2345, "pwd1", "Christian").save();
    }

}