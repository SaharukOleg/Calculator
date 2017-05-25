package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Tangens {
    private double a;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void tg() {
        System.out.println("введіть число ");
        while (true) {
            try {
                a = Double.parseDouble(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("введіть вірно число");
            }
        }
        System.out.println("Котангенс вашого числа = " + Math.tan(a));
    }
}
