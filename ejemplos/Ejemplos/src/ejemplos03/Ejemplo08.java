/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos03;

import java.util.Scanner;


/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int indice;
        // 
        String mensajeSuma;
        String mensajeSumaDos;
        int a;
        int b;
        
        System.out.println("Ingese el numero de la operacion que desea realizar");
        System.out.println("1. Tabla de sumar\n2. Tabla de multiplicar");
        indice = entrada.nextInt();
        
        switch (indice){
            case 1:
                System.out.println("Ingrese el limite a la tabla de sumar");
                a = entrada.nextInt();
                System.out.println("Ingrese el valor que desee para la tabla");
                b = entrada.nextInt();
                mensajeSuma = obtenerTablaSumar(a ,b );
                break;
            case 2: 
                System.out.println("Ingrese el limite a la tabla de multiplicarr");
                a = entrada.nextInt();
                System.out.println("Ingrese el valor que desee para la tabla");
                b = entrada.nextInt();
                mensajeSuma = obtenerTablaMultiplicar(a ,b );
        }
                
        
        System.out.printf("%s\n", mensajeSuma);
        System.out.printf("%s\n", mensajeSumaDos);
    }
        
    public static String obtenerTablaSumar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla + i;
            cadena = String.format("%s%d + %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;        
    }
    
    public static String obtenerTablaMultiplicar(int limite, int tabla){
        int operacion;
        String cadena = "";
        for (int i = 1; i <= limite; i++) {
            operacion = tabla * i;
            cadena = String.format("%s%d * %d = %d\n", cadena, tabla, i, 
                    operacion);
        }
        return cadena;
        
    }
    
}
