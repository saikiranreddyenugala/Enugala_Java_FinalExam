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
public class Fan {
    
    private int noOfWings;
    private int coils;

    public Fan(int noOfWings, int coils) {
        this.noOfWings = noOfWings;
        this.coils = coils;
    }

    @Override
    public String toString() {
        return "Fan{" + "noOfWings=" + noOfWings + ", coils=" + coils + '}';
    }    
}
