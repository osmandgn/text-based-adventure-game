import java.util.Scanner;

public class Game {
   private Scanner input = new Scanner(System.in);

   public void start(){
       System.out.println("*".repeat(40) +"\nWelcome to our text-based adventure game.\n" + "*".repeat(40));
       System.out.print("Please Enter Your Name: ");
       String name = input.next();
       System.out.println("Hello " + name + " :)");


   }

}
