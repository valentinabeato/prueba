public class Main {
    public static void main(String[] args) {
        Aritmetica aritmetica = new Aritmetica(15, 5);
        System.out.println("la suma es: " + aritmetica.sumar());
        System.out.println("la resta es: " + aritmetica.restar());
        System.out.println("el producto es: " + aritmetica.multiplicar());
        System.out.println("el cociente es: " + aritmetica.division());
    }
}