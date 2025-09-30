import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
class HelloWorld {
    public static void main(String[] args) {
        String text = "Привет, мир!, this is a branch main";
        try (OutputStreamWriter writer = new OutputStreamWriter(System.out, StandardCharsets.UTF_8)) {
            writer.write(text);
            writer.flush(); // Убедимся, что всё записано
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
