import java.util.Scanner;
public class Atividade2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Taffe =80;
        int Rodrigo =70;
        int Lucas = 60;
        int Alessandro =50;
        int nota=0;
        int[]votos = new int[nota];
        int somaVotos=0;

        System.out.println("Quantas pessoas irão votar :");
        int n = sc.nextInt();
        System.out.println("80-Taffe");
        System.out.println("70-Rodrigo");
        System.out.println("60-Lucas");
        System.out.println("50-Alessandro");
        System.out.println("Digite um número: ");

        for (int i = 0; i < nota; i++) {
            votos[i] = sc.nextInt();

        }


        int N = sc.nextInt();
        if (nota == 80 || nota == 70 || nota == 60 || nota == 50){

        }else {
            System.out.println("Número iválido tente novamente");
            somaVotos = somaVotos + n;
        }
        if (nota ==80){
            Taffe++;
        }
        if (nota ==70){
            Rodrigo++;
        }
        if (nota ==60){
            Lucas++;
        }
        if (nota ==50){
            Alessandro++;
        }

    }
}
