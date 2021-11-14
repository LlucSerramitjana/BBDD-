package controllers;

import play.*;
import play.mvc.*;
import play.db.jpa.JPA;
import play.data.validation.*;
import java.util.*;

import models.*;

import javax.persistence.Query;

public class Application extends Controller {


   public static void index(int i) {

       render();
    }
    public static void login(String Name, String Pwd){
        User us = User.find("byFullnameAndPassword", Name, Pwd).first();
        if(us != null){
            renderText("login " + Name);
        }
        else
            renderText("Abans registrar-se");
    }


    public static void DonarDeBaixaCalendari(String titulo){
        Calendari c = Calendari.find("byTitulo", titulo).first();
        if(c!=null){

            c.delete();
            renderText(titulo + " donat de baixa");
        }
        renderText("Calendari no existeix");
    }
    public static void DonarDeBaixaEvent(String titulo){
        Event e = Event.find("byTitulo", titulo).first();
        if(e!=null){
            e.delete();
            renderText(titulo + " donat de baixa");
        }
        renderText("Event no existeix");
    }
    public void DonarDeBaixaUsuari(String fullname){
        User u = User.find("byFullname", fullname).first();
        if (u!=null){
          /*  Calendari c;
            List<Calendari> calendaris = Calendari.find("ByUSER_ID",u.id).fetch();
            for(int i=0; i<calendaris.size(); i++){
                c = calendaris.get(i);
                c.delete();

            }
            Event e;
            List <Event> events = Event.find("ByUSER_ID",u.id).fetch();
            for(int j=0; j<events.size(); j++){
                e = events.get(j);
                e.delete();
            }*/
            u.delete();
            renderText(fullname + " donat de baixa");
        }
        renderText("Usuari no existeix");
    }

}