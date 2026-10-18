import java.util.Scanner;
public class apoliceAuto extends apolice {
    Scanner scanner = new Scanner(System.in);
    //nn precisa re declarar a variavel do bem segurado. 

    @Override 
    public  String calculoDoPremio(){
            System.out.println("insira o valor da tabela FIPE do veiculo a ser segurado: ");
            valorDoBemSegurado = scanner.nextDouble();
        System.out.println( "Valor do premio mensal do seguro: " + (valorDoBemSegurado * 0.08) / 12);
        return "Premio impresso";
    }
    @Override 
    public  String documentosExigidos(){
        System.out.println( "Documentos exigidos para a contratação: CNH E CRLV");
        return "Documentos Informados.";
    }
    @Override 
    public  String resumoDaContratacao(){
        System.out.println("SERVICO CONTRATADO: SEGURO AUTOMOTIVO - VALIDADE MENSAL CALCULO BASE: 8% DO VALOR DO VEICULO.");
        return "resumo impresso.";
    }
}
