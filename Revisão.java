package ldpRevisão;

import javax.swing.JOptionPane;

public class Revisão {

    public static void main(String[] args) {
        String dado;
        char op = 0;

        do {
            dado = JOptionPane.showInputDialog("Escolha uma opção: \n"
                    + "Opção 1 \n" + "Opção 2 \n" + "Opção 3 \n" + "Opção 4 \n" + "Opção 5 \n" + "Opção 6 \n" + "Opção 7 \n"
                    + "Opção 8 \n" + "Opção 9 \n");

            op = dado.charAt(0);

            switch (op) {
                case '1':
                    dado = JOptionPane.showInputDialog("Digite o primeiro número:");
                    int a = Integer.parseInt(dado);
                    dado = JOptionPane.showInputDialog("Digite o segundo número:");
                    int b = Integer.parseInt(dado);
                    dado = JOptionPane.showInputDialog("Digite o terceiro número:");
                    int c = Integer.parseInt(dado);
                    dado = JOptionPane.showInputDialog("Digite o quarto número:");
                    int d = Integer.parseInt(dado);

                    float r = (float) ((a + b) / (Math.pow(c, a) - d));

                    JOptionPane.showMessageDialog(null, "O resultado da expressão é: " + r);
                    break;
                case '2':
                    dado = JOptionPane.showInputDialog("Digite o número de aulas:");
                    int aula = Integer.parseInt(dado);
                    dado = JOptionPane.showInputDialog("Digite o número de faltas:");
                    int falta = Integer.parseInt(dado);
                    dado = JOptionPane.showInputDialog("Digite a primeira nota:");
                    int n1 = Integer.parseInt(dado);
                    dado = JOptionPane.showInputDialog("Digite a segunda nota:");
                    int n2 = Integer.parseInt(dado);
                    dado = JOptionPane.showInputDialog("Digite a terceira nota:");
                    int n3 = Integer.parseInt(dado);

                    float media = (n1 + n2 + n3) / 3;
                    falta = (falta / aula) * 100;

                    if (media >= 6 && falta <= 25) {
                        JOptionPane.showMessageDialog(null, "Aprovado");
                    } else {
                        JOptionPane.showMessageDialog(null, "Reprovado");
                    }
                    break;
                case '3':
                    int[] array = new int[10];
                    int posicao;
                    int menor;
                    int maior;

                    for (int i = 0; i < 10; i++) {
                        dado = JOptionPane.showInputDialog("Digite o número: ");
                        array[i] = Integer.parseInt(dado);
                    }

                    menor = array[0];
                    maior = array[0];
                    for (int i = 0; i < 10; i++) {
                        if (array[i] < menor) {
                            posicao = menor;
                            menor = array[i];
                            array[i] = posicao;

                        }
                        if (array[i] > maior) {
                            posicao = maior;
                            maior = array[i];
                            array[i] = posicao;
                        }
                    }
                    array[0] = menor;
                    array[9] = maior;
                    JOptionPane.showMessageDialog(null, "O menor: " + array[0] + "\n" + "O maior: " + array[9]);
                    for (int i = 0; i < 10; i++) {
                        System.out.println("Posicão: " + (i + 1) + " " + array[i]);
                    }
                    break;

                case '4':
                    int[] arrayInt = new int[10];
                    int i = 0;
                    int impar = 0;

                    dado = JOptionPane.showInputDialog(null, "Digite um valor");
                    arrayInt[i] = Integer.parseInt(dado);

                    for (i = 0; i < 10; i++) {
                        dado = JOptionPane.showInputDialog(null, "Digite um valor");
                        arrayInt[i] = Integer.parseInt(dado);
                        if (arrayInt[i] % 2 != 1) {

                        }

                    }
                    JOptionPane.showMessageDialog(null, "Posição: " + (i + 1) + "Número:" + arrayInt[i]);
                    break;
                case '5':
                    dado = JOptionPane.showInputDialog("Digite uma palavra:");

                    System.out.println("Números de caracteres da sua palavra:" + dado.length());
                    System.out.println(dado.toLowerCase());
                    System.out.println(dado.toUpperCase());
                    System.out.println("Começa com R? " + dado.startsWith("r"));
                    System.out.println("Termina com D? " + dado.endsWith("d"));
                    System.out.println("Começa com F? " + dado.startsWith("f"));
                    System.out.println("Termina com R? " + dado.endsWith("r"));
                    break;
                case '6':
                    double num;
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
                    break;
                case '7':
                    String nome = " ";

                    nome = JOptionPane.showInputDialog("Digite seu nome completo:");
                    nome = nome.replaceAll("da|das|do|dos|de|di", "");
                    nome = nome.replaceAll("\\B\\w\\s*", "").toUpperCase();

                    System.out.println(nome);
                    break;
                case '8':
                    int quant = 0;
                    dado = JOptionPane.showInputDialog("Digite algo:");

                    for (i = 0; i < dado.length(); i++) {
                        if (dado.charAt(i) == ' ') {
                            quant++;
                        }
                    }
                    System.out.println("Números de caracteres:");
                    System.out.println(dado.length() - quant);
                    System.out.println("Números de palavras é:");
                    System.out.println(quant + 1);
                    break;
                case '9':
                    JOptionPane.showMessageDialog(null, "Você escolheu sair, até mais!\n");
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!\n");

            }
        } while (op != '9');
    }
}
