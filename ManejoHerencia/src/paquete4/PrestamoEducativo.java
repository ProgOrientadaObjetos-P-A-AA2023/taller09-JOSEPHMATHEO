package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

public class PrestamoEducativo extends Prestamo {
    
    private String nivelEst;
    private InstitucionEducativa centro;
    private double valorCarrera;
    private double valorMpresC;
    
    public PrestamoEducativo(Persona p, int tpm, String cp, 
        String nE, InstitucionEducativa i, double vC){
    
        super(p, tpm, cp);
        
        nivelEst = nE;
        centro = i;
        valorCarrera = vC;
        
    }

    public void establecerNivelEst(String s){
        
        nivelEst = nivelEst;
        
    }

    public void establecerCentro(InstitucionEducativa i){
        
        centro = centro;
        
    }

    public void establecerValorCarrera(double f){
        
        valorCarrera = valorCarrera;
        
    }

    public void calcluarValorMpresC(){
        
        valorMpresC = ( valorCarrera / (double)(tiempoPmes) ) - 
                      ( (valorCarrera / (double)(tiempoPmes) ) * 0.10 );
        
    }
    
    @Override
    public void establecerCiudadP(String cp) {
        
       ciudadP = cp.toUpperCase();
        
    }

    public String obtenerNivelEst(){
        
        return nivelEst;
        
    }
    
    public InstitucionEducativa obtenerCentro(){
        
        return centro;
        
    }

    public double obtenerValorCarrera(){
        
        return valorCarrera;
        
    }

    public double obtenerValorMpresC(){
        
        return valorMpresC;
        
    }
    
      @Override
    public String toString(){
        
        String cadena = String.format("%s",super.toString());
        
        cadena = String.format("%s\n"
                + "\n--Prestamo Educativo--\n"
                + "Ciudad: %s\n"
                + "Nivel de Estudio: %s\n"
                + "Centro Educativo: %s (%S)\n"
                + "Valor de la Carrera: %.2f\n"
                + "Valor mensual del pago del préstamo del valor de la "
                + "carrera: %.2f\n",
                cadena,
                ciudadP.toUpperCase(),
                nivelEst,
                centro.obtenerNombre(),
                centro.obtenerSiglas(),
                valorCarrera,
                valorMpresC);
        
        return cadena;
        
    }
    
}
