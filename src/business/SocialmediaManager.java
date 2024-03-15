package business;

import entities.Socialmedia;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public abstract class SocialmediaManager {
    private Socialmedia socialmedia;
    public  abstract void register(Socialmedia socialmedia);
    public void login(String username,String password,Socialmedia socialmedia) {
        if(username==socialmedia.getUsername() && password==socialmedia.getPassword()) {
            System.out.println("Successfully login! "+ username);
        }
        else {
            System.out.println("You have to check your properties.");
        }
    }
    public void forgetPassword(String email,Socialmedia socialmedia) {
if (email==socialmedia.getEmail()) {
    System.out.println("Change your password:");
    Scanner scanner=new Scanner(System.in);
    String password = scanner.nextLine();
    System.out.println(password);
    System.out.println("Your password successfully changed!");
    }
else {
    System.out.println("Pls write your email correctly");
}
    }

}
