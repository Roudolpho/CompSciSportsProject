import java.util.*;
public class Sport
{
    private int[] record = new int[2];
    private String position;
    private Scanner in = new Scanner(System.in);
    
    public Sport() {
        System.out.println("What is their position?");
        position = in.nextLine();
        System.out.println("How many games did they win?");
        record[0] = in.nextInt();
        System.out.println("How many games did they lose?");
        record[1] = in.nextInt();
    }
    
    
}
