/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest9.example1;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class BeerDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                System.out.println("Answer for question9 example1 : sai kiran reddy Enugala");

        Beer b1 = new Beer("Carlsberg");
        b1.setAlcoholPercentage(6);
        
        System.out.println(b1);
        System.out.println("we will get exception here");
        Beer b2 = new Beer("Bud Light");
        b1.setAlcoholPercentage(0);
    }
    
}
