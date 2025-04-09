package com.mycompany.exercicio18;

import javax.swing.JOptionPane;

public class Exercicio18 {

    public static void main(String[] args) {

        String nome = JOptionPane.showInputDialog("Digite o seu nome: ");

        String categoria = JOptionPane.showInputDialog(
                nome + "Escolha uma categoria:\n"
                + "A - Preço: R$10.50\n"
                + "B - Preço: R$20\n "
                + "C - Preço: R$50\n"
                + "D - Preço: R$30\n"
                + "E - Preço: R$200\n"
        );

        categoria = categoria.toUpperCase();

        double preco = 0;
        double desconto = 0;

        switch (categoria) {
            case "A":
                preco = 10.50;
                desconto = preco * 0.10;
                break;

            case "B":
                preco = 20;
                desconto = preco * 0.15;
                break;

            case "C":
                preco = 50;
                desconto = preco * 0.2;
                break;

            case "D":
                preco = 30;
                desconto = preco * 0.25;
                break;

            case "E":
                preco = 200;
                desconto = preco * 0.5;
                break;
        }
        double precoFinal = preco - desconto;

        JOptionPane.showMessageDialog(null,
                nome + ", o valor original é R$" + preco
                + "\nDesconto: R$" + desconto
                + "\nPreço com desconto: R$" + precoFinal);

    }

}
