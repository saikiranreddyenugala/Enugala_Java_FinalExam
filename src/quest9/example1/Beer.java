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
public class Beer {

    private String beerName;
    private double alcoholPercentage;

    public Beer(String beerName) {
        this.beerName = beerName;
    }

    public void setAlcoholPercentage(double alcoholPercentage) {
        if (alcoholPercentage <= 0) {
            throw new IllegalArgumentException("Alcohol percentage cannot be "
                    + "less than or equal to zero");
        }
        this.alcoholPercentage = alcoholPercentage;
    }

    @Override
    public String toString() {
        return "Beer{" + "beerName=" + beerName + ", alcoholPercentage=" + alcoholPercentage + '}';
    }

}
