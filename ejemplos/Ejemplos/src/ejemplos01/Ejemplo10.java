/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos01;

/**
 *
 * @author reroes
 */
public class Ejemplo10 {

    public static void main(String[] args) {
        // 
        String mensajeSuma;
        String sumaDos;
        String suma3;
        
        mensajeSuma = obtenerSuma(10, 9);
        sumaDos = obtenerSuma(10);
        suma3 = obtenerSuma(12, 2 ,4);
        
        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", sumaDos);
        System.out.printf("%s\n", suma3);
    }
        
    public static String obtenerSuma(int operandor1, int operandor2){
        int suma;
        String cadena = "";
        suma = operandor1 + operandor2;
        cadena = String.format("%s%d\n", cadena, suma);
        return cadena;        
    }
    
    public static String obtenerSuma(int operandor1){
        int suma;
        String cadena = "";
        suma = operandor1 + operandor1;
        cadena = String.format("%s%d\n", cadena, suma);
        return cadena;        
        
    }
    public static String obtenerSuma(int operandor1, int operandor2, int operador3){
        int suma;
        String cadena = "";
        suma = operandor1 + operandor1 + operador3;
        cadena = String.format("%s%d\n", cadena, suma);
        return cadena;  
    
    }
}
