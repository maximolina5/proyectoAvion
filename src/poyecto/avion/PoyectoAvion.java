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
public class PoyectoAvion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasajero p1 = new Pasajero("42.455.695","Mauro","Mendoza","M",19);
        
        Avion a1 = new Avion("Aerolineas Argentinas","747",21,"grande");
        
        Piloto pi1 = new Piloto("p1","Jorge","Montillo",123);
        
        Ciudad mza = new Ciudad("MDZ", "Mendoza");
        
        Ciudad sto = new Ciudad("STO", "Santiago");
        
        
        Vuelo vuelo = new Vuelo();
        vuelo.setNumeroDeVuelo(444);
        vuelo.setFechaDeSalida(new Date());
        vuelo.setHoraDeSalida("20:30");
        vuelo.setFechaDeLlegada(new Date());
        vuelo.setHoraDeLlegada("21:30");
        vuelo.setLugarDeOrigen(mza);
        vuelo.setLugarDeDestino(sto);
        vuelo.setTipoDeVuelo("Internacional");
        vuelo.getContadorVuelo();
        
        System.out.println(vuelo);
    }
    
}
