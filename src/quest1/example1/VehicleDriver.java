/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest1.example1;
/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class VehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Answer for question1 interface example1: sai kiran reddy Enugala");
         Car car = new Car();
        car.changeGear(4);
        car.speedUp(3);
        car.applyBrakes(2);
        car.ownerName("John Wick");
          
        System.out.println("Car present details :");
        car.printDetails();
          
    }
    
}
