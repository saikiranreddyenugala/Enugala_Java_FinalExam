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
public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    public double areaOfCircle(){
        return Math.PI*getRadius()*getRadius();
    }
 
}
