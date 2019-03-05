//Calcular a fórmula: R = A + B / C^A - D 
package ldpRevisão;

import static java.lang.Math.pow;
import javax.swing.JOptionPane;

public class Exercício1 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int d;
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite o primeiro número:");
        a = Integer.parseInt(dado); 
        dado = JOptionPane.showInputDialog("Digite o segundo número:");
        b = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog("Digite o terceiro número:");
        c = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog("Digite o quarto número:");
        d = Integer.parseInt(dado);
        
        float r = (float) ((a+b)/ (Math.pow(c,a)-d));
        
        JOptionPane.showMessageDialog(null,"O resultado da expressão é: "+r);
        
    }
}
