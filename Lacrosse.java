
/**
 * Write a description of class Lacrosse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Lacrosse extends Sport
{
    private int shots, saves, headers;

    /**
     * Constructor for objects of class Lacrosse
     */
    public Lacrosse()
    { shots = Extra.askInt("How many shots did they have?", "Please give a number.");
        saves = Extra.askInt("How many saves did they have?", "Please give a number.");
        headers = Extra.askInt("How many ground balls did they have?", "Please give a number.");
    }

    public String toString()
    {
        String temp = super.toString();

        temp += "\nPersonal Stats:\nShots:\t"+shots+"\nSaves:\t"+saves+"\nGround Balls:\t"+headers;
        return temp;
    }

}
