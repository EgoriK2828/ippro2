import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
        String text = "Привет, мир!, Hello Ekaterina Alekseevna";
        try (OutputStreamWriter writer = new OutputStreamWriter(System.out, StandardCharsets.UTF_8)) {
            writer.write(text);
            writer.flush(); // Убедимся, что всё записано
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
class checker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число");
        int number = scanner.nextInt();

        if (number % 2 ==0) {
            System.out.println("четное");
        } else {
            System.out.println("нечетное");
        }
    }
}