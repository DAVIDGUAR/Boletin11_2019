/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_4_2019;

/**
 *
 * @author david
 */
public class Boletin11_4_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ComplexNumber obj = new ComplexNumber(5.0, 10.2);
        ComplexNumber obj2 = new ComplexNumber(9.0, 1.2);
        ComplexNumber obj3 = obj.add(obj2);
        
        
        System.out.println(obj.toString());
        System.out.println(obj2.toString());
         System.out.println(obj3.toString());
        
        System.out.println( obj.getImaginary());
        System.out.println(obj3.zero);
        System.out.println(obj3.imaginary);
        
    }
    
}
