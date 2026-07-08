package questao1pratica;

class Main {
    public static void main(String[] args) {

        Temporada t = new Temporada(2026, "temporada sim", 2, true);
        t.exibiriformacoes();

        progamador p2 = new progamador("Luis", 13, "sim");
        progamador p1 = new progamador("Jair", 22, "não");

        mecanico m1 = new mecanico("josé", 34, "ok", "ser bom" );
    mecanico m2 = new mecanico("pedro", 45, "okay", "ser ruim");
        
        robo r1 = new robo("cristo", 30f, 20, true);


        System.out.println("Equipe:");
        System.out.println("progamadores: ");
        p1.exibirInformacoes();
        p2.exibirInformacoes();
        System.out.println("mecanicos: ");
        m1.exibirInformacoes();
        m2.exibirInformacoes();
        r1.exibirInformacoes();          


    }
}
