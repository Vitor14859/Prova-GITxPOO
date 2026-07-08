package questao1pratica;

public class integrante{
    private String nome;
    private int idade;
    private String cargo;
    
    public integrante(String nome, int idade, String cargo) {
        this.nome = nome;
        this.idade = idade;
        this.cargo = cargo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void exibirInformacoes(){
        System.out.println("Informaçoes do integrante: " );
        System.out.println("Nome:" + this.getNome());
        System.out.println("Idade:" + this.getNome());
        System.out.println("Cargo:" + this.getCargo());
        
    }
}