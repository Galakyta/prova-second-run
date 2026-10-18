

public class cliente {
    public static void main(String[] args) {
        factoryGerencia gerente1 = new gerenciaAuto();
        factoryGerencia gerente2 = new gerenciaResidencial();
        factoryGerencia gerente3 = new gerenciaVida();

         gerente1.contratar();
         gerente2.contratar();
         gerente3.contratar();


    }
}
