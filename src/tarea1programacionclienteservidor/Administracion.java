/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea1programacionclienteservidor;

/**
 *
 * @author Yoselyn Suarez
 */
public class Administracion extends Jefatura{
    private int idAdmin;

    public Administracion (int idAdmin, int id, String Nombre, int Edad) {
        super(id, Nombre, Edad);
        this.idAdmin = idAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }}