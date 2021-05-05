/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest3.example2;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class VehicleRpm {
    
    public static void main(String[] args){
        
         System.out.println("Answer for question3 example2 : sai kiran reddy Enugala");
        double rpm = 400.2;
        System.out.println("rpm before conversion"+ rpm);
        
        int rpmInt = (int)rpm;// explicit casting
        System.out.println("rpm after converting into int is "+rpm);
        
        int divisor = 4;
        System.out.println("The value of divisor before conversion is"+ divisor);
        double divisorDouble = divisor;//implicit casting
        System.out.println("The value of divisor after conversion is"+ divisorDouble);
        
    }
    
}
