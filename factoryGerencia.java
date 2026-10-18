public abstract  class factoryGerencia {

public abstract apolice gerarApolice();

public final apolice contratar(){
    apolice novaApolice = gerarApolice();
    novaApolice.calculoDoPremio();
    novaApolice.documentosExigidos();
    novaApolice.resumoDaContratacao();
    return novaApolice;
}

}
