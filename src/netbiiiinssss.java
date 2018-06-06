
import java.util.Random;

/*получить jar фаил что бы ты мог передать значения и он их вывел 25 раз. написать етбииинсссс ввести слово и кол во раз. и он должэен вывести.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class netbiiiinssss{
/**
 *
 * @author user
 */
public static void main(String[] args) {
    Random rand = new Random();
    int[] array;
    array = new int[25];
        for(int i = 0; i < 25; i++){
        array[i] = rand.nextInt(25);
        System.out.println (array[i]);
}
}                
}
