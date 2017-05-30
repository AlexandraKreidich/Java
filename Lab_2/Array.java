import java.util.*;

/**
 * Class {@code Array} is my second lab
 * @author Kreidch Alexandra
 */

public class Array {
    static String fio;
    static Date getDateOfTask;
    static Date getDateOfFinishTask;

    /**
     * Create a FIO of author
     * @return FIO
     */
    static String ImputFio() {
        String fio = "Alexandra Kreidich";
        return fio;
    }

    /**
     * Stores the data of getting this task
     * @return the data
     */
    static Date getDateOfBeginTask() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2017);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 16);
        cal.set(Calendar.HOUR_OF_DAY, 13);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        Date getDateOfTask = cal.getTime();
        System.out.println("DATE OF GETTING TASK: " + getDateOfTask);
        return getDateOfTask;
    }

    /**
     * Creates today's data
     * @return today's data
     */
    static Date getDateOfFinishTask() {
        Date getDateOfFinishTask = new Date();
        GregorianCalendar dateOfFinishTask = new GregorianCalendar();
        getDateOfFinishTask = dateOfFinishTask.getTime();
        System.out.println("DATE OF FINISHING TASK: " + getDateOfFinishTask);
        return getDateOfFinishTask;
    }

    /**
     * Creates an array from user input
     * @return array
     */
    public static int[] createArray(){
        System.out.println("Введите количество элеменов массива");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите числа ");
        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    /**
     * Prints the array
     * @param arr
     */
    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.println(element);
        }
    }

    /**
     * Counts the length of the number
     * @param a number
     * @return length
     */
    public static int countNumberLength(int a){
        int count =0;
        while(a!=0){
            a/=10;
            count ++;
        }
        return count;
    }

    /**
     * Finds the average length of all elements of array arr
     * @param arr
     * @return average
     */
    public static float findAverage(int[] arr){
        float average = 0;
        int[] len = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            len[i] = countNumberLength(arr[i]);
        }
        for(int i=0; i<arr.length; i++){
            average+=len[i];
        }
        average=average/arr.length;
        System.out.println("avg = " + average);
        return average;
    }

    /**
     * Prints the numbers of an array which length is less than average
     * @param arr
     */
    public  static void printNumbersLessThanAverage(int [] arr){
        float average = findAverage(arr);
        for(int elem : arr){
            if(countNumberLength(elem) < average){
                System.out.print(elem + " ");
            }
        }
    }

    /**
     * Prints the numbers of an array which length is more than average
     * @param arr
     */


    public static void printNumbersMoreThanAverage(int[] arr){
        float average = findAverage(arr);
        for(int i=0; i<arr.length; i++){
            if(countNumberLength(arr[i])>average) System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = createArray();
        printArray(arr);
        System.out.println("больше среднего:");
        printNumbersMoreThanAverage(arr);
        System.out.println(" ");
        System.out.println("меньше среднего:");
        printNumbersLessThanAverage(arr);
        System.out.println(" ");
        System.out.println("Длина массива: " + arr.length);
        String fio = ImputFio();
        getDateOfBeginTask();
        getDateOfFinishTask();
        System.out.println("Author is " + fio);
    }
}
