package conjunto;

public interface ConjuntoInterface {
    public int lerElementos();

    public void imprimirElementos();

    public int uniao(double[] vet1, double[] vet2);

    public int intersecao(double[] vet1, double[] vet2);

    public int diferenca(double[] vet1, double[] vet2);

    public int produtoCartesiano(double[] vet1, double[] vet2);

    public int conjuntoDasPartes(double[] A, double[] B);

}