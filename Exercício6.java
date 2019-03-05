//Ler um valor numérico digitado pelo usuário, 
//imprima cada um dos seus dígitos por extenso.
package ldpRevisão;

import javax.swing.JOptionPane;

public class Exercício6 {

    public static void main(String[] args) {
        double num;
        String dado;
        dado = JOptionPane.showInputDialog("Digite um número:");
        num = Integer.parseInt(dado);

        num = Double.parseDouble(dado);

        for (char p : dado.toCharArray()) {

            switch (p) {

                case '0':
                    System.out.print("zero; ");
                    break;
                case '1':
                    System.out.print("um; ");
                    break;
                case '2':
                    System.out.print("dois; ");
                    break;
                case '3':
                    System.out.print("três; ");
                    break;
                case '4':
                    System.out.print("quatro; ");
                    break;
                case '5':
                    System.out.print("cinco; ");
                    break;
                case '6':
                    System.out.print("seis; ");
                    break;
                case '7':
                    System.out.print("sete; ");
                    break;
                case '8':
                    System.out.print("oito; ");
                    break;
                case '9':
                    System.out.print("nove; ");
                    break;
            }

        }
    }
}
