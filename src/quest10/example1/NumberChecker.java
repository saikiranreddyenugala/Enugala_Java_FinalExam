/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest10.example1;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class NumberChecker {

    static int NumberChecker(int nmbr) {
        if (nmbr < 200) {
            return 20;
        }
        return 10 + NumberChecker(nmbr - 50);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question10 example1: sai kiran reddy Enugala");
        System.out.println("After calling recursively the output is:");
        System.out.println(NumberChecker(200));

    }

}
