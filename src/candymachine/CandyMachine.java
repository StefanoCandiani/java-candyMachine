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
        System.out.println("$"+money+", that's all? \n"
                                +"Well, lemme tell ya what we got here.");
        System.out.println("");
        double cost = 0;
        cost += machine();
        dispense(money, cost);
    }
    private static double machine(){
        System.out.println("A       $1.00  Kinder Bueno\n"
                          +"B       $0.25  Wrapped Brazilian \"brigadeiro\"\n"
                          +"C       $0.10  Small Gummy Bear Packer\n"
                          +"D       $3.00  Clif Energy Bar\n"
                          +"E       $0.20  Coca-Cola Candy\n"
                          +"F       $2.00  Loacker Wafer Hazelnut\n"
                          +"G       $1.50  Brownie");
        System.out.println("");
        System.out.print("    So, what can I get you? > ");
        char choice = uI.next().toUpperCase().charAt(0);
        if(choice == 'A'){
        return 1.00;     
        }
        else if(choice == 'B'){
            return 0.25;
        }
        else if(choice == 'C'){
            return 0.10;
        }
        else if(choice == 'D'){
            return 3.00;
        }
        else if(choice == 'E'){
            return 0.20;
        }
        else if(choice == 'F'){
            return 2.00;
        }
        else if(choice == 'G'){
            return 1.50;
        }
        else{
            return 0;
        }
    }
    
    private static void dispense(double moneyInserted, double candyCost){
        double change = moneyInserted - candyCost;
        System.out.println("");
        if(change >= 0){
            System.out.println("Thank you for shopping with us.\n"
                              +"Please take your candy, and your $"+change+" change!");
        }
        else{
            System.out.println("Sorry, you can't afford that, please choose something else\n"
                              +"You have $"+moneyInserted+" and the cost is $"+candyCost);
        }
    }
}
