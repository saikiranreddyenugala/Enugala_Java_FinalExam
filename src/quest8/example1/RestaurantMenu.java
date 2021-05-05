/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest8.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class RestaurantMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException,IOException {
        // TODO code application logic here
        System.out.println("Answer for question8 example1 : sai kiran reddy Enugala");
        try
        {
            System.out.println("Trying to open Restaurant Menu");
            Scanner scan = new Scanner(new File("menu.txt"));
        }
        catch(FileNotFoundException fnf){
            System.out.println(fnf.getMessage());
        }
    }
    
}
