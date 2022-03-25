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
			// Instanciando o Scanner com o argumento "file".
			sc = new Scanner(file);
			while(sc.hasNextLine()){
				/*"hasNextLine"
				 * Para testar se ainda ha uma nova linha no arquivo.
				 * "sc.nextLine()" p/ ler a nova linha do arquivo*/
				System.out.println(sc.nextLine());	
			}
		}
		catch(IOException e) {
			// Se acontecer alguma exce��o, ela ser� tratada, mostrando a menssagem de "Error".
			System.out.print("Error: " + e.getMessage());
		}
		finally {
			if(sc != null) {
				sc.close();
				/*Fechar o Scanner: sc.close() dentro do finally,
				 *o recurso ser� fechado caso o try der certo ou �,
				 *criar um "if" pois:
				 *caso o bloco try der erro, o "sc" ficaria valendo "null" e � "file".
				 */
			}
		}
	}
}