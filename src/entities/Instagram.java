package entities;

public class Instagram extends Socialmedia{
    private boolean story;

    public Instagram(int id, String name, String email, String username, String password,Boolean story) {
        super(id, name, email, username, password);
        this.story=story;

    }

    public boolean getStory() {
        return story;
    }

    public void setStory(boolean story) {
        this.story = story;
    }
}
