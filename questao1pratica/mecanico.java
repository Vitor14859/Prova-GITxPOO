package questao1pratica;

public class mecanico extends integrante{
    private String especialidade;
     public mecanico(String nome, int idade, String cargo, String especialidade) {
        super(nome, idade, cargo);
        this.especialidade = especialidade;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println("Informacoes do mecanico:");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Cargo: " + this.getCargo());
        System.out.println("Especialidade: " + this.especialidade);
    }
}
