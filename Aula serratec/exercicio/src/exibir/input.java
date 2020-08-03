package exibir;

import javax.swing.JOptionPane;

public class input {
    public static void main(String[] args) {
        String nota1 = JOptionPane.showInputDialog("Digite a nota 1:");
        String nota2 = JOptionPane.showInputDialog("Digite a nota 2:");

        double media = (Double.parseDouble(nota1) + Double.parseDouble(nota2))/2;
        
        JOptionPane.showMessageDialog(null,media);
    }
}