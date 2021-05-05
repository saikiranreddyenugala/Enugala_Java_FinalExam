/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quest6.example2;

/**
 *
 * @author Sai Kiran Reddy Enugala
 */
public class UncheckedException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Answer for question6 example2 : sai kiran reddy Enugala");
        try{
            int x=13;
            if(x%2!=0){
                System.out.println("Will get exception here because 13 is odd");
                throw new IllegalArgumentException("Number should get remainder 0");
            }else{
                System.out.println("the product is "+ (x*10));
            }
        }
        catch(IllegalArgumentException i){
            System.out.println(i.getMessage());
        }
    }
    
}
