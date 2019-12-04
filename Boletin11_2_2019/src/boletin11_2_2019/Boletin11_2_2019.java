/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11_2_2019;

/**
 *
 * @author david
 */
public class Boletin11_2_2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Prueba1 a = new Prueba1();
        
        a.setNom("La divina comedia");
        a.setAutor("Dante");
        a.setDuradaSegons(60);
        
        System.out.println("El nomre de la obre es : " +a.getNom()+"\nEl autor es : "+a.getAutor()+"\nTardo en escribirla = "+a.getDuradaSegons()+" horas");
        
        
        
    }
    
}
