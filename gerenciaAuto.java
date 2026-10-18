public class gerenciaAuto extends factoryGerencia {
    @Override 
    public  apolice gerarApolice(){
        return new apoliceAuto();
    }
}
