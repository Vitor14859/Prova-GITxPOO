package questao2pratica;

public class temporada extends equipe {
    private int ano;
    private String nomeDoDesafio;
    private int quantidadeDeEventos;
    private boolean roboPronto;
   

    public temporada() {
    }

    public temporada(int ano, String nomeDoDesafio, int quantidadeDeEventos, boolean roboPronto) {
        this.ano = ano;
        this.nomeDoDesafio = nomeDoDesafio;
        this.quantidadeDeEventos = quantidadeDeEventos;
        this.roboPronto = roboPronto;
    }

    public int getAno() {
        return ano;
    }
    
    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getNomeDoDesafio() {
        return nomeDoDesafio;
    }
    
    public void setNomeDoDesafio(String nomeDoDesafio) {
        this.nomeDoDesafio = nomeDoDesafio;
    }
    
    public int getQuantidadeDeEventos() {
        return quantidadeDeEventos;
    }
    
    public void setQuantidadeDeEventos(int quantidadeDeEventos) {
        this.quantidadeDeEventos = quantidadeDeEventos;
    }
    
    public boolean isRoboPronto() {
        return roboPronto;
    }
    
    public void setRoboPronto(boolean roboPronto) {
        this.roboPronto = roboPronto;
    }

    public void iniciartemporada(){
        System.out.println("Temporada iniciada ");
    }

    public void terminarRobo(){
        this.setRoboPronto(true);
    }

    public void exibiriformacoes(){
        System.out.println("informações:" );
        System.out.println("Nome do desafio " + this.getNomeDoDesafio());
        System.out.println("Ano: " + this.getAno());
        System.out.println("Quantidade de eventos: "  + this.getQuantidadeDeEventos());
        System.out.println("Robo pronto: " + this.isRoboPronto());
        
    }

    public void exibirResunoTemporada(){
        exibiriformacoes();
        exibireventos();
        exibirintegrantes();
        
    }

}
