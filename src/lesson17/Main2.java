package lesson17;

import java.io.File;
import java.io.FileFilter;

public class Main2 {
    public static void main(String[] args) {
        File file=new File("./src/lesson17");

      File [] filesLesson17= file.listFiles();
        for (File f: filesLesson17){
            System.out.println(f.getName());
        }

        File [] files17=file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isDirectory()){
                    return true;
                }
                return false;
            }
        });
        for (File f: files17){
            System.out.println(f.getName());
        }


    }
}
