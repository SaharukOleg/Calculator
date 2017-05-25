package Calculator;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Minus {

    private double a;
    private String znak;
    private double b;

    public BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void subtract() {
        System.out.println("Введіть число б");
        while (true){
           try {
               a = Double.parseDouble(reader.readLine());
               break;
           }catch (Exception e){
               System.out.println("Помилка !!! введіть число ");
           }
        }


        System.out.println("Введіть дію ділення ( / )");
        while (true){
            try {
                znak = reader.readLine();
                if (znak.equals("/"))
                    break;
                else
                    System.out.println("Помилка введіть дію ділення ( / ) ");
            }catch (IOException io){

            }
        }

        System.out.println("Введіть число а");
        while (true){
            try {
                b=Double.parseDouble(reader.readLine());
                break;
            }catch (Exception e){
                System.out.println("Помилка !!! введіть число ");
            }
        }

        if (znak.equals("-")) {
            double res;
            res = a - b;
            System.out.println("res = " + res);
        }

    }




}
