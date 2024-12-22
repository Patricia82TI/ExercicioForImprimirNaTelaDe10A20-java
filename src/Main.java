import java.util.Scanner;

//Faça um programa que imprima na tela os números de 10 a 20, de 2 em 2
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i;

        for(i = 10; i <= 20; i = i + 2){
            System.out.println(i);
        }
    }
}