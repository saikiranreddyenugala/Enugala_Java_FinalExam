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
public class GeometricDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question2 : sai kiran reddy Enugala");
        GeometricObject[] geoArray = new GeometricObject[5];
        GeometricObject go1 = new Square(true, 2.5);
        GeometricObject go2 = new Square(false, 3.0);
        GeometricObject go3 = new Square(true, 3.5);
        GeometricObject go4 = new Square(false, 2.0);
        GeometricObject go5 = new Square(true, 4.0);
        geoArray[0] = go1;
        geoArray[1] = go2;
        geoArray[2] = go3;
        geoArray[3] = go4;
        geoArray[4] = go5;

       
        for (GeometricObject obj : geoArray) {
            Square s = (Square) (obj);
            if (s.isColorable()) {
                System.out.println("**********************");
                s.howToColor();
            } else {
                System.out.println("This square is not colorable");

            }
            System.out.println("The Area of square is "
                    + Math.round(s.calculateArea() * 100) / 100.0);
            System.out.println("**********************");
        }

    }

}
