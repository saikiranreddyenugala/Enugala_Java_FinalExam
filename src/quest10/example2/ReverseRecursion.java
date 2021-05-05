/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest10.example2;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class ReverseRecursion {

    /**
     * @param args the command line arguments
     */
    public static void ReverseNumber(int x) {

        // base condition to end recursive calls
        if (x < 10) {
            System.out.println(x);
            return;
        } else {

            // print the unit digit of the given number
            System.out.print(x % 10);

            // calling function for remaining number other
            // than unit digit
            ReverseNumber(x / 10);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question10 example2: sai kiran reddy Enugala");
        int num = 23456;
        System.out.print("Reversed Number: ");

        // calling recursive function 
        // to print the number in
        // reversed form
        ReverseNumber(num);
    }
}
