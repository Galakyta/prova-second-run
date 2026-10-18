public class gerenciaResidencial extends factoryGerencia {
    @Override 
    public  apolice gerarApolice(){
        return new apoliceResidencial();
    }
}
