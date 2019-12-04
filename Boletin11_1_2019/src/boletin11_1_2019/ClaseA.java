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
public class ClaseA {
    
    int valorPrimari,valorSecundari;

    public ClaseA() {
        valorPrimari=5;
        valorSecundari=10;
        
    }

    public ClaseA(int vp) {
        this.valorPrimari = vp;
        valorSecundari=10;
        
        
    }

    public ClaseA(int vp, int vs) {
        this.valorPrimari = vp;
        this.valorSecundari = vs;
    }

    public int getValorPrimari() {
        return valorPrimari;
    }

    public int getValorSecundari() {
        return valorSecundari;
    }
    
    
    
    
}
