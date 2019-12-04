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
public class ComplexNumber {

    public static ComplexNumber zero = new ComplexNumber(0.0, 0.0);
    double real, imaginary;

    public ComplexNumber(double r, double im) {
        this.real = r;
        this.imaginary = im;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public ComplexNumber add (ComplexNumber c){
        
        ComplexNumber suma = new ComplexNumber(real+c.getReal(), imaginary+c.getImaginary());
        return suma;
        
    }

    @Override
    public String toString() {
        return "ComplexNumber{" + "real=" + real + ", imaginary=" + imaginary + '}';
    }
    
    
    
    
    
    

}
