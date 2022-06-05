import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                    int a ;
                    int b;
                    char x;
                    int p;
                    int min;
                    int max ;
                            System.out.println("введите число 1 (от 1 до 10): ");
                            a = in.nextInt();
                            min = 0;
                            max = 10;
                            if (a <= min){
                                try {
                                    throw new java.io.IOException();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                            if (a >= max){
                            try {
                             throw new java.io.IOException();
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                             }
                System.out.println("введите число 2 (от 1 до 10): ");
                b = in.nextInt();
                min = 0;
                max = 10;
        if (b <= min){
            try {
                throw new java.io.IOException();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (b >= max){
            try {
                throw new java.io.IOException();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
                System.out.println("введите действие (+) (-) (*) (/)): ");
            x = in.next().charAt(0);
                switch (x) {
                    case '+':
                        p = a + b;
                        break;
                    case '-':
                        p = a - b;
                        break;
                    case '*':
                        p = a * b;
                        break;
                    case '/':
                        p = a / b;
                        break;
                    default:
                        try {
                            throw new java.io.IOException();
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }
                }
            System.out.println(p);
        }
    }
