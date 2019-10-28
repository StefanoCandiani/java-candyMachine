/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package candymachine;

import java.util.Scanner;

/**
 *
 * @author mlarrubia
 */
public class CandyMachine {

    static Scanner uI = new Scanner(System.in);
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Welcome to CHS's Comptuer Candy Machine!");
        System.out.println("All candy provided is virtual.");
        
        System.out.print("How much money do ya got? > $");
        double money = uI.nextDouble();
        System.out.println(money+", that's all? \n"
                                +"Well, lemme tell ya what we got here.");
        machine(money);
    }
    private static void machine(double dollars){
        System.out.println("A       $1.00  Kinder Bueno\n"
                          +"B       $0.25  Wrapped Brazilian \"brigadeiro\"\n"
                          +"C       $0.10  Small Gummy Bear Packer\n"
                          +"D       $3.00  Clif Energy Bar\n"
                          +"E       $0.20  Coca-Cola Candy\n"
                          +"F       $2.00  Loacker Wafer Hazelnut\n"
                          +"G       $1.50  Brownie");
        System.out.print("    So, what can I get you? > ");
        uI.next();
        char choice = (uI.nextLine()).charAt(0);
        
        if(choice == 'A'){
            System.out.println(choice);
            if(dollars >= 1.0){
                System.out.println("Thank you for purchasing candy with us.");
                double change = dollars - 1.0;
                System.out.println("Please take your candy, and your change is $"+change+"\n"
                                  +"Have a nice day :D");
            }
            else{
                System.out.println("Sorry, you don't have enough money.\n"
                                  +"Have a nice day :D");
            }
        }
        else if(choice == 'B'){
            if(dollars >= 0.25){
                
            }
        }
    }
}
