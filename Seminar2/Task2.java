// Если необходимо, исправьте данный код (задание 2)
/*try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */

public class Task2 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 0, 8, 5, 7};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (IndexOutOfBoundsException | ArithmeticException e) {   // добавилп exception, который будет следить чтобы не было выхода за пределы массива 
            System.out.println("Catching exception: " + e);
        }
    }
    
}
