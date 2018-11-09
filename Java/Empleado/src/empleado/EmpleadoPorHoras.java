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
public class EmpleadoPorHoras extends Empleado {
    private int numero_horas = 0;
    private double valor_horas = 0; 
    private double operacion = 0;

    public EmpleadoPorHoras(String n, String a, int e, double com,double x, int y) {
        super(n, a, e, com);
        setNumero_horas(y);
        setValor_horas(x);
    }

    public void setNumero_horas(int numero_horas) {
        this.numero_horas = numero_horas;
    }

    public void setValor_horas(double valor_horas) {
        this.valor_horas = valor_horas;
    }

    public void setOperacion(double operacion) {
        this.operacion = operacion;
    }

    public int getNumero_horas() {
        return numero_horas;
    }

    public double getValor_horas() {
        return valor_horas;
    }

    public double getOperacion() {
        return operacion;
    }
    @Override
    public String toString(){
    
        return String.format(" ", super.toString(), getValor_horas(),getNumero_horas(),getOperacion());
    }
}
