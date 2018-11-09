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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoFijo e = new EmpleadoFijo("René", "Elizalde", 33.2, 100,2,2,5.2,6.4);
        System.out.println(e);
        EmpleadoPorHoras d = new EmpleadoPorHoras("Luis", "Alvarez", 33, 100.5,2,2); 
        System.out.println(d);
        
        EmpleadoPorSemana p = new EmpleadoPorSemana("ALEX", "MENDOZA",  1150037545, 200.5); 
        System.out.println(p);
        
        Empleado f = new Empleado("ALEX", "MENDOZA",  1150037545, 100.5); 
        System.out.println(f);
    }
    
}
