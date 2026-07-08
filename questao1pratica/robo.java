package questao1pratica;

public class robo {
    private String nome;
    private float peso;
    private int velocidade;
    private boolean funcional;

    public robo(String nome, float peso, int velocidade, boolean funcional) {
        this.nome = nome;
        this.peso = peso;
        this.velocidade = velocidade;
        this.funcional = funcional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public boolean isFuncional() {
        return funcional;
    }

    public void setFuncional(boolean funcional) {
        this.funcional = funcional;
    }
     public void desligar(){
        this.setFuncional(false);
     }
     public void ligar(){
        this.setFuncional(true);
     }
    
    public void exibirInformacoes(){
        System.out.println("informaçoes do robo:");
        System.out.println("nome: "+ this.getNome());
        System.out.println("peso: "+ this.getPeso());
        System.out.println("velocidade: "+ this.getVelocidade());
        System.out.println("funcionando: "+ isFuncional());
    }
    
}
