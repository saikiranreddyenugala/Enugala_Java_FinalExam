/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest6.example1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class CheckedException {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question6 example1 : sai kiran reddy Enugala");
        try {
            System.out.println("Trying to fetch file which is not present..");
            Scanner scan = new Scanner(new File("rawData.txt"));
            System.out.println(scan.next());
            
        }catch (FileNotFoundException io) {
            System.out.println(io.getMessage());
        }catch(Exception iio){
            System.out.println(iio.getMessage());
        }
    }

}
