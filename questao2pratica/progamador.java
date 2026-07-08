package questao2pratica;

 public class progamador  extends integrante {

    public progamador(String nome, int idade, String cargo) {
        super(nome, idade, cargo);
    
    }

    @Override
    public void exibirInformacoes(){
        System.out.println("Informaçoes do progamador: " );
        System.out.println("Nome:" + this.getNome());
        System.out.println("Idade:" + this.getNome());
        System.out.println("Cargo:" + this.getCargo());
    }

    @Override
    public void notificar() {
    
    }
    
}
