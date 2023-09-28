import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int escolha = 0;
        do {
            System.out.println("Menu de opções");
            System.out.println("\t1- Adicionar um evento no inicio da estrutura");
            System.out.println("\t2- Adicionar um evento no final da estrutura");
            System.out.println("\t3- Remover um evento da estrurura");
            System.out.println("\t4- Listar todos os eventos");
            System.out.println("\t5- Limpsr lista");
            System.out.println("\t6- sair");
            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();


            switch (escolha) {
                case 1 -> {
                    System.out.println();
                    break;

                }
                case 2 -> {
                    System.out.println();
                    break;

                }
                case 3 -> {
                    System.out.println();
                    break;

                }
                case 4 -> {
                    System.out.println();
                    break;

                }
                case 5 -> {
                    System.out.println();
                    break;

                }
                case 6 -> {

                    System.out.println();
                    break;
                }
                default:
                    System.out.println("Opção invalida");
            }
        } while (escolha != 6);
    }
}
