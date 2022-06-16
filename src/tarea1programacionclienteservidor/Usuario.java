/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1programacionclienteservidor;

/**
 *
 * @author Joselyn Suarez
 */
public class Usuario {
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private String Profesion;
    
    //Constructores
public Usuario () {}
    
public Usuario (String Nombre, String Apellidos, int Edad) {
    this.Nombre = Nombre;
    this.Apellidos =Apellidos;
    this.Edad = Edad;
}

//Metodo

public String getNombre () { return Nombre;  }

    public String getApellidos () { return Apellidos;  }

    public int getEdad () { return Edad;   }

    public void setEdad(int Edad) {
        this.Edad = Edad;}
}

      

