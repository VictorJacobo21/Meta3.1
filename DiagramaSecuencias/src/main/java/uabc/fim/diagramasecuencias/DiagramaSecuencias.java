package uabc.fim.diagramasecuencias;

import java.util.ArrayList;
import java.util.*;

/**
 *
 * @author Usuario
 */
public class DiagramaSecuencias {

    public static void main(String[] args) {
        int op = 0;
        Scanner sc = new Scanner(System.in);
        DashBoard db = new DashBoard();
        while(op != 2){
        System.out.println("Ingrese 1 para capturar datos recopilados por los sensores: ");
        op = sc.nextInt();
        switch(op){
             case 0:
                System.out.println("Ingrese la tecla correcta!!");
                break;
            case 1: 
                db.updateData();
                break;
            case 2: 
                System.out.println("Gracias, buen dia!");
                break;
            default:
                System.out.println("ERROR");
        }
    }
    }
}
