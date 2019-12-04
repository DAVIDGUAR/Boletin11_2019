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
public class Prueba2 {

    int dia = 0, mes = 0, any = 0;

    public Prueba2() {
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int d) {

        if (d > 0 && d < 32) {

            if (mes == 2) {

                if (any % 4 == 0) {

                    if (d > 0 && d < 30) {

                        this.dia = d;
                    }

                } else {
                    if (d > 0 && d < 29) {

                        this.dia = d;

                    }

                }

            } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

                if (d > 0 && d < 32) {

                    this.dia = d;

                }
            }else
            
            if (d> 0 && d < 31){
                
                this.dia=d;
                
            }
            
            
            
        }

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {

        if (mes > 0 && mes < 13) {

            this.mes = mes;
        }
    }

    public int getAny() {
        return any;
    }

    public void setAny(int any) {
        this.any = any;
    }

}
