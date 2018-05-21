

public class Model {
    private String hello;
    private String world;
    private String sentence;

    public String concatenateWords(String word1, String word2) {
        return sentence = word1 + " " + word2;
    }

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
            this.hello = hello;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public String getSentence() {
        return sentence;
    }
}
