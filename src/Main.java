import business.FacebookManager;
import business.InstagramManager;
import entities.Facebook;
import entities.Instagram;
import entities.Socialmedia;

public class Main {
    public static void main(String[] args) {
        Socialmedia socialmedia=new Socialmedia(1,"Nermin","memmedlinermin205@gmail.com","nermin2005","nermin123");
        InstagramManager instagramManager=new InstagramManager();
        Instagram instagram=new Instagram(2,"Nermin","memmedlinermin205@gmail.com","nermin2005","nermin123",true);
        Facebook facebook=new Facebook(3,"Nermin","memmedlinermin205@gmail.com","nermin2005","nermin123","Salamm");

        instagramManager.login("123","nermin123",socialmedia);
        instagramManager.register(socialmedia);
        instagramManager.shareStory(true,instagram);
        FacebookManager facebookManager=new FacebookManager();
        facebookManager.FindSbEasily(facebook,"Salam");
        instagramManager.forgetPassword("memmedlinermin205@gmail.com",socialmedia);
    }
}