package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe Santos");
        felipe.setIdade(18);

        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
    }
}