import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //ingresamos dimensiones
        float frente, fondo;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese frente del terreno: ");
        frente = scanner.nextFloat();
        System.out.println("Ingrese fondo del terreno: ");
        fondo = scanner.nextFloat();

        //calculamos resultados
        Terreno terreno = new Terreno(frente, fondo);
        System.out.println("Los impusetos son: "+terreno.calcularImpuestos());
        System.out.println("El cerco es de: "+terreno.calcularCerco());
    }
}