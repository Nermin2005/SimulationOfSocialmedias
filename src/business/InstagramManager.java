package business;

import entities.Instagram;
import entities.Socialmedia;

public class InstagramManager extends SocialmediaManager{
    @Override
    public void register(Socialmedia socialmedia) {
        if(socialmedia.getUsername().contains(".") && socialmedia.getPassword().length()>8 &&
                 socialmedia.getEmail().contains("@")) {
            System.out.println(socialmedia.getUsername()+" you successfully register!");

        }
        else {
            System.out.println("Something went wrong");
        }
    }
    private Instagram instagram;
    public void shareStory(boolean story,Instagram instagram) {
        if (story==instagram.getStory()) {
        System.out.println("true"); }
        else {
            System.out.println("false");
        }
    }
}
