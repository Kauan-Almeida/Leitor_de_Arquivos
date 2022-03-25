package application;

import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter_BufferedWriter {

	public static void main(String[] args) {
		
		String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"}; // Vetor para conter as informações do arquivos.
		String path = "c:\\ws-eclipse\\Leitor_de_arquivos_texto\\out.txt"; // Caminho do arquivo, onde ele ira ficar... 
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))){ // Declarar o "BW" recebendo o "FW" com o argumento "path(caminho de onde fica o arquivo)". 
			for(String line : lines) { // Criar um "for" para cada "line" do vetor "lines"(para cada linha do programa, uma linha no arquivo.
				bw.write(line); // Escrever a linha no arquivo. 
				bw.newLine(); // Quebra de linha.
			}
		}
		catch(IOException e) { // Caso ocorra um erro ele informar uma mensagem.
			e.printStackTrace();
		}
	}
}