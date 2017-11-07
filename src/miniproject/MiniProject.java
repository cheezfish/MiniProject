package miniproject;

import java.util.Scanner;
/**
 * @author Imran Aziz 18:05 6/11/17
 */
public class MiniProject {

    public static void main(String[] args) 
    {
        Question();
    }
    
    public static void Question()
    {
        int answer = 0000;
        System.out.println("When did Queen release their debut album?");
        Scanner scan = new Scanner(System.in);
        try
        { //blocks answers that aren't integers
            answer = Integer.parseInt(scan.nextLine());
        }
        catch(IllegalArgumentException ex) 
        {
            System.out.println("Nope, use a number, and a sensible one at that");
        }
        System.out.println("Did you guess?");
    }
    
}
