package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class File_e_Scanner {

	public static void main(String[] args) {
		
		// Declarando o caminho do Arquivo.
		File file = new File("c:\\ws-eclipse\\in.txt");
		Scanner sc = null;

		try {
			//Instanciando o Scanner com o arcumento "file".
			sc = new Scanner(file);
			while(sc.hasNextLine()){
				/*"hasNextLine"
				 * P/ testar se ainda ha uma nova linha no arquivo.
				 * "sc.nextLine()" p/ ler a nova linha do arquivo*/
				System.out.println(sc.nextLine());	
			}
		}
		catch(IOException e) {
			//Se acontecer alguma exceção, ela sera tradada mostrando a menssagem de "Error"
			System.out.print("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
				/*Fechar o Scanner: sc.close() dentro do finall,
				 *recurso será fechado caso o try der certo ou ñ,
				 *criando um "if"pois:
				 *caso o bloco try de erro, o "sc" ficaria valendo "null" e ñ "file"
				 */
			}
		}
	}
}