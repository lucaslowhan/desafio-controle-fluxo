import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parametro.");
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parametro.");
        int parametroDois = terminal.nextInt();
        try{
            contar(parametroUm, parametroDois);
        }catch (ParametrosInvalidosException e){
            System.out.println("Erro: " + e.getMessage());
        }

    }
    public static void contar(int inicio, int fim) throws ParametrosInvalidosException {
        if (inicio>fim){
            throw new ParametrosInvalidosException("O segundo parametro deve ser maior que o primeiro");
        }
        for (int i = inicio; i<=fim ; i++){
            System.out.println("Imprimindo o número " + i);
        }

    }
}
