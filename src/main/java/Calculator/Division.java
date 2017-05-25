package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Division {

    private double a;
    private String znak;
    private double b;

    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void divide() {

        System.out.println("Введіть а");
        while (true) {
            try {
                a = Double.parseDouble(reader.readLine());// зчитує дані з консолі і перетворює в дабл
                break;
            } catch (Exception e) {
                System.out.println("помилка введіть число ");
            }
        }

        System.out.println("Введіть дію");
        while (true) {
            try {
                znak = reader.readLine();
                if (znak.equals("/"))
                    break;
                else
                    System.out.println("помилка введіть дію");
            } catch (IOException q) {
                //  просто пройде далі
            }
        }

        System.out.println("Введіть б");
        while (true) {
            try {
                b = Double.parseDouble(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("помилка введіть число ");
            }
        }

        if (znak.equals("/")) {
            double res;
            res = a / b;
            System.out.println("res = " + res);
        }
    }
}
