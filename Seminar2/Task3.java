//Дан следующий код, исправьте его там, где требуется
/*Задание 3

public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}
 */
//Все классы исключений являются потомками класса Throwable, Exception является подклассом Throwable.  Первым должен быть указан тип исключения, генерируемого подклассом. 
// в случае кода, указанного в примере условие перехвата исключения, генерируемого подклассом, никогда не будет выполнено.


import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println(" Попытка деления на 0"); // так как у нас есть деление, то можно добавить исключение ArithmeticException 

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) { 
            System.out.println("Что-то пошло не так...");
        }
    }
     public static void printSum(Integer a, Integer b) throws FileNotFoundException { // это исключение лишнее, метод не работает с файлами
        System.out.println(a + b);
     }

    
}
