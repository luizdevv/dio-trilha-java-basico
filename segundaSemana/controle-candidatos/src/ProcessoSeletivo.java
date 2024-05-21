import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;;

public class ProcessoSeletivo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String [] candidatos = {"FELIPE", "JOÃO", "LUIZ", "GUSTAVO", "RICARDO"};

        System.out.println("Qual sua expectativa salarial?");
        double salario = scanner.nextDouble();

        // analisarCandidato(salario);
        // selecaoCandidato();

        System.out.println("--------------------------------");
        System.out.println("Imprimindo candidatos aprovados... \n");
        // imprimirCandidatos(candidatos);
        System.out.println("--------------------------------");

        System.out.println("--------------------------------");
        System.out.println("Entrando em contato com candidatos... \n");
        for (String candidato : candidatos) {

            entrandoEmContato(candidato);
        }
        System.out.println("--------------------------------");

        scanner.close();
    }

    static void entrandoEmContato (String candidato) {

        int tentativas = 1;
        boolean continuar = true;
        boolean atendeu = false;

        do {

            atendeu = atender();
            continuar = !atendeu;

            if (continuar)
                tentativas++;
            else
                System.out.println("CONTATO REALIZADO COM SUCESSO");
        } while (continuar && tentativas < 3);

        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM " + candidato + " NA " + tentativas + " TENTATIVA.");
        else
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NÚMERO MÁXIMO DE TENTATIVAS " + tentativas + " REALIZADA.");
    }

    static boolean atender () {
        return new Random().nextInt(3)==1;
    }

    static void imprimirCandidatos (String[] candidatos) {

        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato do indice " + i + " é: " + candidatos[i]);
        }
    }

    static void selecaoCandidato () {

        String [] candidatos = {"FELIPE", "JOÃO", "LUIZ", "GUSTAVO", "RICARDO", "ALICE", "VITOR", "GUILHERME", "JOSÉ", "FERNANDO"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;

        while (candidatosSelecionados <= 5 && candidatoAtual < candidatos.length) {

            String candidato = candidatos[candidatoAtual];
            double salario = valorPretendido();

            System.out.println("O candidato " + candidato + ". Solicitou este salário R$: " + salario);

            if (salario <= salarioBase) {

                System.out.println( candidato + " foi selecionado.");

                candidatosSelecionados++;
            }

            candidatoAtual++;
        }
    }

    static double valorPretendido () {

        return ThreadLocalRandom.current().nextDouble(1800, 2500);
    }

    static void analisarCandidato (double salarioPretendido) {

        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {

            System.out.println("LIGAR PARA O CANDIDATO.");
        } else if (salarioBase == salarioPretendido) {

            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA.");
        } else {

            System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS...");
        }
    }
}
