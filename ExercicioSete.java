/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
class Time {
    String nome;
    int posicao;

    public Time(String nome, int posicao) {
        this.nome = nome;
        this.posicao = posicao;
    }
}

public class ExercicioSete {
        public static void main(String[] args) {
        Time[] tabela = new Time[20];

        tabela[0] = new Time("Botafogo", 1);
        tabela[1] = new Time("Palmeiras", 2);
        tabela[2] = new Time("Fortaleza", 3);
        tabela[3] = new Time("Flamengo", 4);
        tabela[4] = new Time("São Paulo", 5);
        tabela[5] = new Time("Internacional", 6);
        tabela[6] = new Time("Bahia", 7);
        tabela[7] = new Time("Cruzeiro", 8);
        tabela[8] = new Time("Atlético-MG", 9); 
        tabela[9] = new Time("Vasco da Gama", 10);
        tabela[10] = new Time("Fluminense", 11);
        tabela[11] = new Time("Criciúma", 12);
        tabela[12] = new Time("Grêmio", 13);
        tabela[13] = new Time("Bragantino", 14);
        tabela[14] = new Time("Juventude", 15);
        tabela[15] = new Time("EC Vitória", 16);
        tabela[16] = new Time("Corinthians", 17);
        tabela[17] = new Time("Athletico-PR", 18);
        tabela[18] = new Time("Cuiabá", 19);
        tabela[19] = new Time("Atlético-GO", 20);
   
        System.out.println("\nTabela de Classificação:");
        for (Time time : tabela) {
            System.out.println(time.posicao + "º " + time.nome);
        }
    }
}


