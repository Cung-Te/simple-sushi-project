import java.util.Scanner; 

public class SimpleSushiProject{

   public static void main(String [] args){
   
   Scanner keyboard = new Scanner(System.in);
   final double CAL_PRICE = 5; 
   final double SHRIMP_PRICE = 6;
   final double TUNA_PRICE= 7; 
   final double SALMON_PRICE = 8;
   int menu = 0; 
   
   String name = "";
   int item = 0;
   double price = 0.00;
   String input;
   char answer;
   
   do {
   System.out.println("What is your name? ");
   name = keyboard.nextLine();
   
   System.out.println("Here are the menu for sushi .....\n");
   System.out.println("1. California roll \n2.Vege roll \n3.spicy roll");
   menu = keyboard.nextInt();
   
   keyboard.nextLine();
   switch (menu){
   
   case 1: 
   System.out.println("You order california roll, I will done this in 3 minutes! " + 
                      "\n and it's " + CAL_PRICE );
   break; 
   
   case 2: 
   System.out.println("Out of order!!!!");
   break; 
   case 3:
   System.out.println("there are 3 spicy roll: Please enter one of these:  \n1.shrimp \n2.Tuna and \n.3.Salmon");
   item = keyboard.nextInt();
   
   while (item >= 4){
      System.out.println("Invalid, please enter 1,2 or 3.");
      item = keyboard.nextInt();
   }

   }
      keyboard.nextLine();
     
    if (item == 1){
    price = SHRIMP_PRICE;
    System.out.printf("You order spicy shrim roll. Its $%.2f" , price);
    }
    else if (item == 2 ){
    price = TUNA_PRICE;
    System.out.printf("You order spicy tuna roll. Its $%.2f" , price);
   }

   else if (item == 3){
   price = SALMON_PRICE;
   System.out.printf("You order spicy salmon. It's $%.2f ", price );   
   }
   
   System.out.println("\n\nWould you like to go over?");
   System.out.println("Please enter Y for yes or y for yes");

   input = keyboard.nextLine();
   answer = input.charAt(0);
   
   } while (answer == 'Y' || answer == 'y');
   

}
}
