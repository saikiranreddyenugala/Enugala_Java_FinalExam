/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest1.example1;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class Car implements Vehicle, Owner {

    int speed;
    int gear;
    String ownerName;

    @Override
    public void changeGear(int newGear) {
        gear = newGear;
    }

    @Override
    public void speedUp(int speedIncrement) {
        speed = speed + speedIncrement;
    }

    @Override
    public void applyBrakes(int speedDecrement) {
        speed = speed + speedDecrement;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void printDetails() {
        System.out.println("speed: " + speed
                + " gear: " + gear + "owner: " + ownerName);
    }

    @Override
    public void ownerName(String ownerName) {
        this.ownerName = ownerName;
    }

}
