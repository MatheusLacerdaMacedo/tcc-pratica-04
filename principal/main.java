import conjunto.Conjunto;
public class main {
    public static void main(String[] args) {
        int cardinalidadeA = 0;
        int cardinalidadeB = 0;
        double[] A = new double[10];
        double[] B = new double[10];

        Conjunto conjunto = new Conjunto();
        
        System.out.println("Leitura dos elementos do Conjunto A");
        cardinalidadeA = conjunto.lerElementos(A);

        System.out.println("Leitura dos elementos do Conjunto B");
        cardinalidadeA = conjunto.lerElementos(B);

        System.out.println("Elementos do conjunto A: ");
        conjunto.imprimirElementos(A, cardinalidadeA);

        System.out.println("Elementos do conjunto B: ");
        conjunto.imprimirElementos(A, cardinalidadeB);
    }
}