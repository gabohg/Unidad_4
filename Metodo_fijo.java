/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package metodo_fijo;

/**
 *
 * @author gabohrnz04
 */
public class Metodo_fijo {
    
    public static int sumar(int a, int b) {
        return a + b;
    }
    public static int resta (int a, int b){
        return a - b;
    }
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int resultado = Metodo_fijo.sumar(6, 4); //llamando al metodo estatico
        System.out.println("La suma es: " + resultado);
        
        int resultado2 = Metodo_fijo.resta(6, 4); //llamando al metodo estatico
        System.out.println("La resta es: " + resultado2);
        
        int resultado3 = Metodo_fijo.multiplicacion (6, 4); //llamando al metodo estatico
        System.out.println("La multiplicacion es: " + resultado3);
        
        double resultado4 = Metodo_fijo.division (6, 4); //llamando al metodo estatico
        System.out.println("La division es: " + resultado4);
    }
    
}
