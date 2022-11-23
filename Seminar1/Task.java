import java.util.Arrays;
import java.util.Scanner;



//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
public class Task {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Variant №1");
        divide(10, 2);
        divide(10,0);
        System.out.println();
        System.out.println("Variant №2");
        setValue(1,0);
        setValue(1,100);
        System.out.println();
        System.out.println("Variant №3");
        convertStringToInt();
        System.out.println();
        System.out.println("Task №3");

        int[] testArray1 = {5, 2, 3, 4, 5};
        int[] testArray2 = {1, 2, 3, 4, 1};
        
        System.out.println(Arrays.toString(subtractingArrays(testArray1, testArray2)));
        System.out.println();
        System.out.println("Task №4");
        System.out.println(Arrays.toString(dividingArrays(testArray1, testArray2)));
    }

    public static void divide(int x, int y) {
        try {
            System.out.println(x/y);
        } catch (ArithmeticException e) {
            System.out.println("Divide by zero");
        }
        
    }
    private static void setValue(int value, int index) {
        int[] array = new int [10];
        try {
            array[index] = value;
            System.out.println("Value is entered in an array element");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index was outside of bounds array!");
            
        }
        
    }
    private static void convertStringToInt() {
        try {
            System.out.println("Input number");
            String str = sc.nextLine();
            int number = Integer.parseInt(str);
            System.out.println("Number = " + number);

        } catch (NumberFormatException e) {
            System.out.println("\nInvalid number format");
        }
        
    }
    //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
    //каждый элемент которого равен разности элементов двух входящих массивов в той же ячейке. 
    //Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static int[] subtractingArrays(int[]firstArray, int[] secondArray) throws RuntimeException {
        if (firstArray.length != secondArray.length){
            throw new RuntimeException("FirstArray length don`t equal length of second array!");
        }
        int[] resultArray = new int[firstArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = firstArray[i] - secondArray[i];
        }
        return resultArray; 
    }
    //Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
    //каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
    //Если длины массивов не равны, необходимо как-то оповестить пользователя.
    public static int[] dividingArrays(int[]firstArray, int[]secondArray) throws RuntimeException {
        if (firstArray.length != secondArray.length){
            throw new RuntimeException("FirstArray length don`t equal length of second array!");
        }
        int[] resultArray = new int[firstArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            if (secondArray [i] ==0) {
                throw new RuntimeException("Divide by zero"); 
            } else {
                resultArray[i] = firstArray[i] / secondArray[i];
            }
        }
        return resultArray;

    }

}