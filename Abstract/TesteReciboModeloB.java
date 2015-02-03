public class TesteReciboModeloB{
	public static void main(String[] args){
		FormatadorModeloB fB = new FormatadorModeloB();
		fB.setNomeEmpresa("Coffe & Milk");
		fB.setSimboloMoeda("Euros");
		String texto = fB.gerarRecibo("Serafim", 4, "16/09/2014", "Cafe com bolinhos");
		System.out.println(texto);
	}
}
