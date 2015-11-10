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
		//cria o objeto File com base na entrada de usuário
		File name = new File(path);
		if(name.exists()){//se o nome existir, gera saída das informações sobre ele
			//exibe informações sobre o arquivo ou diretorio
			System.out.printf("%s%s\n%s\n%s\n%s\n%s%s\n%s%s\n%s%s\n%s%s\n%s%s",
					name.getName(), "existe",
					(name.isFile()? "isto é um arquivo" : "isto não é um arquivo"),
					(name.isDirectory()? "isto é um diretorio" : "isto não é um diretorio"),
					(name.isAbsolute()? "caminho absoluto" : "não é caminho absoluto"), "Última alteração: ",
					name.lastModified(), "Tamanho: ", name.length(),
					"Caminho: ", name.getPath(), "Caminho absoluto: ",
					name.getAbsolutePath(), "Parent: ", name.getParent());
				if(name.isDirectory()){//listagem de diretorio de saída
					String[] directory = name.list();
					System.out.println("\n\nConteúdo do Diretório:\n");
					
					for(String directoryName : directory)
						System.out.println(directoryName);
				}//fim do if
				
		}//fim do if externo
		else{ //não for arquivo ou diretorio, gera saida da mensagem de erro
			System.out.printf("%s %s" , path, "não existe"); 
		}//fim do else
	}//fim do metodo analyzePath

}//fim da classe FileDemostratiom
