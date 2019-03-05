// Faça um programa que, a partir de um texto digitado pelo usuário, 
//conte o número de caracteres total e o número de palavras e exiba o resultado.
package ldpRevisão;

import javax.swing.JOptionPane;

public class Exercício8 {
    public static void main(String[] args) {
        String dado;
        int quant = 0;
        dado = JOptionPane.showInputDialog("Digite algo:");
        
        for(int i = 0; i < dado.length(); i++){
			if(dado.charAt(i) == ' '){
                           quant++;
			}
		}
        System.out.println("Números de caracteres:");
        System.out.println( dado.length() - quant);
        System.out.println("Números de palavras é:");
        System.out.println( quant + 1);
        
    }
}
