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
public class Empleado {
    protected String nombre;
    private String apellido;
    private int cedula;
    private double comision_fija;
    
    public Empleado(String n, String a,  int e,double com){
        setNombre(n);
        setApellido(a);
        setCedula(e);
        setComision_fija(com);
    }

    public void setComision_fija(double com) {
        comision_fija = com;
    }
    
    public void setNombre(String n){
        nombre = n;
    }
    
    public void setApellido(String n){
        apellido = n;
    }
    
    public void setCedula(int n){
        cedula = n;
    }
    
    public int getCedula(){
        return cedula;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
        return apellido;
    }

    public double getComision_fija() {
        return comision_fija;
    }
    
    
    @Override
    public String toString(){
        return String.format("Nombre: %s - Apellido %s - Cedula %d - Comision fija %f", 
                getNombre(), getApellido(), getCedula() , getComision_fija());
    }
}
