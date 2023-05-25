/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

/**
 *
 * @author hp
 */
public class Datos {
    String nombre;
    int fecha;
    String curp;

    public Datos(String nombre, int fecha, String curp) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.curp = curp;
    }

    public Datos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFecha() {
        return fecha;
    }

    public void setEdad(int fecha) {
        this.fecha = fecha;
    }

    public String getCurp() {
        return curp;
    }

    public void setCorreo(String curp) {
        this.curp = curp;
    }
}
