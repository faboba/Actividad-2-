/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_2;

import actividad_2.Conexion.Dato;

/**
 *
 * @author AMAYA LANCHEROS
 */
public interface Conexion {
Dato getDatos();
    void setDatos();

    public static class Dato {

        public Dato() {
        }
    }
}

class AccesoADatos {

    private Conexion conexion;

    public AccesoADatos(Conexion conexion){
        this.conexion = conexion;
    }

    Dato getDatos(){
        conexion.getDatos();
        return null;
    }
}