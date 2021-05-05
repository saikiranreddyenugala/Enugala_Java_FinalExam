/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest2;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public  class GeometricObject implements Colorable{
    private double side;

    public GeometricObject(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
   public double calculateArea(){
        return getSide()*getSide();
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides"); 
    }
    
    
}
