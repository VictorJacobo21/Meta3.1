/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.fim.diagramasecuencias;

import java.util.*;

public class SensorProxy {
    private String SensorTemperatura;
    private String SensorLuz;
    private int valor;
    private Random ran;
    public SensorProxy()
    {
       ran = new Random();
    }
    
    public String read(){
        String cadena = "";
                cadena += "El valor de temperatura registrado es: " + Integer.toString(ran.nextInt(50)+10) + "grados Celcius";
                cadena += "\n";
                cadena += "El valor de iluminacion registrado es: " + Integer.toString(ran.nextInt(100)) + "% de luminacion";
                return cadena;
    }
}