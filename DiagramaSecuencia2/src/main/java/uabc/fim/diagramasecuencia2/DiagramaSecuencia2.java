/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uabc.fim.diagramasecuencia2;
import java.util.*;

public class DiagramaSecuencia2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Formato formato = new Formato();
        int op = 0;
        while(op != 4){
        System.out.println("Bienvenido al sistema de Inscripcion");
        System.out.println("--Cursos disponibles--");
        System.out.println("[1] Ingenieria");
        System.out.println("[2] Medicina");
        System.out.println("[3] Administracion");
        System.out.println("[4] Salir");
        System.out.println("Por favor, seleccione un curso");
        op = sc.nextInt();
            System.out.println(op);
        if (op == 1 || op == 2 || op == 3){
            formato.Inscribir(op);
        }
        else if (op == 4){
            System.out.println("Buen dia!");
        }
    }}
}
