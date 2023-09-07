package aula_construtor;

import javax.swing.JOptionPane;

/**
 *
 * @author Tatiana
 */
public class CalculadoraProf {

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public int subtracao(int num1, int num2) {
        return num1 - num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public int multiplicacao(int num1, int num2) {
        return num1 * num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public int divisao(int num1, int num2) {
        return num1 / num2;
    }

    public double divisao(double num1, double num2) {
        return num1 / num2;
    }

    public void menu() {
        Object[] itens = {"Somar", "Subtrair", "Multiplicar", "Dividir", "Sair"};
        String selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);

        while (!selectedItem.equals("Sair")) {
            String num1 = JOptionPane.showInputDialog("Informe o primeiro número");
            String num2 = JOptionPane.showInputDialog("Informe o segundo número");
            switch (selectedItem) {

                case "Somar":
                    if (num1.contains(".") || num2.contains(".")) {
                        JOptionPane.showMessageDialog(null, this.soma(Double.parseDouble(num1), Double.parseDouble(num2)));
                    } else {
                        JOptionPane.showMessageDialog(null, this.soma(Integer.parseInt(num1), Integer.parseInt(num2)));
                    }
                    break;
                case "Subtrair":
                    if (num1.contains(".") || num2.contains(".")) {
                        JOptionPane.showMessageDialog(null, this.subtracao(Double.parseDouble(num1), Double.parseDouble(num2)));
                    } else {
                        JOptionPane.showMessageDialog(null, this.subtracao(Integer.parseInt(num1), Integer.parseInt(num2)));
                    }
                    break;
                case "Multiplicar":
                    if (num1.contains(".") || num2.contains(".")) {
                        JOptionPane.showMessageDialog(null, this.multiplicacao(Double.parseDouble(num1), Double.parseDouble(num2)));
                    } else {
                        JOptionPane.showMessageDialog(null, this.multiplicacao(Integer.parseInt(num1), Integer.parseInt(num2)));
                    }
                    break;
                case "Dividir":
                    if (!num2.equals("0")) {
                        if (num1.contains(".") || num2.contains(".")) {
                            JOptionPane.showMessageDialog(null, this.divisao(Double.parseDouble(num1), Double.parseDouble(num2)));
                        } else {
                            JOptionPane.showMessageDialog(null, this.divisao(Integer.parseInt(num1), Integer.parseInt(num2)));
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Impossível calcular");
                    }
                    break;
                default:
                    throw new AssertionError();
            }
            selectedItem = (String) JOptionPane.showInputDialog(null, "Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens[0]);
        }
    }
}
