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
<<<<<<< HEAD
        String sportType = "";
        while(checkSport(sportType)) {sportType = in.nextLine();}
=======
        String sportType;
>>>>>>> db3e4dafd2e3457bb2c1eff7a4b8414709320e7c
        
        switch(sportType.toLowerCase()) {
            case "volleyball":
                stats = new Volleyball();
            
            case "soccer":
                stats = new Soccer();
            
            case "lacrosse":
                stats = new Lacrosse();
            
        }
    }
    
    private boolean checkSport(String test) {
        for(int i = 0;i<sports.length;i++){
            if(test.equalsIgnoreCase(sports[i])) {return true;}
        }
        return false;
    }
}
