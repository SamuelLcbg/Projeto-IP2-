package projetoIp2;

public class RepositorioGerente {

	private int freeSpace = 0; 
	private Gerente[] manager; 
	private int number; 
	
	RepositorioGerente(){
		this.number = 10; 
		manager = new Gerente[number]; 
	}
	
	RepositorioGerente(int number){
		this.number = number; 
		manager = new Gerente[number]; 
	}
	
	public void adicionar(Gerente gerente) {
		
		boolean teste = true; 
		
		if(gerente != null) {
			for(int i = 0; i < freeSpace; i++) {
				if(gerente.equals(manager[i])) {
					teste = false; 
					break; 
				}
			}
		}else {
			System.out.println("Não é possível adicionar um gerente null"); 
		}
		
		if(teste != false) {
			manager[freeSpace] = gerente; 
			freeSpace++; 
		}else {
			System.out.println("O gerente em questão já está presente no repositório"); 
		}
		
	}
	
	public void retirar(Gerente gerente) {
		if(gerente!= null) {
			for(int i = 0; i < number; i++) {
				if(gerente.equals(manager[i])) {
					for(int j = i; j < freeSpace; j++) {
						manager[j] = manager[j+1]; 
					}
					freeSpace--; 
					break; 
				}
			}
		}
	}
	
	public void listar() {
		for(int i =0 ; i<freeSpace; i++) {
			System.out.println(manager[i]); 
		}
	}
	
	public void atualizar(Gerente gerente) {
		if(gerente != null) {
			for(int i = 0; i < freeSpace; i++) {
				if(gerente.equals(manager[i])) {
					manager[i] = gerente; 
					break; 
				}
			}
		}
	}
	
}
