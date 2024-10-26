/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class ExercicioSeis {
     public static void main(String[] args) {
        int[] numeros = new int[100];
        Random random = new Random();

        // Preenche o array com números aleatórios entre 0 e 999
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(1000);
        }

        // Imprime os índices dos números ímpares
        System.out.println("Índices dos números ímpares:");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}

