public class TesteReciboModeloA{
	public static void main(String[] args){
		FormatadorModeloA fA = new FormatadorModeloA();
		fA.setNomeEmpresa("Rain Micro sistem Brasil");
		String texto = fA.gerarRecibo("Willian Gates", 2000.0, "03/02/2015", "Aluguel de servidores");
		System.out.println(texto);
	}
}
