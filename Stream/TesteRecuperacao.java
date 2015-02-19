import java.io.FileInputStream;
import java.io.IOException;

public class TesteRecuperacao{
	public static void main(String[] args){
		FileInputStream leitor = null;
		try{
			leitor = new FileInputStream("dados.dat");
			int contador = 0;
			int ultimaLeitura = leitor.read();

			while(ultimaLeitura != -1){
				byte b = (byte)ultimaLeitura;
				contador ++;
				System.out.println("byte " + contador + ": " + b);
				ultimaLeitura = leitor.read();			
			}
			leitor.close();
		}catch(IOException e){
			e.printStackTrace();		
		}
	}
}
