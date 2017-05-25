package Calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sqrt {

    private double a;
    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void sqrt() {
        System.out.println("введіть число з якого ви хочите дістати корінь ");
        while (true) {
            try {
                a = Double.parseDouble(reader.readLine());
                break;
            } catch (Exception e) {
                System.out.println("Помилка введіть число ");
            }
        }
        System.out.println("корінь з " + a + " = " + Math.sqrt(a));
    }
}
