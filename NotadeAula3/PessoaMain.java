import java.util.Scanner;

public class PessoaMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("=========================================");
        System.out.println("         Cadastro Faculdade Maçã         ");
        System.out.println("=========================================");

        System.out.println("Opções \n[1] Aluno\n[2] Professor\n[3] Coordenador");

        int opcao = scanner.nextInt();
        System.out.println("=========================================");

        switch (opcao) {
            case 1:
                Aluno pessoa = new Aluno();

                System.out.println("Informe o nome: ");
                String nome = scanner2.nextLine();

                System.out.println("Informe a idade: ");
                int idade = scanner.nextInt();

                System.out.println("Informe a 1º nota: ");
                Double nota1 = scanner.nextDouble();

                System.out.println("Informe a 2º nota: ");
                Double nota2 = scanner.nextDouble();

                System.out.println("=========================================");

                pessoa.setNome(nome);
                pessoa.setIdade(idade);
                pessoa.setNota1(nota1);
                pessoa.setNota2(nota2);

                System.out.println("      Aluno Cadastrado com sucesso      ");
                System.out.println("Nome: " + pessoa.getNome());
                System.out.println("Idade: " + pessoa.getIdade());
                System.out.println("Nota 1: " + pessoa.getNota1());
                System.out.println("Nota 2: " + pessoa.getNota2());
                System.out.println("Média: " + pessoa.getMedia());
                System.out.println("=========================================");
                break;

            case 2:
                Professor pessoaProfessor = new Professor();

                System.out.println("Informe o nome: ");
                nome = scanner2.nextLine();

                System.out.println("Informe a idade: ");
                idade = scanner.nextInt();

                System.out.println("Informe o salário: ");
                Double salario = scanner.nextDouble();

                System.out.println("Informe a especialização: ");
                String especializacao = scanner2.nextLine();

                System.out.println("=========================================");

                pessoaProfessor.setNome(nome);
                pessoaProfessor.setIdade(idade);
                pessoaProfessor.setSalario(salario);
                pessoaProfessor.setEspecializacao(especializacao);

                System.out.println("    Professor Cadastrado com sucesso     ");
                System.out.println("Nome: " + pessoaProfessor.getNome());
                System.out.println("Idade: " + pessoaProfessor.getIdade());
                System.out.println("Salário: " + pessoaProfessor.getSalario());
                System.out.println("Especialização: " + pessoaProfessor.getEspecializacao());
                System.out.println("=========================================");
                break;

            case 3:
                Coordenador pessoaCoordenador = new Coordenador();

                System.out.println("Informe o nome: ");
                nome = scanner2.nextLine();

                System.out.println("Informe a idade: ");
                idade = scanner.nextInt();

                System.out.println("Informe o salário: ");
                salario = scanner.nextDouble();

                System.out.println("Informe o curso: ");
                String curso = scanner2.nextLine();
                System.out.println("=========================================");

                pessoaCoordenador.setNome(nome);
                pessoaCoordenador.setIdade(idade);
                pessoaCoordenador.setSalario(salario);
                pessoaCoordenador.setCurso(curso);

                System.out.println("    Coordenador cadastrado com sucesso   ");
                System.out.println("Nome: " + pessoaCoordenador.getNome());
                System.out.println("Idade: " + pessoaCoordenador.getIdade());
                System.out.println("Salário: " + pessoaCoordenador.getSalario());
                System.out.println("Curso: " + pessoaCoordenador.getCurso());
                System.out.println("=========================================");
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.println("=========================================");
                break;

        }

    }
}