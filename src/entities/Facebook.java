package entities;

import entities.Socialmedia;

public class Facebook extends Socialmedia {
    private String toFindSomeone;

    public Facebook(int id, String name, String email, String username, String password,String toFindSomeone) {
        super(id, name, email, username, password);
        this.toFindSomeone=toFindSomeone;

    }

    public String getToFindSomeone() {
        return toFindSomeone;
    }

    public void setToFindSomeone(String toFindSomeone) {
        this.toFindSomeone = toFindSomeone;
    }


}
