//Ler vários números de um array de 10 elementos, 
//mostrar os números impares e sua posição no array.
package ldpRevisão;

import javax.swing.JOptionPane;

public class Exercício4 {
    public static void main(String[] args) {
        
        int[] arrayInt = new int[10];
        int i = 0;
        int impar = 0;
        String dado;
        
         dado = JOptionPane.showInputDialog(null, "Digite um valor");
         arrayInt[i] = Integer.parseInt(dado);
        

            for (i = 0; i < 10; i++) {
            dado = JOptionPane.showInputDialog(null, "Digite um valor");
            arrayInt[i] = Integer.parseInt(dado);
             if(arrayInt[i] % 2 !=1){
                 
             }
                    
            
        }
        JOptionPane.showMessageDialog(null,"Posição: "+(i+1)+ "Número:" +arrayInt[i]);
    }
}
// incompleto :/