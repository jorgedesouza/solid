package solid_lsp_v1;

import java.time.LocalDate;
import java.util.Scanner;

public class TestaRH {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
				
				String funcionario, cargo;
				float salario, bonusAplicavel, comissionavel;
							
				System.out.println("Digite o nome do Funcionário: ");
				funcionario = scan.next();
				
				System.out.println("Digite o Cargo do funcionário: ");
				cargo = scan.next();
				
				System.out.println("Digite o valor do salario: ");
				salario = scan.nextFloat();
				
				 if (cargo.equalsIgnoreCase("Gerente")){
					 
					 System.out.println("Digite o valor do bônus: ");
					 bonusAplicavel = scan.nextFloat();
					 
					 Gerente gerente = new Gerente(salario, cargo, funcionario, bonusAplicavel);
					 gerente.calcularBonus();
					 
					 LocalDate localDate = LocalDate.now();
					 FolhaSalarial folhaSalarial = new FolhaSalarial(localDate);
					 folhaSalarial.imprimirFolhaSalarial(gerente);
	                
	            } else {
					 
					 System.out.println("Digite o valor da comissão: ");
					 comissionavel = scan.nextFloat();
					 
					 Vendedor vendedor = new Vendedor(salario, cargo, funcionario, comissionavel);
					 vendedor.calcularComissao();
					 
					 LocalDate localDate = LocalDate.now();
					 FolhaSalarial folhaSalarial = new FolhaSalarial(localDate);
					 folhaSalarial.imprimirFolhaSalarial(vendedor);
	            	       
	                }   
								
				scan.close();
			
				}
			

	}


