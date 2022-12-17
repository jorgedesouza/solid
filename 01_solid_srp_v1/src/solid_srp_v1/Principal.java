package solid_srp_v1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String nomeLivro, nomeAutor, isbn;
		int ano, quantidade;
		double preco, porcDesconto, porcImposto, total;
			
		System.out.println("Digite o nome do livro: ");
		nomeLivro = scan.next();
		
		System.out.println("Digite o nome do autor: ");
		nomeAutor = scan.next();
	
		System.out.println("Digite o isbn do livro: ");
		isbn = scan.next();
	
		System.out.println("Digite o ano do livro: ");
		ano = scan.nextInt();
		
		System.out.println("Digite a quantidade de livros: ");
		quantidade = scan.nextInt();
		
		System.out.println("Digite o preço do livro: ");
		preco = scan.nextDouble();
		
		System.out.println("Digite o valor do desconto: ");
		porcDesconto = scan.nextDouble();
		
		System.out.println("Digite o valor do imposto: ");
		porcImposto = scan.nextDouble();
				
		Livro livro = new Livro(nomeLivro, nomeAutor, ano, preco, isbn);
		
		Fatura fatura = new Fatura(livro, quantidade, porcDesconto, porcImposto);
		
		ImprimirFatura imprimirfatura = new ImprimirFatura(fatura);
		
				
		imprimirfatura.imprimir();
	
	}
	

}
