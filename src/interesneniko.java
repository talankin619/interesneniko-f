import java.util.Random;

/*массив из 1000 элементов случайных чисел
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class interesneniko{
/**
 *
 * @author user
 */
public static void main(String[] args){
    Random rand = new Random();
     int[] array;
     array = new int[1000];
        for(int i = 0; i < 1000; i++){
        array[i] = rand.nextInt(1000);
        System.out.println(array[i]);
}
}
}