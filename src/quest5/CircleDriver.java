/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest5;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class CircleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Answer for question5 : sai kiran reddy Enugala");
        ComparableCircle c1 = new ComparableCircle(25.5);
        ComparableCircle c2 = new ComparableCircle(2.5);
        if (c1.compareTo(c2) > 0) {
            System.out.println("The area of ​​the first circle is greater than second circle.");
        } else if (c1.compareTo(c2) < 0) {
            System.out.println("The area of ​​the first circle is less than second circle.");
        } else {
            System.out.println("The area of ​​the first circle is same as second circle.");
        }
    }

}
