package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Power {
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    private double a;

    private double b;

    public void upPuwer() {
        System.out.println("Введіть число ");

        while (true) {
            try {
                a = Double.parseDouble(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("помилка введіть вірно число");
            }
        }

        System.out.println("до якого степеня підняти ?");
        while (true) {
            try {
                b = Double.parseDouble(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("помилка введіть вірно число");
            }
        }

        System.out.println(a + " в степені " + b + " = " + Math.pow(a, b));
    }
}
