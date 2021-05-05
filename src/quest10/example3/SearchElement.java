/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest10.example3;

import java.util.Scanner;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class SearchElement {
    public static boolean searchEle(int[] myAr, int ele, int size){
      if (size == 0){
         return false;
      }
      if (myAr[size-1] == ele){
         return true;
      }
      return searchEle(myAr, ele, size-1);
   }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Answer for question10 example3: sai kiran reddy Enugala");
         System.out.println("Enter the required size: ");
      Scanner s = new Scanner(System.in);
      int size = s.nextInt();
      int myAr[] = new int [size];
      System.out.println("Enter the elements  ");
      for(int i=0; i<size; i++){
         myAr[i] = s.nextInt();
      }
      System.out.println("Enter the search element: ");
      int target = s.nextInt();
      boolean bool = searchEle(myAr, target ,size);
      if(bool){
         System.out.println("found the Element");
      }else{
         System.out.println("didn't found the element");
      }
    }
    
}
