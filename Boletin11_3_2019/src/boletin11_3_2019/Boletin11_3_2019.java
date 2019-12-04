/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_3_2019;

/**
 *
 * @author david
 */
public class Boletin11_3_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Prueba2 a = new Prueba2();
        
        a.setAny(1800);    // si cambias el orden de la introduccion de datos, osea metes primero el dia y despues el año, el filtro no funciona
        a.setMes(2);
        a.setDia(29);
        
        
        System.out.println(a.getAny());
        System.out.println(a.getMes());
        System.out.println(a.getDia());
    }
    
}
