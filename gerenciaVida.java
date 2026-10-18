public class gerenciaVida extends factoryGerencia {
    @Override 
    public  apolice gerarApolice(){
        return new apoliceVida();
    }
}
