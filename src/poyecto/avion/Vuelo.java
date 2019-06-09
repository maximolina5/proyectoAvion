/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poyecto.avion;

import java.util.Date;


/**
 *
 * @author maxim
 */
public class Vuelo {
    private final int idVuelo;
    private int numeroDeVuelo;
    private String horaDeSalida;
    private String horaDeLlegada;
    private Ciudad lugarDeOrigen;
    private Ciudad lugarDeDestino;
    private Date fechaDeSalida;
    private Date fechaDeLlegada;
    private String tipoDeVuelo;
    private static int contadorVuelo;
    private Asiento asientos[];    
    private Pasajero pasajeros[];
    private Avion avion;
   private Asiento asiento;
    

    public Vuelo() {
        this.idVuelo =++contadorVuelo;
        
    }
    public void nose(){
        for (int i = 0; i <asientos.length; i++) {
        }
    }

    public static int getContadorVuelo() {
        return contadorVuelo;
    }

    public static void setContadorVuelo(int contadorVuelo) {
        Vuelo.contadorVuelo = contadorVuelo;
    }

    public int getIdVuelo() {
        return idVuelo;
    }

    
    public int getNumeroDeVuelo() {
        return numeroDeVuelo;
    }

    public void setNumeroDeVuelo(int numeroDeVuelo) {
        this.numeroDeVuelo = numeroDeVuelo;
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
    }

    public String getHoraDeLlegada() {
        return horaDeLlegada;
    }

    public void setHoraDeLlegada(String horaDeLlegada) {
        this.horaDeLlegada = horaDeLlegada;
    }

    public Ciudad getLugarDeOrigen() {
        return lugarDeOrigen;
    }

    public void setLugarDeOrigen(Ciudad lugarDeOrigen) {
        this.lugarDeOrigen = lugarDeOrigen;
    }

    public Ciudad getLugarDeDestino() {
        return lugarDeDestino;
    }

    public void setLugarDeDestino(Ciudad lugarDeDestino) {
        this.lugarDeDestino = lugarDeDestino;
    }

    public Date getFechaDeSalida() {
        return fechaDeSalida;
    }

    public void setFechaDeSalida(Date fechaDeSalida) {
        this.fechaDeSalida = fechaDeSalida;
    }

    public Date getFechaDeLlegada() {
        return fechaDeLlegada;
    }

    public void setFechaDeLlegada(Date fechaDeLlegada) {
        this.fechaDeLlegada = fechaDeLlegada;
    }

    public String getTipoDeVuelo() {
        return tipoDeVuelo;
    }

    public void setTipoDeVuelo(String tipoDeVuelo) {
        this.tipoDeVuelo = tipoDeVuelo;
    }

    public Asiento[] getAsientos() {
        return asientos;
    }

    public void setAsientos(Asiento[] asientos) {
        this.asientos = asientos;
    }

    public Pasajero[] getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(Pasajero[] pasajeros) {
        this.pasajeros = pasajeros;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "idVuelo=" + contadorVuelo + ", numeroDeVuelo=" + numeroDeVuelo +"\n"+ "HoraDeSalida=" + horaDeSalida + ", horaDeLlegada=" + horaDeLlegada +"\n" +"LugarDeOrigen=" + lugarDeOrigen + ", lugarDeDestino=" + lugarDeDestino +"\n" +"FechaDeSalida=" + fechaDeSalida + ", fechaDeLlegada=" + fechaDeLlegada + "\n"+"TipoDeVuelo=" + tipoDeVuelo + ", asientos=" + asientos + ", pasajeros=" + pasajeros + '}';
    }
    
    
    
    
}
