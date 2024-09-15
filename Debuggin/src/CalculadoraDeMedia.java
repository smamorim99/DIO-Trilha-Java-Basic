import java.util.Scanner;
public class CalculadoraDeMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculadoraMediaSala (alunos, scanner);

        System.out.printf("Média da turma é igual %f", media);
    }
    public static double calculadoraMediaSala (String [] alunos, Scanner scanner){
    double soma = 0;
    for (String aluno : alunos){
        System.out.printf("Nota do aluno %s", aluno);
        double nota = scanner.nextDouble();
        soma += nota;
    }
    return soma / alunos.length;
}
}
