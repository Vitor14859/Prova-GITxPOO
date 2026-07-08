package questao2pratica;

public class equipe {
    private String nomedaEquipe;
    private int numerodeintegrantes;
    private int numerodeeventos;
    
    public equipe() {
        this.nomedaEquipe = "";
        this.numerodeintegrantes = 0;
        this.numerodeeventos = 0;
    }

    public equipe(String nomedaEquipe, int numerodeintegrantes, int numerodeeventos) {
        this.nomedaEquipe = nomedaEquipe;
        this.numerodeintegrantes = numerodeintegrantes;
        this.numerodeeventos = numerodeeventos;
    }

    public String getNomedaEquipe() {
        return nomedaEquipe;
    }

    public void setNomedaEquipe(String nomedaEquipe) {
        this.nomedaEquipe = nomedaEquipe;
    }

    public int getNumerodeintegrantes() {
        return numerodeintegrantes;
    }

    public void setNumerodeintegrantes(int numerodeintegrantes) {
        this.numerodeintegrantes = numerodeintegrantes;
    }

    public int getNumerodeeventos() {
        return numerodeeventos;
    }

    public void setNumerodeeventos(int numerodeeventos) {
        this.numerodeeventos = numerodeeventos;
    }

    public void addintegrante(){
        numerodeintegrantes ++;
    }

    public void addevento(){
        numerodeeventos++;
    }

    public void exibirintegrantes(){
        System.out.println(this.getNumerodeintegrantes());
    }

    public void exibireventos(){
        System.out.println(this.getNumerodeeventos());
    }
    public void notificarTodos(){
        
    }
}
