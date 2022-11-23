import java.util.Scanner;

//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class Task4 {
    public static void main(String[] args) {
  
        String result = null;
        try {
            result = inputText();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Input text:" + result);
    }
    private static String inputText() throws Exception {
        String result;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text ");
        result = scanner.nextLine();
        if (result.isEmpty()) {
            throw new Exception("Empty string cannot be entered");
        }
        return result;
    }
}

