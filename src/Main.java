import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de carros :");
        int carros = sc.nextInt();

        double[] notas = new double[carros];

        double somaNotas = 0;

        int carrosBons = 0;

        int carrosRuins = 0;

        for (int i = 0; i < carros; i++) {
            System.out.println("Informe a nota do carro " + (i + 1) + ":");
            double nota = sc.nextDouble();


            if (nota < 0 || nota > 10) {
                System.out.println("Nota inválida insira uma nota entre 0 e 10:");
                i--;
            }
            notas[i] = nota;
            somaNotas += nota;


            if (nota >= 6) {
                carrosBons++;
            } else {
                carrosRuins++;
            }
        }
        double media = somaNotas / carros;
        System.out.println("A Média das notas foram :" + media);
        System.out.println("Tiveram:" + carrosBons +" carros bons");
        System.out.println("Tiveram :" + carrosRuins +" carros ruins");
        sc.close();
    }
    }