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
public class Asiento {
    private int idAsiento;
    private int numeroDeAsiento;
    private boolean estado;
    private String compartimiento;
    private static int contadorAsiento;
    private int asientos[];

    public Asiento(int numeroDeAsiento, boolean estado, String compartimiento,int asientos[]) {
        this.numeroDeAsiento = numeroDeAsiento;
        this.estado = estado;
        this.asientos=asientos;
        this.compartimiento = compartimiento;
        this.idAsiento=++contadorAsiento;
    }
      
    public int[] getAsientos() {
        return asientos;
    }

    public void setAsientos(int[] asientos) {
        this.asientos = asientos;
    }
    
    public int getIdAsiento() {
        return idAsiento;
    }

    public void setIdAsiento(int idAsiento) {
        this.idAsiento = idAsiento;
    }

    public static int getContadorAsiento() {
        return contadorAsiento;
    }

    public static void setContadorAsiento(int contadorAsiento) {
        Asiento.contadorAsiento = contadorAsiento;
    }
    
    

    public int getNumeroDeAsiento() {
        return numeroDeAsiento;
    }

    public void setNumeroDeAsiento(int numeroDeAsiento) {
        this.numeroDeAsiento = numeroDeAsiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getCompartimiento() {
        return compartimiento;
    }

    public void setCompartimiento(String compartimiento) {
        this.compartimiento = compartimiento;
    }

    @Override
    public String toString() {
        return "Asiento{" + "idAsiento=" + idAsiento + ", numeroDeAsiento=" + numeroDeAsiento + ", estado=" + estado + ", compartimiento=" + compartimiento + '}';
    }

    private int[] estado(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
