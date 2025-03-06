package conjunto;

import java.util.Scanner;

public class Conjunto {
    public int lerElementos(double[] vet){
        String opcao;
        int cont = 0;
        Scanner teclado = new Scanner(System.in);
        

        do {
            System.out.println("Informe ");
            vet[cont++] = teclado.nextDouble();
            System.out.println("Deseja informar outro elemento? (sims/s)");
            opcao = teclado.next();

        } while ((opcao.equalsIgnoreCase("s") || opcao.equalsIgnoreCase("sim")) && cont < 10);

        return cont;


    }
    public void imprimirElementos(double[] vet,int cont) {
        for(int i = 0; i < cont; i++) {
            System.out.println(vet[i] + "   ");
            System.out.println();
        } 
    }
    public int lerElementos(){

    }

    public void imprimirElementos(){

    }

    public int uniao(double[] vet1, double[] vet2){

    }

    public int intersecao(double[] vet1, double[] vet2){

    }

    public int diferenca(double[] vet1, double[] vet2){

    }

    public int produtoCartesiano(double[] vet1, double[] vet2){

    }

    public int conjuntoDasPartes(double[] A, double[] B){
        
    }
}
