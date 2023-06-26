package paquete2;
import paquete5.Persona;

public class Prestamo {
    
    protected Persona beneficiario;
    protected int tiempoPmes;
    protected String ciudadP;
    
    public Prestamo(Persona p, int tpm, String cp){
        
        beneficiario = p;
        tiempoPmes = tpm;
        ciudadP = cp;
    
    }

    public void establecerBeneficiario(Persona p) {
        
       beneficiario = p;
        
    }

    public void establecerTiempoPmes(int tpm) {
        
       tiempoPmes = tpm;
        
    }

    public void establecerCiudadP(String cp) {
        
       ciudadP = cp;
        
    }

    public Persona obtenerBeneficiario() {
        
        return beneficiario;
        
    }

    public int obteneriempoPmes() {
        
        return tiempoPmes;
        
    }

    public String obtenerCiudadP() {
        
        return ciudadP;
        
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("--Lista de Prestamos--\n\n"
                + "Beneficiario: %s %s Username: %s\n"
                + "Tiempo de prestamo en Meses: %d\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerUsername(),
                tiempoPmes);
        
        return cadena;
        
    }
    
    
}
