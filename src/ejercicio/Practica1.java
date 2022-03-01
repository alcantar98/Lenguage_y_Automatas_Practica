/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Alcan
 */
public class Practica1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("ingresa una palabra");
        String palabra = in.nextLine();
        System.out.println(afir(palabra , 0));
        System.out.println(consonantes(palabra));

    }

    public static boolean afir(String cad, int contador) {

        if (cad.length() == 0) {
            return false;
        }
        if (contador < cad.length()) {
            if (contador % 2 != 0) {
                if (cad.substring(contador, contador + 1).matches("[A|E|I|O|U|a|e|i|o|u]")) {
                    return afir(cad, contador + 1);
                } else {
                    return false;
                }
            } else {
                if (cad.substring(contador, contador + 1).matches("[B|C|D|F|G|H|J|K|L|M|N|P|Q|R|S|T|V|W|X|Y|Z|b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z]")) {
                    return afir(cad, contador + 1);
                } else {
                    return false;
                }
            }

        } else {
            return true;
        }

    }

    public static boolean consonantes(String cad){
        boolean entra = false;
        if (cad.matches("[B|C|D|F|G|H|J|K|L|M|N|P|Q|R|S|T|V|W|X|Y|Z|b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z]" )==true){
            for (int i = 2; i < cad.length(); i= i+2) {
                if(cad.substring(i).matches("[B|C|D|F|G|H|J|K|L|M|N|P|Q|R|S|T|V|W|X|Y|Z|b|c|d|f|g|h|j|k|l|m|n|p|q|r|s|t|v|w|x|y|z]")==true){
                entra = true;
                vocales(cad);
                }else {
                
                return false;
                }
                
            }
        
        
        }
        else {
        entra = false;
        }
        
        
                
    return entra;
    }
    public static boolean vocales(String cad){
        boolean entra = false;
        if(cad.matches("[A|E|I|O|U|a|e|i|o|u]") == true){
            for (int i = 1; i < cad.length(); i = i+2) {
                if(cad.substring(i).matches("[A|E|I|O|U|a|e|i|o|u]")==true){
                entra = true;
                
                }else{
                
                entra = false;
                }
                    
                
            }
        return false ;
        
        
        }else{
        
            entra = false;
        }
        
        
    return entra;
    
    } 
    
    
    
    
    
}
