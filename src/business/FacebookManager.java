package business;

import entities.Facebook;
import entities.Socialmedia;

public class FacebookManager extends SocialmediaManager{
    @Override
    public void register(Socialmedia socialmedia) {
        if(socialmedia.getPassword().length()>8 && socialmedia.getEmail().contains("@")) {
            System.out.println("Hi, "+socialmedia.getUsername());
        }
        else {
            System.out.println("Something went wrong");
        }
    }
    public void FindSbEasily(Facebook facebook,String findsb) {
        if(findsb==facebook.getToFindSomeone()) {
            System.out.println("You successfully find");
        }
        else {
            System.out.println("You should to try again");
        }
    }
}
