// Ler vários números de um array de 10 elementos, 
//identificar o menor elemento e colocar na 1a posição do array, 
//identificar o maior elemento e colocar na última posição do array.
package ldpRevisão;

import javax.swing.JOptionPane;

public class Exercício3 {
    public static void main(String[] args) {
        
        int[] arrayInt = new int[10];
        int [] vetor = null;
        int j;
        int i = 0;
        int maior = 0;
        int menor = 0;
        int aux = 0;
        String dado;
        
        dado = JOptionPane.showInputDialog(null, "Digite um valor");
        arrayInt[i] = Integer.parseInt(dado);
        

            for (i = 0; i < 4; i++) {
            dado = JOptionPane.showInputDialog(null, "Digite um valor");
            arrayInt[i] = Integer.parseInt(dado);
            
            for(j = 0; j < 4; j++){
                
                if (vetor[i] < vetor[j]) {
                    aux = vetor[i];
                    vetor[i] = vetor [j];
                    vetor[j] = aux;
                    // nao troca nenhum numero
                }
            }

        }

    }
}
