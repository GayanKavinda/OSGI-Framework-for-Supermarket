package com.mtit.service;

import java.util.Scanner;

public class ServicePublish_HotelMainImpl implements ServicePublish_HotelMain{


	public static Scanner input = new Scanner(System.in);
    public static String again;
    public static int choose,quantity=1;
    public static double total=0,pay;



@Override //informs the compiler that the element is meant to override an element declared in a superclass
public void order() { //order method
	
	System.out.println("\t\t\t\t+===================================+");
    System.out.println("\t\t\t\t           ITEM MENU Price per(Plate)     ");
    System.out.println("\t\t\t\t   1. Chiken Biriani             		:			 Rs. 550.00");
    System.out.println("\t\t\t\t   2. Deviled Sweet and Sour Fish Curry :            Rs. 300.00");
    System.out.println("\t\t\t\t   3. Deep Fried Chicken Fried Rice     :       	 Rs. 760.00");
    System.out.println("\t\t\t\t   4. Cheese Kottu            			:			 Rs. 480.00");
    System.out.println("\t\t\t\t   5. CANCEL                         ");
    System.out.println("\t\t\t\t+====================================+");
	
}





@Override
public void menu() { //called menu method
	
	
	System.out.println("Press 1 to Chiken Biriani , Press 2 to Deviled Sweet and Sour Fish Curry , Press 3 to Deep Fried Chicken Fried Rice and Press 4 to Cheese Kottu and Press 5 to Cancel");
    System.out.print("Press you want to buy? :");
    choose = input.nextInt();
    //conditions
    if(choose==1){
        System.out.println("You choose Chiken Biriani");
        System.out.print("How Much Dhal you want to Buy?(Plates) :");
        quantity =input.nextInt();	//equation
        total = total +(quantity*550);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){ //used to compare a specified String to another String, ignoring case considerations.
            order();
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble(); //used to scan the next token of the input as a double. If the translation is successful, the scanner past the input that matched.
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);	//checking equation for matching the input amount
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
    }else if(choose==2){
        System.out.println("You choose Deviled Sweet and Sour Fish Curry");
        System.out.print("How much Suger you want to Buy?(Plates) :");
        quantity =input.nextInt();
        total = total +(quantity*300);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
      }else if(choose==3){
        System.out.println("You choose Deep Fried Chicken Fried Rice");
        System.out.print("How much Wheat flour you want to Buy?(Plates) :");
        quantity =input.nextInt();
        total = total +(quantity*760);
        
        System.out.println("You want to buy again? ");
        System.out.println("Press Y for Yes and N for No : ");
        again = input.next();
        if(again.equalsIgnoreCase("Y")){
            order();
        }else{
            System.out.println("Enter a payment ");
            pay = input.nextDouble();
            if(pay <=total){
              System.out.println("Not enough payment");
            }else{
            System.out.println("Total price is " + total);
            total = pay-total;
            System.out.println("The change is " + total);
            }
        }
      }else if(choose==4){
          System.out.println("You choose Cheese Kottu");
          System.out.print("How much Wheat flour you want to Buy?(Plates) :");
          quantity =input.nextInt();
          total = total +(quantity*480);
          
          System.out.println("You want to buy again? ");
          System.out.println("Press Y for Yes and N for No : ");
          again = input.next();
          if(again.equalsIgnoreCase("Y")){
              order();
          }else{
              System.out.println("Enter a payment ");
              pay = input.nextDouble();
              if(pay <=total){
                System.out.println("Not enough payment");
              }else{
              System.out.println("Total price is " + total);
              total = pay-total;
              System.out.println("The change is " + total);
              }
          }
    }else if(choose==5){
        System.exit(0);
    }else{
        System.out.println("Choose 1 to 5 only!");
        order();
    }
	
}




}
