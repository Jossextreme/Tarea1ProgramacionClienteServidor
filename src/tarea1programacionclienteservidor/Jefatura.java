/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1programacionclienteservidor;

/**
 *
 * @author josua
 */
public class Jefatura {
    public class Jefatura extends Usuario {

    private final String IdJefatura;
    
    private String Area;


    public Jefatura (String Nombre, String Apellidos, int Edad, String 
            IdJefatura) {

        super(Nombre, Apellidos, Edad);

        this.IdJefatura = IdJefatura;   
    }
    
    public String getArea() {
        return Area;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }
    

    public void setIdJefatura (String IdJefatura) { this.IdJefatura = IdJefatura; }

    public String getIdProfesor () { return IdJefatura;   }

    public void mostrarNombreApellidosYCarnet() {

        System.out.println ("Jefatura a nombre de: " + super.getNombre() + " " +  super.getApellidos() +

         " con Id de Jefatura: " + this.IdJefatura ); 
    }
    
    public void doSomething () { System.out.println("Bienvenido Jefatura ");   }
}
