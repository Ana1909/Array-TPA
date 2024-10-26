/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class ExercicioUm {
    public static void main(String[] args) {
        String[] n = {"Ana","Sofia","Beatriz","Millena","Mariana","Giovanna","Yasmim","Jayane","Julia","Shaylane"};
        
        Arrays.sort(n);
        
        System.out.println("Nomes em ordem Alfabetica: ");
        for(String no : n){
            System.out.println(no);
        }
    }
}
