// Ler um nome informado pelo usuário, exiba suas iniciais.
package ldpRevisão;

import javax.swing.JOptionPane;

public class Exercício7 {
    public static void main(String[] args) {
        String nome = " ";
        
        nome = JOptionPane.showInputDialog("Digite seu nome completo:");
        nome = nome.replaceAll("da|das|do|dos", "");
	nome = nome.replaceAll("\\B\\w\\s*", "").toUpperCase();
        
        System.out.println(nome);
    }
}
