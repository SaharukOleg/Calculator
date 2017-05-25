package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multiplication {
    private double a;
    private String znak;
    private double b;

    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void multiply() {
        System.out.println("Введіть а");
       while (true){
           try {
               a=Double.parseDouble(reader.readLine());
               break;
           }catch (Exception e){
               System.out.println("Помилка введіть вірно число ");
           }
       }

        System.out.println("Введіть дію");
        while (true){
            try {
                znak=reader.readLine();
                if(znak.equals("*"))
                    break;
                else
                    System.out.println("помилка введіть дію (*)");
            }catch (IOException io){

            }
        }

        System.out.println("Введіть б");
        while (true){
            try {
                b=Double.parseDouble(reader.readLine());
                break;
            }catch (Exception e){
                System.out.println("Помилка введіть вірно число ");
            }
        }
        if (znak.equals("*")) {
            double res;
            res = a * b;
            System.out.println("res = " + res);
        }

    }

}
