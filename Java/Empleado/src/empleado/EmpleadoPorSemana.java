/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empleado;

/**
 *
 * @author user
 */
public class EmpleadoPorSemana extends Empleado {
    private double numero_semanas=0;
    private double valor_semanal=0;

    public EmpleadoPorSemana(String n, String a, int e, double com) {
        super(n, a, e, com);
    }

    public void setNumero_semanas(double numero_semanas) {
        this.numero_semanas = numero_semanas;
    }

    public void setValor_semanal(double valor_semanal) {
        this.valor_semanal = valor_semanal;
    }

    public double getNumero_semanas() {
        return numero_semanas;
    }

    public double getValor_semanal() {
        return valor_semanal;
    }
    @Override
    public String toString(){
    
        return String.format(" ", super.toString(), getNumero_semanas(),getValor_semanal());
    }
}
