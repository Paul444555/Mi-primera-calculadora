// ANALISIS
/*
* Descripcion: La calculadora debera pedirle al usuario 2 numeros
* y con esos 2 numeros realizar suma, resta, multiplicacion, division y modulo
* Entradas: 2, numero 1 y numero 2, ambos ingresados por el usuario
* Salidas: 5, una por cada resultado de la operacion aritmetica.
*/
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        double numero1, numero2; 
        System.out.println("Por favorcito deme el primer numerito:");
        numero1= entrada.nextDouble(); 
        entrada.nextLine();
       
        System.out.println("Por favorcito deme el segundo numerito:");
        numero2= entrada.nextDouble(); 
        entrada.nextLine();

        double suma, resta, multiplicacion, modulo, division;
        suma= numero1 + numero2;
        resta= numero1 - numero2;
        multiplicacion= numero1 * numero2;
        modulo = numero1 % numero2; 
        division = numero1 / numero2;

        System.out.println("El resultado de la suma es:" + suma );
        System.out.println("El resultado de la resta es:" + resta );
        System.out.println("El resultado de la multiplicacion es:" + multiplicacion );
        System.out.println("El resultado de la modulo es:" + modulo );
        System.out.println("El resultado de la division es:" + division );
      


    }

    public static double sumar (double a, double b) {
        double suma = a + b ;
        return suma;
         }
    public static double restar (double a, double b) {
        double resta=  a - b; 
        return resta;
        }
    public static double multiplicar(double a, double b) {
        double multiplicacion  = a * b ;
        return multiplicacion;
         }
    public static double modular (double a, double b) {
        double modulo  = a % b ;
        return modulo;
         }
    public static double dividir (double a, double b) {
        double division = a / b ;
        return division;
         }


}