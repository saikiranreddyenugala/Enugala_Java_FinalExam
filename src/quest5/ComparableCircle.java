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
public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle(double radius) {
        super(radius);
    }

    public double area() {
        return super.areaOfCircle();
    }

    @Override
    public int compareTo(ComparableCircle c) {
        // TODO Auto-generated method stub
        if (area() > c.area()) {
            return 1;
        } else if (area() < c.area()) {
            return -1;
        } else {
            return 0;
        }
    }
}
