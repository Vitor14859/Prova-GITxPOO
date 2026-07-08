package questao2pratica;

public class main {
    public main(String[] args) {
        equipe p = new equipe();
        
        progamador p2 = new progamador("Luis", 13, "sim");
        progamador p1 = new progamador("Jair", 22, "não");

        mecanico m1 = new mecanico("josé", 34, "ok", "ser bom" );
        mecanico m2 = new mecanico("pedro", 45, "okay", "ser ruim");
        
        evento t1 = new evento("sim", "casa do crlh", "67/67/6767", 67);
        evento t2 = new evento("não", null, "algum dia", 0);

        temporada tp = new temporada();

        tp.exibirResunoTemporada();  

    }
}
