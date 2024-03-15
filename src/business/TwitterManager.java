package business;

import entities.Socialmedia;
import entities.Twitter;

public class TwitterManager extends SocialmediaManager{
    @Override
    public void register(Socialmedia socialmedia) {
        if(socialmedia.getUsername().contains(",") && socialmedia.getPassword().length()>10 &&
              socialmedia.getPassword().contains(".") && socialmedia.getEmail().contains("@")) {
            System.out.println("Hi,dear "+socialmedia.getUsername());
        }
        else {
            System.out.println("Something went wrong");
        }
    }
  public void shareOpinion(String opinion) {
      System.out.println(opinion);
  }
}
