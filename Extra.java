import java.util.*;
public class Extra
{
    private static Scanner in = new Scanner(System.in);

    public static int askInt(String question,String err) {
        System.out.println(question);
        String temp2 = in.nextLine();
        while(!isInteger(temp2)) {
            System.out.println(err);
            temp2 = in.nextLine();
        }
        return Integer.parseInt(temp2);
    }

    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }

}
