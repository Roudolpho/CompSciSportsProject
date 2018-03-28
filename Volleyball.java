
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
    private int netViolation, footFault, injuries;
    private int height, reach, verticle, blockJump, approachJump;

    Scanner s = new Scanner(System.in);

    public Volleyball()
    {
        System.out.println("How tall are they (inches)?");
        height = s.nextInt();
        System.out.println("What is their reach?");
        reach = s.nextInt(); 
        System.out.println("What is their verticle?");
        verticle = s.nextInt(); 
        System.out.println("What is their block jump?");
        blockJump = s.nextInt();
        System.out.println("What is their approch jump?");
        approachJump = s.nextInt();
      
       
        
        System.out.println("How many block did they have?");
        blocks = s.nextInt();
        System.out.println("How many games did they have?");
        hits  = s.nextInt();
        System.out.println("How many kills did they have?");
        kills = s.nextInt();
        System.out.println("How many aces did they have?");
        aces = s.nextInt();
        System.out.println("How many assists/sets did they have?");
        sets = s.nextInt();        
        System.out.println("How many digs/passes did they have?");
        digs = s.nextInt();
        
        System.out.println("How many net violations did they have?");       
        netViolation = s.nextInt();
        System.out.println("How many foot faults did they have?");
        footFault  = s.nextInt();
        System.out.println("How many injuries did they have?");
        injuries = s.nextInt();
    }


    public String toString()
    {
        String vballThings;
        
        vballThings = "Personal Stats:\n Height:  " + height+ "\n Reach:  " +reach+ "\n Verticle:  "+ verticle+ "\n Block Jump:  " +blockJump + "\n Approach Jump:  " + approachJump;
        vballThings+="\n\n Game Stats:\n Blocks:  "+blocks+ "\n Hits:  "+hits+ "\n Kills:  "+ kills+ "\n Aces:  "+aces+ "\n Assists/Sets:  "+sets+ "\n Digs/Passes:  "+digs;
        vballThings+= "\n\n Penalty Stats:\n Net Violations:  " + netViolation+ "\n Foot Faults:  "+ footFault+ "\n Injuries:  "+ injuries;
        return vballThings;
    }
}
