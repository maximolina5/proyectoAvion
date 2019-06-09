/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyecto.avion;

/**
 *
 * @author maxim
 */
public class Ciudad {
    private int idCiudad;
    private String codigoCiudad;
    private String nombre;
    private static int contadorCiudad;

    public Ciudad(String codigoCiudad, String nombre) {
        this.codigoCiudad = codigoCiudad;
        this.nombre = nombre;
    }

    public void setCodigoCiudad(String codigoCiudad) {
        this.codigoCiudad = codigoCiudad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigoCiudad() {
        return codigoCiudad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "idCiudad=" + idCiudad + ", codigoCiudad=" + codigoCiudad + ", nombre=" + nombre + '}';
    }
    
}