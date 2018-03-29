
/**
 * Write a description of class Soccer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Soccer extends Sport
{
    private int shots, saves, headers;


    public Soccer()
    {
        //super();
        
        shots = Extra.askInt("How many shots did they have?", "Please give a number.");
        saves = Extra.askInt("How many saves did they have?", "Please give a number.");
        headers = Extra.askInt("How many headers did they have?", "Please give a number.");
    }

    public String toString()
    {
        String temp = super.toString();
        
        temp += "\nPersonal Stats:\nShots:\t"+shots+"\nSaves:\t"+saves+"\nHeaders:\t"+headers;
        return temp;
    }
}
