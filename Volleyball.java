
/**
 * Write a description of class Volleyball here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Volleyball extends Sport
{

    private int blocks, kills, aces, sets, hits, digs;
    private int netViolation, footFault;
    private String height, reach, verticle;

    Scanner s = new Scanner(System.in);

    public Volleyball()
    {
        System.out.println("How tall are they?");
        height = s.nextLine();
        System.out.println("What is their reach?");
        reach = s.nextLine();
        System.out.println("What is their verticle?");
        verticle = s.nextLine();
       
        blocks = Extra.askInt("How many blocks did they have?", "Enter Number of blocks");
        hits  = Extra.askInt("How many hits did they have?", "Enter Number of hits");
        kills = Extra.askInt("How many kills did they have?", "Enter Number of kills");
        aces = Extra.askInt("How many aces did they have?", "Enter Number of aces");  
        sets = Extra.askInt("How many assists/sets did they have?", "Enter Number of assists/sets");
        digs = Extra.askInt("How many digs/passes did they have?", "Enter Number of digs/passes");
             
        netViolation = Extra.askInt("How many net violations did they have?", "Enter Number of net violations");
        footFault  = Extra.askInt("How many foot faults did they have?", "Enter Number of foot faults");
       
    }
    

    public String toString()
    {
       String vballThings = super.toString();
        
        vballThings += "\n\nPersonal Stats:\n Height:  " + height+ "\n Reach:  " +reach+ "\n Verticle:  "+ verticle;
        vballThings+="\n\n Game Stats:\n Blocks:  "+blocks+ "\n Hits:  "+hits+ "\n Kills:  "+ kills+ "\n Aces:  "+aces+ "\n Assists/Sets:  "+sets+ "\n Digs/Passes:  "+digs;
        vballThings+= "\n\n Penalty Stats:\n Net Violations:  " + netViolation+ "\n Foot Faults:  "+ footFault;
        return vballThings;
        
       
    }
}
