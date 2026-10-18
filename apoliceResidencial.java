import java.util.Scanner;
public class apoliceResidencial extends apolice {
    Scanner scanner = new Scanner(System.in);
    //nn precisa re declarar a variavel do bem segurado. 
    
    @Override 
    public  String calculoDoPremio(){
            System.out.println("insira o valor do imovel: ");
            valorDoBemSegurado = scanner.nextDouble();
        System.out.println( "Valor do premio mensal do seguro: " + (valorDoBemSegurado * 0.015) / 12);
        return "Premio impresso";
    }
    @Override 
    public  String documentosExigidos(){
        System.out.println( "Documentos exigidos para a contratação: escritura ou contrato de locação");
        return "Documentos Informados.";
    }
    @Override 
    public  String resumoDaContratacao(){
        System.out.println("SERVICO CONTRATADO: SEGURO DE IMOVEIS - VALIDADE MENSAL CALCULO BASE: 1.5% DO VALOR DO IMOVEL");
        return "resumo impresso.";
    }
}