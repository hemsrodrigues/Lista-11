//Ler o percentual de faltas e três notas de um aluno, 
//calcular a média e mostrar a mensagem aprovado, 
//se o aluno obtiver média maior ou igual a 6 com menos de 25% de faltas.
package ldpRevisão;

import javax.swing.JOptionPane;

public class Exercício2 {
    public static void main(String[] args) {
        int falta;
        int n1;
        int n2;
        int n3;
        int aula;
        float media = 0;
        String dado;
        
        dado = JOptionPane.showInputDialog("Digite o número de aulas:");
        aula = Integer.parseInt(dado); 
        dado = JOptionPane.showInputDialog("Digite o número de faltas:");
        falta = Integer.parseInt(dado); 
        dado = JOptionPane.showInputDialog("Digite a primeira nota:");
        n1 = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog("Digite a segunda nota:");
        n2 = Integer.parseInt(dado);
        dado = JOptionPane.showInputDialog("Digite a terceira nota:");
        n3 = Integer.parseInt(dado);
        
        media = (n1 + n2 + n3)/3;
        falta = (falta/aula)*100;
                
        if(media>=6 || falta<=25){
        JOptionPane.showMessageDialog(null,"Aprovado");
        }else{
        JOptionPane.showMessageDialog(null,"Reprovado");
        }
    }
}
