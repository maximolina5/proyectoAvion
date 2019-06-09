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
public class Avion {
    private int idAvion;
    private String aerolinea;
    private String codigoDeAvion;
    private int numeroDeAsiento;
    private String compartimientos;
    private static int contadorAviones;

    public Avion(String aerolinea, String codigoDeAvion, int numeroDeAsiento, String compartimientos) {
        this.aerolinea = aerolinea;
        this.codigoDeAvion = codigoDeAvion;
        this.numeroDeAsiento = numeroDeAsiento;
        this.compartimientos = compartimientos;
        this.idAvion=++contadorAviones;
    }
    
    

    public int getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(int idAvion) {
        this.idAvion = idAvion;
    }

    public static int getContadorAviones() {
        return contadorAviones;
    }

    public static void setContadorAviones(int contadorAviones) {
        Avion.contadorAviones = contadorAviones;
    }

    
    
    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public String getCodigoDeAvion() {
        return codigoDeAvion;
    }

    public void setCodigoDeAvion(String codigoDeAvion) {
        this.codigoDeAvion = codigoDeAvion;
    }

    public int getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(int numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }

    public String getCompartimientos() {
        return compartimientos;
    }

    public void setCompartimientos(String compartimientos) {
        this.compartimientos = compartimientos;
    }

    @Override
    public String toString() {
        return "Avion{" + "idAvion=" + idAvion + ", aerolinea=" + aerolinea + ", codigoDeAvion=" + codigoDeAvion + ", numeroDeAsiento=" + numeroDeAsiento + ", compartimientos=" + compartimientos + '}';
    }
    
     
    
    
}
