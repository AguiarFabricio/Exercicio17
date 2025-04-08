/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.exercicio17;

/**
 *
 * @author Fabricio de Aguiar
 *
 */
import javax.swing.JOptionPane;

public class Exercicio17 {

    public static void main(String[] args) {

        String entrada = JOptionPane.showInputDialog(
                "Digite a profissão do Tibúrcio:\n"
                + "programador\nmédico\nadvogado\ndesigner\nengenheiro"
        );

        if (entrada != null) {
            entrada = entrada.toLowerCase();
        }

        String profissao;

        switch (entrada) {
            case "programador":
                profissao = "Programador";
                break;
            case "médico":
                profissao = "Médico";
                break;
            case "advogado":
                profissao = "Advogado";
                break;
            case "designer":
                profissao = "Designer";
                break;
            case "engenheiro":
                profissao = "Engenheiro";
                break;
            default:
                profissao = "DESEMPREGADO";
        }

        JOptionPane.showMessageDialog(null, "Tibúrcio é " + profissao + ".");
    }
}
