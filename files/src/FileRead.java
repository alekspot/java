import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) {
        String fileName = Console.inputText("Введите название файла");

        File file = new File("C:\\Users\\user\\Desktop\\dz\\learn\\files\\" + fileName);

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter writer = new FileWriter(file);

            writer.write(Console.inputText("Введите текст"));
            writer.close();

        } catch (IOException exception) {
            exception.getMessage();
        }





    }
}
