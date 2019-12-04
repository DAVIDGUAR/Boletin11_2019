/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_1_2019;

/**
 *
 * @author david
 */
public class Boletin11_1_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ClaseA a =  new ClaseA ( ) ;
        ClaseA b =  new ClaseA ( 20 ) ;
        ClaseA c =  new ClaseA ( 20 , 40 ) ;
        System.out.println("El objeto a:  contiene:"  + a.getValorPrimari()  +  ","  + a.getValorSecundari());
        System.out.println("El objeto b:  contiene:"  + b.getValorPrimari()  +  ","  + b.getValorSecundari());
        System.out.println("El objeto a:  contiene:"  + c.getValorPrimari()  +  ","  + c.getValorSecundari());
    }
    
}
