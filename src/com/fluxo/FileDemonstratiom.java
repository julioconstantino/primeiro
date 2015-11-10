package com.fluxo;

import java.io.File;
import java.util.Scanner;

public class FileDemonstratiom {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite diretorio ou arquivo: ");
		analyzePath(input.nextLine());
	} //fim do main
	public static void analyzePath(String path){
		//cria o objeto File com base na entrada de usu�rio
		File name = new File(path);
		if(name.exists()){//se o nome existir, gera sa�da das informa��es sobre ele
			//exibe informa��es sobre o arquivo ou diretorio
			System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
					name.getName(), "existe",
					(name.isFile()? "isto � um arquivo" : "isto n�o � um arquivo"),
					(name.isDirectory()? "isto � um diretorio" : "isto n�o � um diretorio"),
					(name.isAbsolute()? "caminho absoluto" : "n�o � caminho absoluto"), "�ltima altera��o: ",
					name.lastModified(), "Tamanho: ", name.length(),
					"Caminho: ", name.getPath(), "Caminho absoluto: ",
					name.getAbsolutePath(), "Parent: ", name.getParent());
				if(name.isDirectory()){//listagem de diretorio de sa�da
					String[] directory = name.list();
					System.out.println("\n\nConte�do do Diret�rio:\n");
					
					for(String directoryName : directory)
						System.out.println(directoryName);
				}//fim do if
				
		}//fim do if externo
		else{ //n�o for arquivo ou diretorio, gera saida da mensagem de erro
			System.out.printf("%s %s" , path, "n�o existe"); 
		}//fim do else
	}//fim do metodo analyzePath

}//fim da classe FileDemostratiom
