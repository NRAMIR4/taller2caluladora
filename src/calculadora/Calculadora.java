import java.util.Scanner;

public class Calculadora {
    // variables
    int valor1;
    int valor2;
    int resultado;
    // Constructor
    public Calculadora(int valor1, int valor2) {
        this.valor1 = valor1;
        this.valor2 = valor2;
    }
    // metodos
    public void sumar() {
        resultado = valor1 + valor2;
        System.out.println("-------------------------------------------");
        System.out.println("El  resultado  de  la  Suma es : " + resultado);
    }
    public void restar() {
        resultado = valor1 - valor2;
        System.out.println("-------------------------------------------");
        System.out.println("El  resultado  de  la  Resta es : " + resultado);;
    }
    public void multiplicar() {
        resultado = valor1 * valor2;
        System.out.println("-------------------------------------------");
        System.out.println("El resultado de la Multiplicación es: " + resultado);
    }
    public void dividir() {
        if (valor2 != 0) {
            resultado = valor1 / valor2;
            System.out.println("-------------------------------------------");
            System.out.println("El resultado de la División es: " + resultado);
        } else {
            System.out.println("Error");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.print("Ingrese el primer número: ");
        int valor1 = scanner.nextInt();
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-");
        System.out.print("Ingrese el segundo número: ");
        int valor2 = scanner.nextInt();

        Calculadora calculadora = new Calculadora(valor1, valor2);
        calculadora.sumar();
        calculadora.restar();
        calculadora.multiplicar();
        calculadora.dividir();
    }
}