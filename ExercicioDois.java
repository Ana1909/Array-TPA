/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;
import java.util.Collections;
/**
 *
 * @author Usuario
 */
public class ExercicioDois {
    public static void main(String[] args) {
        String[] n = {"Ana","Sofia","Beatriz","Millena","Mariana","Giovanna","Yasmim","Jayane","Julia","Shaylane","Renan","Igor","Higor","Rodrigo","Felipe","Wallex","Gustavo","João","Guilherme","Victor"};
        
        Arrays.sort(n, Collections.reverseOrder());

        System.out.println("Nomes em ordem descrescente:  ");
        for(String no : n){
            System.out.println(no);
        }
    }
}
    
