package application;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileReader_BufferedReader {

	public static void main(String[] args) {
		
		String path = "c:\\ws-eclipse\\Leitor_de_arquivos_texto\\in.txt";//Caminho do arquivo
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);//Instanciar o "fr" com o caminho do arquivo "path"
			br = new BufferedReader(fr);//Instanciar o "br" recebendo o "fr" como arcumento//"OBS: deixa mais flexivel o sistema de leitura do arquivo"
			String line = br.readLine();// "line" ele ira ler uma linha do arquivo,// se essa linha estiver no final ele ira retornar "null"assim,
			while(line != null) {// criando um "while" e tester "line != null"
				System.out.println(line);
				line = br.readLine();// 
			} 
		}
		catch(IOException e) {
			System.out.println("Error: " + e.getMessage());//P/ informar que deu erro
		}
		finally {
			try{
				if(br != null) {//Para fechar as duas String
				br.close(); //P/ fechar a String "br"
			}
			if(fr != null) {
				fr.close(); //P/ fechar a String "fr"
			}
		}
			catch(IOException e){//Para tradar e analisar a exceção do fechamento das String
				e.printStackTrace();
			}
		}
	}
}