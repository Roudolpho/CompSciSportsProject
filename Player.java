import java.util.*;
public class Player
{
    private String name;
    private String gender;
    private Sport stats;
    private Scanner in = new Scanner(System.in);
    private String[] sports = {"volleyball","soccer","lacrosse"};
    
    public Player() {
        System.out.println("What is the player's name?");
        name = in.nextLine();
        System.out.println("What is the player's identified gender?");
        gender = in.nextLine();
        String sportType
        
        sportType = checkSport();
        switch(sportType.toLowerCase()) {
            case "volleyball":
                stats = new Volleyball();
            
            case "soccer":
                stats = new Soccer();
            
            case "lacrosse":
                stats = new Lacrosse();
            
        }
    }
    
    private boolean checkSport() {
        
    }
}
