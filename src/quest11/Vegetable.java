/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest11;

import java.util.Objects;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class Vegetable {
    /**
     * attributes name stores vegetable name ,calories stores number of calories gained.
     */
    
    public String Name;

    /**
     *
     */
    public double calories;

    /**
     *
     * @param Name
     * @param calories
     */
    public Vegetable(String Name, double calories) {
        this.Name = Name;
        this.calories = calories;
    }

    /**
     * to get name
     * @return
     */
    public String getName() {
        return Name;
    }

    /**
     * to get calories
     * @return calories
     */
    public double getCalories() {
        return calories;
    }
   /**
    we have overrided the hashcode, so it returns the hash of vegitable name and calories,
    if there are two objects of type vegetable with same data  then the resulting 
    hash will be same for both the objects .
    *@return hashcode.
    */
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.Name);
        hash = 73 * hash + (int) (Double.doubleToLongBits(this.calories) ^ (Double.doubleToLongBits(this.calories) >>> 32));
        return hash;
    }
    
    
    
   

    /**
     * Here in this method, equals method is overrided to check only the Vegetable
     * object's attributes name and calories data whenever we compare two objects.
     * So if we compare two objects of Vegetable class with equals method, then
     * this method returns true if both the objects atrributes have the same
     * value
     * @param obj
     * @return
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vegetable other = (Vegetable) obj;
        if (Double.doubleToLongBits(this.calories) != Double.doubleToLongBits(other.calories)) {
            return false;
        }
        if (!Objects.equals(this.Name, other.Name)) {
            return false;
        }
        return true;
    }
    
    
    
}
