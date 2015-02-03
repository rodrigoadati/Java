public class FormatadorModeloB extends FormatadorRecibo{
	private String simboloMoeda;

	public String getSimboloMoeda(){ return simboloMoeda;}
	
	public void setSimboloMoeda(String simboloMoeda){
		this.simboloMoeda = simboloMoeda;	
	}

	public String gerarRecibo(String nomeCliente, double valor, String data, String motivo){
		return "Nos da " + super.getNomeEmpresa() + 
		       " recebemos de " + nomeCliente +
		       " em " + data +
		       " o valor de R$ " + valor +	
		       " referente a " + motivo;
	}
}

