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
public class Cooler extends Fan {
    
    private String coolerCompany;

    public Cooler(String coolerCompany, int noOfWings, int coils) {
        super(noOfWings, coils);
        this.coolerCompany = coolerCompany;
    }

    @Override
    public String toString() {
        return "Cooler{" + "coolerCompany=" + coolerCompany + '}';
    }  
}
