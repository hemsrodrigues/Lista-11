// Ler uma string digitada pelo usuário e mostrar: o número de caracteres da string; 
//a string com todas suas letras em maiúsculo; a string com todas suas letras em minúsculas; 
//se possui a letra 's'; se possui a letra 'y'; se começa com a letra 'd' 
//ou letra com a letra 'f'; se termina com a letra 'r'. 
package ldpRevisão;

import javax.swing.JOptionPane;

public class Exercício5 {
    public static void main(String[] args) {
        String dado;
        dado = JOptionPane.showInputDialog("Digite uma palavra:");
        
        System.out.println("Números de caracteres da sua palavra:" +dado.length());
        System.out.println(dado.toLowerCase());
        System.out.println(dado.toUpperCase());
        System.out.println("Começa com R? " +dado.startsWith("r"));
        System.out.println("Termina com D? " +dado.endsWith("d"));
        System.out.println("Começa com F? " +dado.startsWith("f"));
        System.out.println("Termina com R? " +dado.endsWith("r"));
     
    }
}
