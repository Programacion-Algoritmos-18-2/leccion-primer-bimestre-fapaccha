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
public class EmpleadoFijo extends Empleado{
    private double sueldo_fijo = 0;
    private double descuento_seguro = 0; 
    private double operacion = 0;

    public EmpleadoFijo(String n, String a,double com, int e, int nh,int vh,double x , double b) {
        super(n, a, e,com);
        setSueldo_fijo(x);
        setDescuento_Seguro(b);
    }

    public void setSueldo_fijo(double nh) {
        sueldo_fijo = nh;
    }

    public void setDescuento_Seguro(double vh) {
        descuento_seguro = vh;
    }

    public void Operacion() {
        
    }
    
    public double getSueldo_fijo() {
        return sueldo_fijo;
    }

    public double getDescuento_Seguro() {
        return descuento_seguro;
    }

    public double getOperacion() {
        return operacion;
    }
    
    @Override
    public String toString(){
    
        return String.format("Nombre: %s - Apellido %s - Cedula %f - Comision fija %i - sueldo fijo %i - descuento seguro %i- %double - % double", super.toString(), getDescuento_Seguro(),getSueldo_fijo(),getOperacion());
    }
    
}
