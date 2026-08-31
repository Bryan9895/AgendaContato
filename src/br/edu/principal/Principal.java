package br.edu.principal;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		ArrayList<String>nomes = new ArrayList<String>();
        ArrayList<String>celular = new ArrayList<String>();
        ArrayList<String>email = new ArrayList<String>();
        boolean continuar = true;
		
		System.out.println("==========================");
        System.out.println("     AGENDA DE CONTATOS    ");
        System.out.println("          v0.0.0           ");
        System.out.println("==========================");
        
        while (continuar) {
        	System.out.println();
            System.out.println("1 - Adicionar contato");
            System.out.println("2 - Listar contato");
            System.out.println("3 - Procurar contato");
            System.out.println("4 - Excluir contato");
            System.out.println("5 - Sair");
            System.out.println();

            System.out.print("Escolha uma opção: ");
            int opcao = sc.nextInt();
            sc.nextLine();
            
            switch (opcao) {
    	        case 1 -> {
    	        	System.out.println("\n--- ADICIONAR CONTATO ---");
    	        	
                    System.out.print("Nome: ");
                    nomes.add(sc.nextLine());
                    
                    
                    System.out.print("Celular: ");
                    celular.add(sc.nextLine());
                    
                    System.out.print("E-mail: ");
                    email.add(sc.nextLine());
                
                    System.out.println("Contato salvo com sucesso!");
                    }
     
    	        case 2 -> {
    	        	System.out.println("\n--- LISTAR CONTATO ---");
    	        	
                    if (nomes.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    }
                    else {
                    	for(int i = 0; i < nomes.size(); i++)
                        System.out.println("Nome: " + nomes.get(i));
                        System.out.println("Celular: " + celular.get(i));
                        System.out.println("E-mail: " + email.get(i));
                    }
                   	}
    	        /** case 3 -> { 
    	        	System.out.println("\n--- PROCURAR CONTATO ---");
    	            if (quantidade == 0) {
    	                System.out.println("Nenhum contato cadastrado.");
    	            } 
    	            else {
    	            	for (int i = 0; i < quantidade; i++) {
	    	                System.out.print("Digite o nome que deseja procurar: ");
	    	                String nomeBusca = sc.nextLine();
	
	    	                if (nome.equalsIgnoreCase(nomeBusca)) {
	    	                    System.out.println("Contato encontrado!");
	    	                    System.out.println("Nome: " + nome[i]);
	    	                    System.out.println("Celular: " + celular[i]);
	    	                    System.out.println("E-mail: " + email[i]);
	    	                }
	    	                else {
	    	                    System.out.println("Contato não encontrado.");
	    	                }
    	            	}
    	            }
    	        	}
    	        	case 4 -> {
    	        	System.out.println("\n--- EXCLUIR CONTATO ---");

                    if (nome.isEmpty()) {
                        System.out.println("Nenhum contato cadastrado.");
                    } 
                    else {
                        nome = "";
                        celular = "";
                        email = "";
                        System.out.println("Contato excluído com sucesso!");
                    }
    	        	}
    	        case 5 -> {
    	        	System.out.println("Saindo...");
                    continuar = false;
    	        	}
    	        default -> System.out.println("Opção inválida!");
    	    **/}
        }
	}
}