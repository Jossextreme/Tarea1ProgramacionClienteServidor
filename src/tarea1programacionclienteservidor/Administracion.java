/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1programacionclienteservidor;

/**
 *
 * @author Yoselyn Suarez
 */
public class Administracion {
    public class Administracion extends Jefatura {
    private final String Sector;
    
    public Administracion (String Nombre, String Apellidos, int Edad, String 
            IdProfesor, String Sector){
        super(Nombre, Apellidos, Edad, IdProfesor);
        this.Sector = Sector;
    }
    
    
     public void doSomething () { System.out.println("Soy Administrativo");   }
    
}
}
