/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest7;

import java.util.Scanner;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class RandomInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     System.out.println("Answer for question7 : sai kiran reddy Enugala");   
        Scanner input = new Scanner(System.in);

		int[] array = getArray();

		// Prompt the user to enter the index of the array
		System.out.print("Enter the index of the array: ");
		try {
			// Display the corresponding element value
			System.out.println("The corresponding element value is " + 
				array[input.nextInt()]);
		}
		catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Out of Bounds.");
		}
	}

	
	public static int[] getArray() {
		int[] array = new int[100];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 100) + 1;
		}
		return array;
    }
    
}
