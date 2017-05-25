package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sin {

    private double a;
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void sinus() {
        System.out.println("Введіть число");
        while (true) {
            try {
                a = Double.parseDouble(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Помилка введіть число");
            }
        }
        System.out.println("sin " + a + " = " + Math.sin(a));
    }
}
