package solid_lsp_v1;

import java.time.LocalDate;


class FolhaSalarial{
    
	private LocalDate data;
    
    public FolhaSalarial(LocalDate data) {
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public void imprimirFolhaSalarial(Funcionario funcionario){
        
		System.out.println("****************   FOLHA SALARIAL    ****************\n");
		
		           
        	System.out.println("\n" + funcionario.getNome() + " ----- R$ " + funcionario.calcularSalario());

    } 
}
