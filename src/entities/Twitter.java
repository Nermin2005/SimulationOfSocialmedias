package entities;

public class Twitter extends Socialmedia{
private String opinion;

    public Twitter(int id, String name, String email, String username, String password,String opinion) {
        super(id, name, email, username, password);
        this.opinion=opinion;
    }

    public String getOpinion() {
        return opinion;
    }

    public void setOpinion(String opinion) {
        this.opinion = opinion;
    }
}
