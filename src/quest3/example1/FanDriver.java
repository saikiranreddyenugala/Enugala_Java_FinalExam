/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest3.example1;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class FanDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question3 example1 : sai kiran reddy Enugala");

//        Fan f = new Fan(3, 4);
        Cooler c = new Cooler("Samsung", 3, 6);
        Fan f = c;//implciit casting
       
        Cooler c1=(Cooler)f; //Explicit Casting

//        Cooler f2 = new Cooler("Whirpool", 4, 10);

        System.out.println(c);
        System.out.println(c1);
    }

}
