import java.util.Scanner;
import java.util.InputMismatchException;

//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
//Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
public class Task1{
public static void main(String[] args){
    float number = inputFromUser();
    System.out.println("You entered a number " + number);
}

private static float inputFromUser(){
    float result = 1;
    System.out.println("Enter a floating point number (using ','): ");
    Scanner scanner = new Scanner(System.in);
    boolean flag = false;
    while (!flag) {
        try {
            result = scanner.nextFloat();
            flag = true;
        } catch (InputMismatchException e) {
            scanner.nextLine();
            System.out.println("Invalid Input! Repeat again!");
        }
    }
    scanner.close();
    return result;
}
}


