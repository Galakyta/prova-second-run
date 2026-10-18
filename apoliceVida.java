import java.util.Scanner;
public class apoliceVida extends apolice {
    Scanner scanner = new Scanner(System.in);
    //nn precisa re declarar a variavel do bem segurado. 
    
    @Override 
    public  String calculoDoPremio(){
            System.out.println("insira o valor do capital do segurado: ");
            valorDoBemSegurado = scanner.nextDouble();
        System.out.println( "Valor do premio mensal do seguro: " + (valorDoBemSegurado * 0.03) / 12);
        return "Premio impresso";
    }
    @Override 
    public  String documentosExigidos(){
        System.out.println( "Documentos exigidos para a contratação: Documento de identidade e CPF");
        return "Documentos Informados.";
    }
    @Override 
    public  String resumoDaContratacao(){
        System.out.println( "SERVICO CONTRATADO: SEGURO DE VIDA - VALIDADE MENSAL CALCULO BASE: 3% DO CAPITAL DO TITULAR.");
        return "resumo impresso.";
    }
}