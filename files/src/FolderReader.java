import java.io.File;
public class FolderReader {
    private static int count = 0;

    public static void main(String[] args) {
<<<<<<< HEAD
        String path = "C:\\Windows";
=======
        String path = "C:\\Users\\user\\Desktop\\dz\\learn\\files";
>>>>>>> github/master
        File dir = new File(path);
        System.out.printf("-------------- %s ---------------\n", path);

        readFolder(dir, 0);

        System.out.printf("-------------- Количество файлов: %s ----------------\n", count);
    }

    public static void readFolder(File file, int offset) {
        if (file.isFile()) {
            count = count + 1;
        } else {
            File[] files = file.listFiles();

<<<<<<< HEAD
            if(files == null) {
                return;
            }

=======
>>>>>>> github/master
            for (int i = 0; i < files.length; i++) {
                boolean isFile = files[i].isFile();

                String tab = "";

                for (int j = 0; j < offset; j++) {
                    tab = tab + "    ";
                }

                System.out.println(tab + (isFile ? "Файл  | " : "Папка | ") + files[i].getName());

                readFolder(files[i], offset + 1);
            }
        }
    }
}
