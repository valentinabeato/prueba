public class Aritmetica {
    private int num1;
    private int num2;

    public Aritmetica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sumar(){
        return num1 + num2;
    }
    public int restar(){
        return num1 - num2;
    }
    public int multiplicar(){
        return num1 * num2;
    }
    public int division(){
        if(num2 != 0)
            return num1/num2;
        else
            return 0;
    }
}
