package questao2pratica;

public class evento {
    private String nomeDoEvento;
    private String local;
    private String data;
    private double pontuacaoobtida;

    public evento(String nomeDoEvento, String local, String data, double pontuacaoobtida) {
        this.nomeDoEvento = nomeDoEvento;
        this.local = local;
        this.data = data;
        this.pontuacaoobtida = pontuacaoobtida;
    }

    public String getNomeDoEvento() {
        return nomeDoEvento;
    }
    
    public void setNomeDoEvento(String nomeDoEvento) {
        this.nomeDoEvento = nomeDoEvento;
    }
    
    public String getLocal() {
        return local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public double getPontuacaoobtida() {
        return pontuacaoobtida;
    }
    
    public void setPontuacaoobtida(double pontuacaoobtida) {
        this.pontuacaoobtida = pontuacaoobtida;
    }

    public void exibirInformacoes(){
        
    }
}
