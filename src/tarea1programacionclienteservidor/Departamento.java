/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1programacionclienteservidor;

/**
 *
 * @author Yoselyn Suarez
 */
public class Departamento {
public class Empleado extends Usuario implements OperacionesUsuario, Interface2{
private int id;

    public Usuario(int id, String Nombre, int Edad) {
        super(Nombre, Edad);
        this.id = id;
    }
    @Override
    public String insertarEmpleado(int id, String Nombre){
        return "Usuario insertado";
    };
    
    @Override
    public String borrarEmpleado(int id){
        return "Usuario borrado";
    };
    @Override
    public void Error(){
        System.out.print("Error");
    };
}  
}
