package solid_lsp_v1;

import java.util.Scanner;

public class TestaRH {

	public static void main(String[] args) {
		
Scanner scan = new Scanner(System.in);
		
		String funcionario, cargo;
		float salario, bonus, comissao;
					
		System.out.println("Digite o nome do Funcionário: ");
		funcionario = scan.next();
		
		System.out.println("Digite o Salário do funcionário: ");
		salario = scan.nextFloat();
	
		System.out.println("Digite o Cargo do funcionário: ");
		cargo = scan.next();
		
		System.out.println("Digite o valor do bônus: ");
		bonus = scan.nextFloat();
		
		System.out.println("Digite o valor do comissão: ");
		comissao = scan.nextFloat();
		
		Gerente gerente = new Gerente(salario, cargo, funcionario, bonus);
				
		System.out.println("O Salario do gerente é: " + gerente.calcularSalario());
		
		Vendedor vendedor = new Vendedor(salario, cargo, funcionario, comissao);
		
		System.out.println("O Salario do vendedor é: " + vendedor.calcularSalario());
		
		System.out.println("O Salario do gerente é: " + gerente.calcularSalario());
		
		scan.close();
	
		}

	}


