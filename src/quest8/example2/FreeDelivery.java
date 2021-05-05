/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest8.example2;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class FreeDelivery {
    private double amount;

    public FreeDelivery(double amount) {
        this.amount = amount;
    }
    public int discount(){
        if(amount>100){
            return 10;
        }
        else{
            throw new IllegalArgumentException("Amount should be greater than 100 to get discount");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question8 example2 : sai kiran reddy Enugala");
        try{
            
        FreeDelivery fd = new FreeDelivery(200);
            System.out.println("The discount is:");
            System.out.println(fd.discount());
        FreeDelivery fd1 = new FreeDelivery(80);
        
            System.out.println(fd1.discount());    
        }
        catch(IllegalArgumentException ia){
            System.out.println(ia.getMessage());
        }
    }
    
}
