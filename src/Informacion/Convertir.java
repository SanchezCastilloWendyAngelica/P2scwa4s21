/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Informacion;

import com.google.gson.Gson;

/**
 *
 * @author hp
 */
public class Convertir {
    public Datos aclase(String cadena){
        Gson gson = new Gson();
        return gson.fromJson(cadena, Datos.class);
    }
    
    public String ajson(Datos datos){
        Gson gson = new Gson();
        return gson.toJson(datos);
    }

    private static class Gson {

        public Gson() {
        }

        private Datos fromJson(String cadena, Class<Datos> aClass) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        private String toJson(Datos datos) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
}
