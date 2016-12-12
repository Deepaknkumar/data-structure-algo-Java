package C3;

/**
 * Created by Deepak on 12/12/2016.
 */
public class GameEntry {
    private String name;
    private int score;

    public GameEntry(String n,int s){
        this.name = n;
        this.score = s;
    }

    public String getName(){
        return this.name;
    }

    public int getScore(){
        return this.score;
    }

    public String toString(){
        return "(" + name + "," + score + ")";
    }
}
