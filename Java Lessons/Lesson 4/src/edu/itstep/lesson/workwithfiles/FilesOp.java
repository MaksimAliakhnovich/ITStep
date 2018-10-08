package edu.itstep.lesson.workwithfiles;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Student on 24.01.2018.
 */
public class FilesOp {

    public void workFiles3() throws IOException {

        File dir = new File("d:\\IdeaProjects\\24.01.18\\newdir");
        File file1 = new File(dir.getPath() + "\\file1.txt");

        try {
            dir.mkdir();
            file1.createNewFile();

            FileWriter fw = new FileWriter(file1);

            for (int f = 1; f < 4; f++) {
                fw.write("Строка: " + f + "\n");
                fw.flush();
            }
            fw.close();
        } catch (IOException e) {
            System.out.println("Ошибка создания/записи файла");
        }

        File file2 = new File(dir.getPath() + "\\file2.txt");

        try {
            file2.createNewFile();
        } catch (IOException e) {
            System.out.println("Ошибка создания file2");
        }

        FileReader fr1 = new FileReader(file1);
        Scanner scan1 = new Scanner(fr1);

        FileWriter fw2 = new FileWriter(file2);

        try {
            while (scan1.hasNextLine()) {
                fw2.write(scan1.nextLine());
            }
            fw2.flush();
        } catch (IOException e) {
            System.out.println("Ошибка чтения file1 или записи file2");
        }

        FileReader fr2 = new FileReader(file2);
        Scanner scan2 = new Scanner(fr2);

        while (scan2.hasNextLine()) {
            System.out.println(scan2.nextLine());
        }
    }
}

