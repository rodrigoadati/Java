import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TesteEscritaTiposPrimitivos{
	public static void main(String[] args){
		byte b = 1;
		short s = 12;
		int i = 656;
		long l = 5566L;
		float f = 451.0F;
		double d = 1241.0;
		
		String nomeArq = "tiposPrimitivos.dat";
		
		FileOutputStream escritorArquivos = null;
		DataOutputStream escritorPrimitivos = null;

		try{
			System.out.println("Enviando dados para arquivo " + nomeArq);
			escritorArquivos = new FileOutputStream(nomeArq);		
			escritorPrimitivos = new DataOutputStream(escritorArquivos);
			escritorPrimitivos.writeByte(b);
			escritorPrimitivos.writeShort(s);			
			escritorPrimitivos.writeInt(i);			
			escritorPrimitivos.writeLong(l);						
			escritorPrimitivos.writeFloat(f);			
			escritorPrimitivos.writeDouble(d);			
		}catch(FileNotFoundException e){
			System.out.println("Arquivo não encontrado: " + nomeArq);
			e.printStackTrace();		
		}catch(IOException e){
			System.out.println("Problemas com escrita de primitivos:");
			e.printStackTrace();		
		}finally{
			try{
				if(escritorPrimitivos != null)
					escritorPrimitivos.close();			
			}catch(IOException e){
				System.out.println("Problemas ao fechar o stream: ");
				e.printStackTrace();			
			}		
		}	
	}
}
