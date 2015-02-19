import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

public class TesteLeituraTiposPrimitivos{
	public static void main(String[] args){		
		String nomeArq = "tiposPrimitivos.dat";
		
		FileInputStream leitorArquivos = null;
		DataInputStream leitorPrimitivos = null;

		try{
			leitorArquivos = new FileInputStream(nomeArq);
			leitorPrimitivos = new DataInputStream(leitorArquivos);
			byte b = leitorPrimitivos.readByte();
			short s = leitorPrimitivos.readShort();
			int i = leitorPrimitivos.readInt();
			long l = leitorPrimitivos.readLong();
			float f = leitorPrimitivos.readFloat();
			double d = leitorPrimitivos.readDouble();
			
			System.out.println(b);
			System.out.println(s);
			System.out.println(i);
			System.out.println(l);
			System.out.println(f);
			System.out.println(d);

		}catch(FileNotFoundException e){
			System.out.println("Arquivo não encontrado: " + nomeArq);
			e.printStackTrace();		
		}catch(IOException e){
			System.out.println("Problemas com leitura de primitivos:");
			e.printStackTrace();		
		}finally{
			try{
				if(leitorPrimitivos != null)
					leitorPrimitivos.close();			
			}catch(IOException e){
				System.out.println("Problemas ao fechar o stream: ");
				e.printStackTrace();			
			}		
		}	
	}
}
