import java.util.Scanner;

public class ExercicioTresListaTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int idade;
        double salario;
        String sexo;
        String estadoCivil;

        System.out.println("Digite o nome: ");
        nome = scanner.next();

        do {
            System.out.print("Digite a idade (entre 0 e 150): ");
            idade = scanner.nextInt();
        } while (idade < 0 || idade > 150);


        do {
            System.out.println("Digite o salário (maior ou igual a zero): ");
            salario = scanner.nextDouble();
        } while (salario < 0);


        do {
            System.out.println("Digite o sexo ('f' ou 'm'): ");
            sexo = scanner.next();
        } while (!sexo.equals("f") && !sexo.equals("m"));

        do {
            System.out.println("Digite o estado civil ('s', 'c', 'v' ou 'd'): ");
            estadoCivil = scanner.next();
        } while (!estadoCivil.equals("s") && !estadoCivil.equals("c") && !estadoCivil.equals("v") && !estadoCivil.equals("d"));

        scanner.close();

        System.out.println("\nInformações cadastradas:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + estadoCivil);
    }
}
