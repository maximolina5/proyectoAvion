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
public class Piloto {
    private int idPiloto;
    private String codigoDePiloto;
    private String nombre;
    private String apellido;
    private Integer numeroDeLicencia;
    private static int contadorPiloto;

    public Piloto(String codigoDePiloto, String nombre, String apellido, Integer numeroDeLicencia) {
        this.codigoDePiloto = codigoDePiloto;
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroDeLicencia = numeroDeLicencia;
        this.idPiloto=++contadorPiloto;
    }
    
    public int getIdPiloto() {
        return idPiloto;
    }

    public void setIdPiloto(int idPiloto) {
        this.idPiloto = idPiloto;
    }

    public static int getContadorPiloto() {
        return contadorPiloto;
    }

    public static void setContadorPiloto(int contadorPiloto) {
        Piloto.contadorPiloto = contadorPiloto;
    }

    public String getCodigoDePiloto() {
        return codigoDePiloto;
    }

    public void setCodigoDePiloto(String codigoDePiloto) {
        this.codigoDePiloto = codigoDePiloto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getNumeroDeLicencia() {
        return numeroDeLicencia;
    }

    public void setNumeroDeLicencia(Integer numeroDeLicencia) {
        this.numeroDeLicencia = numeroDeLicencia;
    }

    @Override
    public String toString() {
        return "Piloto{" + "idPiloto=" + idPiloto + ", codigoDePiloto=" + codigoDePiloto + ", nombre=" + nombre + ", apellido=" + apellido + ", numeroDeLicencia=" + numeroDeLicencia + '}';
    }
    
   
}
