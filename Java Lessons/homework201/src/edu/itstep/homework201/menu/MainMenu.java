package edu.itstep.homework201.menu;

import edu.itstep.homework201.homework201.Homework201;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainMenu {

    public void getMainMenu() {

        Homework201 homework201 = new Homework201();

        while (true) {

            int menuItem = getMainMenuItems();

            switch (menuItem) {
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    homework201.task01();
                    break;
                case 2:
                    homework201.task02();
                    break;
                case 3:
                    homework201.task03();
                    break;
                case 4:
                    homework201.task04();
                    break;
                case 5:
                    homework201.task05();
                    break;
                case 6:
                    homework201.task06();
                    break;
                case 7:
                    homework201.task07();
                    break;
                case 8:
                    homework201.task08();
                    break;
                case 9:
                    homework201.task09();
                    break;
                case 10:
                    homework201.task10();
                    break;
                case 11:
                    homework201.task11();
                    break;
                case 12:
                    homework201.task12();
                    break;
                case 13:
                    homework201.task13();
                    break;
                case 14:
                    homework201.task14();
                    break;
                case 15:
                    homework201.task15();
                    break;
                case 16:
                    homework201.task16();
                    break;
            }
        }
    }

    private int getMainMenuItems() {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Введите номер метода: ");
        try {
            return Integer.parseInt(bufferedReader.readLine());
        } catch (IOException e) {
            System.out.println("Ошибка преобразования в число, error = " + e.toString());
//            e.printStackTrace();
        }
        return 0;
    }
}
