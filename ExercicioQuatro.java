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
public class ExercicioQuatro {
    public static void main(String[] args) {
        String[] num ={"1","2","3","4","5","6","7","8","9","10","15","20","25","30","35","40","45","50","55","60","65","70","75","80","85","90","95","100","105","110","115","120","125","130","11","12","13","14","16","17","18","19","21","22","23","24","26","27","28","29"};
    
     Arrays.sort(num, Collections.reverseOrder());
    
        System.out.println("Números em ordem decrescente: ");
        for(String nu : num){
            System.out.println(nu);
        }
    }
}

