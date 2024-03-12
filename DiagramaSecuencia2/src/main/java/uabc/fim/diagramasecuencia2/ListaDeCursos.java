/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uabc.fim.diagramasecuencia2;

import java.util.*;

public class ListaDeCursos {
    private ArrayList<Formato> DB;
    
    public ListaDeCursos(){
    DB = new ArrayList<Formato>();    
    }
    
    public void UpdateEstudiante(Formato alumno){
        DB.add(alumno);
        for(int i =0 ; i <= DB.size()-1 ; i++){
            System.out.println(DB.get(i).toString());
    }
    }
}
