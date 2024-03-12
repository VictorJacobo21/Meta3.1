/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.fim.diagramasecuencias;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class DashBoard {
    private SensorProxy sensores;
    
    public DashBoard(){
        sensores = new SensorProxy();
    }
    
    public void updateData(){
        String cadena = "";
        cadena = sensores.read();
        updateDisplay(cadena);
    }
    
    public void updateDisplay(String cadena){
         if (cadena == null)
            System.out.println("No hay registros por mostrar");
        else 
        {
                System.out.println(cadena);
            }
        }
}
