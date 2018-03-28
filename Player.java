import java.util.*;
public class Player
{
    private String name, gender, sport;
    private Sport stats;
    private Scanner in = new Scanner(System.in);
    private String[] sports = {"volleyball","soccer","lacrosse"};
    
    public Player() {
        System.out.println("What is the player's name?");
        name = in.nextLine();
        System.out.println("What is the player's identified gender?");
        gender = in.nextLine();
        String sportType = "";
        System.out.println("What sport do they play?");
        sportType = in.nextLine();
        while(!checkSport(sportType)) {System.out.println("Not a valid option, try again.");sportType = in.nextLine();}
        sport = sportType;
        switch(sportType.toLowerCase()) {
            case "volleyball":
                stats = new Volleyball();
            break;
            case "soccer":
                stats = new Soccer();
            break;
            case "lacrosse":
                stats = new Lacrosse();
            break;
        }
        System.out.println("\f");
    }
    
    private boolean checkSport(String test) {
        for(int i = 0;i<sports.length;i++){
            if(test.equalsIgnoreCase(sports[i])) {return true;}
        }
        return false;
    }
    
    public String toString() {
        String temp = "";
        temp += "Name:\t"+name+"\nGender:\t"+gender+"\nSport:\t"+sport+"\n"+stats.toString();
        return temp;
    }
}
