/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest11;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class VegetableDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question11 : sai kiran reddy Enugala");
        
        Vegetable v1 = new Vegetable("Carrot",50);
        Vegetable v2 = new Vegetable("Mushrooms",25);
        Vegetable v3 = new Vegetable("Broccoli",40);
        Vegetable v4 = new Vegetable("Cauliflower",30);
        Vegetable v5 = new Vegetable("Broccoli",40);
        Vegetable v6 = new Vegetable("Cauliflower",30);
        Vegetable v7 = new Vegetable("Sweet Corn",20);
        
        Vegetable v8= v3;
        
        /**
         * Here we are comparing the two objects v1 and v2 by invoking the equals
         * method, this will call the equals method from Vegetable since we have 
         * overrided the method
         */
        System.out.println("**************.equals**********************");
        System.out.println("v1 equals v2:" + v1.equals(v2));
        System.out.println("v2 equals v3:" + v2.equals(v3));
        System.out.println("v3 equals v4:" + v3.equals(v4));
        System.out.println("v3 equals v5:" + v3.equals(v5));
        System.out.println("v4 equals v6:" + v4.equals(v6));
        System.out.println("v8 equals v3:" + v8.equals(v3));
        
        
        /**
         * The == checks the addresses of the object and returns true if the 
         * objects has the same address
         */
        System.out.println("*****************==***********************");
        System.out.println(v1 == v2);
        System.out.println(v2 == v3);
        System.out.println(v3 == v4);
        System.out.println(v3 == v5);
        System.out.println(v4 == v6);
        System.out.println(v8 == v3);
        
        /**
         * calling the hashcode of an object return the hash based upon vegetablename
         * and calories as the hashcode is overrided in Vegetable in such a way
         * that it returns the hash based upon the data of attributes
         */
        System.out.println("*****************hash code*****************");
        System.out.println("v1: " + v1.hashCode());
        System.out.println("v2: " + v2.hashCode());
        System.out.println("v3: " + v3.hashCode());
        System.out.println("v4: " + v4.hashCode());
        System.out.println("v5: " + v5.hashCode());
        System.out.println("v6: " + v6.hashCode());
        
        
    }
    
}
