public class App {
    public static void main(String[] args) throws Exception {

        double saldo = 16.90;
        double valorSolicitado = 17.90;

        if (valorSolicitado < saldo) {
            
            saldo -= valorSolicitado;
            System.out.println(saldo);

            return;
        }

        System.out.println("Saldo indisponivel");
    }
}
