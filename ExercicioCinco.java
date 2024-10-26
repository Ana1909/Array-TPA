/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class ExercicioCinco {
    public static void main(String[] args) {
        
         // Criando um array com 100 números aleatórios
        int[] numeros = new int[100];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100); // Números aleatórios de 0 a 99
        }

        // Criando uma lista para armazenar os números pares
        List<Integer> pares = new ArrayList<>();

        // Percorrendo o array e adicionando os números pares à lista
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares.add(numero);
            }
        }

        // Imprimindo os números pares
        System.out.println("Números pares encontrados:");
        for (int numeroPar : pares) {
            System.out.print(numeroPar + " ");
        }
    }
}

