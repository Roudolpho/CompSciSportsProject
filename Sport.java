import java.util.*;
public class Sport
{
    private int[] record = new int[2];
    private String position, years;
    private Scanner in = new Scanner(System.in);
    
    public Sport() {
        System.out.println("What is their position?");
        position = in.nextLine();
        record[0] = Extra.askInt("How many games did they win?", "Thats not a number, please enter a number");
        record[1] = Extra.askInt("How many games did they lose?", "Thats not a number, please enter a number");
        System.out.println("How long have they been playing?");
        years = in.nextLine();
    }
    
    public String toString() {
        String temp = "";
        temp += "\n\nPosition:\t"+position+"\nYears:\t"+years+"\nWins:\t"+record[0]+"\nLoses:\t"+record[1];
        return temp;
    }
}
