/**
 * Created by User on 13.02.2017.
 */
import java.util.*;

public class Array {
    public static int[] createArray(){
        System.out.println("Введите количество элеменов массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Введите число");
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr){
        for(int element:arr){
            System.out.println(element);
        }
    }

    public static void printReverseArray(int[] arr){
        for(int i = arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = Array.createArray();
        printArray(arr);
        Arrays.sort(arr);
        System.out.println("В порядке возрастания");
        printArray(arr);
        System.out.println("В порядке убывания");
        printReverseArray(arr);
    }
}
