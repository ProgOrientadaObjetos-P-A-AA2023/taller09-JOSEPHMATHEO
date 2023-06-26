package paquete3;
import paquete2.Prestamo;
import paquete5.Persona;

public class PrestamoAutomovil extends Prestamo{
    
    private String tipoauto;
    private String marcaAuto;
    private Persona garante1;
    private double valorAuto;
    private double valorMesAuto;
    
    public PrestamoAutomovil(Persona p, int tpm, String cp, 
            String ta, String ma, Persona g1, double va){
        
        super(p, tpm, cp);
        
        tipoauto = ta;
        marcaAuto = ma;
        garante1 = g1;
        valorAuto = va;
        
    }

    public void establecerTipoauto(String s){
        
        tipoauto = s;
        
    }

    public void establecerMarcaAuto(String s){
        
        marcaAuto = s;
        
    }

    public void establecerGarante1(Persona p){
        
        garante1 = p;
        
    }

    public void establecerValorAuto(double f){
        
        valorAuto = f;
        
    }

    public void calcularValorMesAuto(){
        
        valorMesAuto = valorAuto / (double)(tiempoPmes);
        
    }
    
    @Override
    public void establecerCiudadP(String cp) {
        
       ciudadP = cp.toLowerCase();
        
    }

    public String obtenerTipoauto(){
        
        return tipoauto;
        
    }

    public String obtenerMarcaAuto(){
        
        return marcaAuto;
    }

    public Persona obtenerGarante1(){
        
        return garante1;
        
    }

    public double obtenerValorAuto(){
        
        return valorAuto;
        
    }

    public double obtenerValorMesAuto(){
        
        return valorMesAuto;
        
    }
    
    @Override
    public String toString(){
        
        String cadena = String.format("%s",super.toString());
        
        cadena = String.format("%s\n"
                + "\n--Prestamo Automovil--\n"
                + "Ciudad: %s\n"
                + "Tipo de Auto: %s\n"
                + "Marca de Auto: %s\n"
                + "Garante: %s %s %s\n"
                + "Valor del Auto: %.2f\n"
                + "Valor mensual de pago préstamo automóvil: %.2f\n",
                cadena,
                ciudadP,
                tipoauto,
                marcaAuto,
                garante1.obtenerNombre(),
                garante1.obtenerApellido(),
                garante1.obtenerUsername(),
                valorAuto,
                valorMesAuto);
        
        return cadena;
        
    }
    
    
}
