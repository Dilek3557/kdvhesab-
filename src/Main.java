import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double tutar , kdvo;
        Scanner input =new Scanner(System.in);
         tutar=input.nextInt();
         if(tutar>0 &&tutar<=1000){
             kdvo=0.18;
        }
         else{
             kdvo=0.08;
        }
         double kdvtutar=tutar*kdvo;
        System.out.println(kdvtutar);

        }
    }
