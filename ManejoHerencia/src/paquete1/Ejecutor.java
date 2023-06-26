package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;
import paquete6.InstitucionEducativa;

public class Ejecutor{
    
    public static void main(String[] args) {
    
        // Declaracion de Varibles 

        boolean respuesta = true;
        int option = 0;
        String nombre;
        String apellido;
        String user;
        int tpmes;
        String ciudad;
        String tipoAut;
        String marca;
        double autoV;
        String nEstudio;
        String nombreCE;
        String siglas;
        double carreraV;
        String continuar;
        ArrayList<Prestamo> prestamos = new ArrayList<>();
        
        Scanner lm = new Scanner(System.in);

        do{
            
            System.out.printf("\nEscoja el tipo de prestamo que desea Ingresar:"
                    + "\n1) Prestamo de Automovil\n"
                    + "2) Prestamo Estudiantil\n"
                    + "\nIngrese una opcion: ");
            
            option = lm.nextInt();
            
            
            
            lm.nextLine(); // Limpieza de Buffer
            
            System.out.println("\n--Ingreso de Datos--\n");
            System.out.print("Ingrese el nombre de la Persona: ");
            nombre = lm.nextLine();
            
            System.out.print("Ingrese el apellido de la Persona: ");
            apellido = lm.nextLine();
            
            System.out.print("Ingrese el username de la Persona: ");
            user = lm.nextLine();
            
            System.out.print("Ingrese el tiempo del prestamo en meses: ");
            tpmes = lm.nextInt();
            
            lm.nextLine(); // Limpieza de Buffer
            
            System.out.print("Ingrese la ciudad del prestamo: ");
            ciudad = lm.nextLine();
            
            Persona p = new Persona(nombre,apellido,user);
            
            if(option == 1){
                
                System.out.print("Ingrese el tipo de automovil: ");
                tipoAut = lm.nextLine();
                    
                System.out.print("Ingrese la marca del automovil: ");
                marca = lm.nextLine();
                    
                System.out.print("Ingrese el nombre del garante: ");
                nombre = lm.nextLine();
                    
                System.out.print("Ingrese el apellido del garante: ");
                apellido = lm.nextLine();
                    
                System.out.print("Ingrese el username del garante: ");
                user = lm.nextLine();
                    
                System.out.print("Ingrese el valor del automovil: ");
                autoV = lm.nextDouble();
                
                lm.nextLine(); // Limpieza de Buffer
                
                Persona p2 = new Persona(nombre,apellido,user);
                    
                PrestamoAutomovil prestamoA = new PrestamoAutomovil(p, 
                tpmes, ciudad, tipoAut, marca, 
                p2, autoV);
                    
                prestamoA.calcularValorMesAuto();
                prestamoA.obtenerCiudadP().toLowerCase();
                prestamos.add(prestamoA);
                    
                    
            }else{
                
                if(option == 2){
                    
                    System.out.print("Ingrese el nivel de Estudio: ");
                    nEstudio = lm.nextLine();
                    
                    System.out.print("Ingrese el nombre del centro Educativo: ");
                    nombreCE = lm.nextLine();
                    
                    System.out.print("Ingrese las siglas del centro Educativo: ");
                    siglas = lm.nextLine();
                    
                    System.out.print("Ingrese el valor de la carrera: ");
                    carreraV = lm.nextDouble();
                    
                    lm.nextLine(); // Limpieza de Buffer
                    
                    InstitucionEducativa ie = new InstitucionEducativa(
                            nombreCE, siglas);
                    
                    PrestamoEducativo prestamoE = new PrestamoEducativo(p, tpmes
                            , ciudad, nEstudio, ie, carreraV);
                    
                    prestamoE.calcluarValorMpresC();
                    prestamoE.obtenerCiudadP().toUpperCase();
                    prestamos.add(prestamoE);
                    
                }else{
                    
                    System.err.println("Opcion invalida! ");
                    
                } 
                
            }
            
            System.out.print("\nDigite S para cerrar el progrma...");
            continuar = lm.nextLine().toUpperCase();
            
            if(continuar.equals("S")){
            
                for(int i = 0; i < prestamos.size(); i++){
                    
                    Prestamo pre = prestamos.get(i);
                    
                    System.out.printf("\nPRÉSTAMO (%d):\n%s",
                        i+1,
                        pre);
                }
            
            }
            
            respuesta = false;
                
        }while(respuesta != false);
        
    }

}