package personal;

/**
 * Hello world!
 *
 */
import java.util.*;
public class App 
{
    public static void main( String[] args )
    {
	Scanner sc = new Scanner(System.in);
        System.out.println("Welcome!" );
	System.out.println("What is your name: ");
	String name = sc.nextLine();
	System.out.println("Hi, "+name);
    }
}
