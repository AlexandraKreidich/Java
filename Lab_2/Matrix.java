/**
 * Created by User on 02.03.2017.
 */

import java.util.*;

public class Matrix {

    public static Integer[][] createArray(){
        System.out.println("Введите количество строк массива");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println("Введите количество столбцов массива");
        int n = scan.nextInt();
        Integer[][] arr = new Integer[m][n];

        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = (int) (Math.random() * n*2 -n);

        return arr;
    }

    public static Integer[][] enterArray(){
        System.out.println("Введите количество строк массива");
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        System.out.println("Введите количество столбцов массива");
        int n = scan.nextInt();
        Integer[][] arr = new Integer[m][n];
        System.out.println("Введите числа");
        for(int i=0; i<arr.length; i++)
            for(int j=0; j<arr[i].length; j++)
                arr[i][j] = scan.nextInt();

        return arr;
    }

    public static void printArray(Integer[][] arr){
        for(int i=0; i<arr.length; i++){
            for (int j=0; j<arr[i].length; j++) {
                if ((arr[i][j] < 10) && (arr[i][j] >= 0))
                    System.out.print(" " + arr[i][j].toString() + " ");
                else System.out.print(arr[i][j].toString() + " ");
            }
            System.out.println();
        }
    }

    public static boolean isMaxInColumn(Integer[][] arr, int num, int column){
        int max = num;
        for(int i=0; i<arr.length; i++){
            if(arr[i][column]>max) max = arr[i][column];
        }
        if(max == num)return true;
        else return false;
    }

    public static ArrayList findSaddlePoint(Integer[][] arr){
        ArrayList points = new ArrayList();
        int numb = arr[0][0];
        int column = 0;
        for(int i=0; i< arr.length; i++){
            for (int j = 0; j<arr[i].length; j++){
                if(numb > arr[i][j]) {
                    numb = arr[i][j];
                    column = j;
                }
            }
            if(isMaxInColumn(arr, numb, column)) points.add(numb);
        }
        return points;
    }

    public static void main(String[] args) {
        Integer [][] matrix = createArray();
        printArray(matrix);
        ArrayList<Integer> result = findSaddlePoint(matrix);
        if(result.size() != 0) {
            for (int i = 0; i < result.size(); i++) {
                System.out.println(result.get(i));
            }
        }
        else System.out.print("Нет седловых точек");
    }
}
