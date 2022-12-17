package solid_srp_v1;

public class ImprimirFatura {
	
	private Fatura fatura;
	
	public ImprimirFatura(Fatura fatura) {
		this.fatura = fatura;
	}
	
	public void imprimir() {
		System.out.println("***************************** RESUMO DE FATURA *****************************");
		System.out.println(fatura.getQuantidade() + ": " + fatura.getLivro().getNome() + " R$ " + fatura.getLivro().getPreco());
		System.out.println("Porcentagem de desconto: " + fatura.getPorcDesconto());
		System.out.println("Porcentagem de imposto: " + fatura.getPorcImposto());
		System.out.println("Total: " + fatura.getTotal());
	}

}
