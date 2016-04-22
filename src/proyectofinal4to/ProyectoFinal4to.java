/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal4to;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pablo
 */
public class ProyectoFinal4to {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<List<String>> listOfList = new ArrayList<>();
        listOfList.add(new ArrayList<>());
        listOfList.get(0).add(new String());
        
        
        
        ArrayList<String> Inventario = new ArrayList<String>();
        Inventario.add("Cosa1");
        Inventario.add("Cosa2");
        Inventario.add("Cosa3");
        Inventario.add("Cosa4");
        Inventario.remove(Inventario.indexOf("Cosa2"));
        for(int i=0; i<Inventario.size(); i++)
        System.out.println(Inventario.get(i));
        
        
    }
    
}
