import java.util.Scanner;

public class Game {
   private Scanner input = new Scanner(System.in);

   public void start(){
       System.out.println("Welcome to our text-based adventure game.\n" + "*".repeat(40));
       System.out.print("Please Enter Your Name: ");
       String name = input.next();
       Player player = new Player(name);
       System.out.println("*".repeat(40)+ "\nHello " + player.getPlayerName() + " :)\nAre you ready to embark on an adventurous journey?\n" +
               "If you are an adventurer, choose your character now\n" +
               "fight monsters and buy new items that will make you stronger\n" +
               "*".repeat(40));
       System.out.println("CharName\t\tID\tHealth\tDamage\tGold\n" +"-".repeat(45) +
               "\nSamurai\t\t\t1\t\t21\t\t5\t\t15");


   }

}
