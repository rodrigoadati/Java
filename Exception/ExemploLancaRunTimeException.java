public class ExemploLancaRunTimeException{		
	public static void main(String[] args){
		if(args.length > 0){
			System.out.println("Valor do parametro recebido = " + args[0]);		
		}
		else
		{
			throw new RuntimeException();
		}
	}
}
