package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Try_with_resources {

	public static void main(String[] args) {
		
		String path = "c:\\ws-eclipse\\Leitor_de_arquivos_texto\\in.txt";//Caminho do arquivo.
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();// "line" ele ira ler uma linha do arquivo, se essa linha estiver no final ele ira retornar "null".
			while(line != null) {// criando um "while"p/ tester "line != null".
				System.out.println(line);
				line = br.readLine();// imprimir a nossa linha.
			} 
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());// Para informar que deu erro.
		}
	}
}