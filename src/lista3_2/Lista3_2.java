package lista3_2;

import javax.swing.JOptionPane;

public class Lista3_2 {
    public static void main(String[] args) {
        int escolha;
        int metragem = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a metragem: "));
        escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione a opção desejada: \n1. Tijolo de 6 furos\n2. Tijolo de 4 furos\n3. Tijolo Maciço"));
        switch(escolha){
            case 1:
                metragem *= 15;
                JOptionPane.showMessageDialog(null, "Serão necessários "+ metragem + " tijolos de 6 furos");
                break;
            case 2:
                metragem *=25;
                JOptionPane.showMessageDialog(null, "Serão necessários "+ metragem + " tijolos de 4 furos");
                break;
            case 3:
                metragem *= 30;
                JOptionPane.showMessageDialog(null, "Serão necessários "+ metragem + " tijolos maciços");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Código inválido");
        }
    }   
}
