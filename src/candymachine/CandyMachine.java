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
        String choice = machine();
        double cost = 0;
        cost += costAdd(choice);
        if (cost > 0){
            System.out.println(money);
        }
        //else if (cost <= 0){
       //     System.out.println("Sorry you have not chosen a correct candy, please try again");
       // }
    }
    private static String machine(){
        System.out.println("A       $1.00  Kinder Bueno\n"
                          +"B       $0.25  Wrapped Brazilian \"brigadeiro\"\n"
                          +"C       $0.10  Small Gummy Bear Packer\n"
                          +"D       $3.00  Clif Energy Bar\n"
                          +"E       $0.20  Coca-Cola Candy\n"
                          +"F       $2.00  Loacker Wafer Hazelnut\n"
                          +"G       $1.50  Brownie");
        System.out.print("    So, what can I get you? > ");
        uI.next();
        String choice = uI.nextLine();
        return choice;
    }
    
    private static double costAdd(String choice){
         if(choice.equalsIgnoreCase("A")){
        return 1.00;     
        }
        else if(choice.equalsIgnoreCase("B")){
            return 0.25;
        }
        else if(choice.equalsIgnoreCase("C")){
            return 0.10;
        }
        else if(choice.equalsIgnoreCase("D")){
            return 3.00;
        }
        else if(choice.equalsIgnoreCase("E")){
            return 0.20;
        }
        else if(choice.equalsIgnoreCase("F")){
            return 2.00;
        }
        else if(choice.equalsIgnoreCase("G")){
            return 1.50;
        }
        else{
            return -1;
        }
    }
}
