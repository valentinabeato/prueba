import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String alumno = scanner.nextLine();
        System.out.println("Bienvenido "+ alumno + " a TSB");
    }
}