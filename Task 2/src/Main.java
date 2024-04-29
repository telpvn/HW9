import java.util.Scanner;

public class Main {
    public static int number = 0;

    public static void main(String[] args) {
        //Написать программу, в которой пользователь вводит целое число.
        //Если число четное, то печатаем true, если не четное, печатаем false
        //В методе main НЕ ДОПУСТИМО написание какого либо кода, кроме вызова методов.
        //Методы и их логику продумайте сами
//        numberInput();
        System.out.println("Введите число: ");
        System.out.println();
        number = new Scanner(System.in).nextInt();
        System.out.println(number % 2 == 0);
    }
}
