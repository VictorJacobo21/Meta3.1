
package uabc.fim.diagramasecuencia2;

import java.util.*;

public class Formato {  
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private ListaDeCursos lista = new ListaDeCursos();
    public Formato(){
    
}
    public void Inscribir(int op){
        actualizarFormato(op);
        lista.UpdateEstudiante(this);
        
        }
    public void actualizarFormato(int op){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        nombre = sc.nextLine();
        System.out.println("Ingrese su primer apellido: ");
        apellido = sc.nextLine();
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();
        switch(op){
                case 1:
                    carrera = "Ingenieria";
                break;
                case 2:
                    carrera = "Medicina";
                break;
                case 3:
                    carrera = "Administracion";
                break;
                default:
                    System.out.println("ERROR");
                break;
                
    }
    }
    @Override
    public String toString() {
        return "Formato{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", carrera='" + carrera + '\'' +
                '}';
    }
}
