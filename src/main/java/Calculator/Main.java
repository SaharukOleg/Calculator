package Calculator;

import java.util.Scanner;

public class Main {

    Add add = new Add();
    Minus minus = new Minus();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();
    Sqrt sqrt = new Sqrt();
    Power power = new Power();
    Sin sin = new Sin();
    Cosinus cosinus = new Cosinus();
    static Tangens tangens = new Tangens();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Add add = new Add();
        Minus minus = new Minus();
        Multiplication multiplication = new Multiplication();
        Division division = new Division();
        Sqrt sqrt = new Sqrt();
        Power power = new Power();
        Sin sin = new Sin();
        Cosinus cosinus = new Cosinus();

        while (true) {
            System.out.println(">1 Дія додавання");
            System.out.println(">2 Дія віднімання");
            System.out.println(">3 Дія множення");
            System.out.println(">4 Дія ділення");
            System.out.println(">5 знайти корінь");
            System.out.println(">6 піднести до степеня");
            System.out.println(">7 знайти sin");
            System.out.println(">8 знайти cos");
            System.out.println(">9 знайти tg");

            System.out.println(">0 Завершити програму ");

            switch (sc.next()) {
                case "1":
                    add.plus();
                    break;
                case "2":
                    minus.subtract();
                    break;
                case "3":
                    multiplication.multiply();
                    break;
                case "4":
                    division.divide();
                    break;
                case "5":
                    sqrt.sqrt();
                    break;
                case "6":
                    power.upPuwer();
                    break;
                case "7":
                    sin.sinus();
                    break;
                case "8":
                    cosinus.cos();
                    break;
                case "9":
                    tangens.tg();

                case "0":
                default:
                    System.exit(0);
            }
        }
    }
}