package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo");
        System.out.println("Quantas notas você quer adicionar?");
        int qtd = scanner.nextInt();

        double soma = 0;


        for (int i = 1; i <= qtd; i++) {
            System.out.println("digite nua "+i+" nota");
            double nota = scanner.nextDouble();
            soma= soma + nota;

        }
        System.out.println("a sua media foi = " + (soma/qtd));
    }
}