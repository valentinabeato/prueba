public class Terreno {
    private float frente;
    private float fondo;

    public Terreno(float frente, float fondo) {
        this.frente = frente;
        this.fondo = fondo;
    }

    public float calcularImpuestos()
    {
        float superficie = frente * fondo;
        return superficie * 80;
    }
    public float calcularCerco()
    {
        float perimetro = 2 * frente + 2 * fondo;
        return perimetro * 3;
    }
}
