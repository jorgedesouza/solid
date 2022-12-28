package solid_dip_v1;

import java.util.ArrayList;

public class TestaDev {

	public static void main(String[] args) {
		
	 IDev frontEnd = new FrontendDev();
	 IDev backEnd = new BackendDev();

	 ArrayList<IDev> projeto = new ArrayList();
	 projeto.add(backEnd);
	 projeto.add(frontEnd);
	 
	 ProjetoSoftware projetosoftware = new ProjetoSoftware(projeto);
	 projetosoftware.criarProjeto();
	 
	 
	 
	}

}
