package projetoIp2;

public class RepositorioOwner  {

	private int freeSpace = 0; 
	private Owner[] dono; 
	private int number; 
	
	RepositorioOwner(){
		this.number = 10; 
		this.dono = new Owner[number]; 
	}
	
	RepositorioOwner(int number){
		this.number = number; 
		this.dono = new Owner[number]; 
	}
	
	public void adicionar(Owner owner) throws ONEEx {
		
		boolean teste = true; 
		
		if(owner != null) {
			for(int i = 0; i < freeSpace; i++) {
				if(dono[i].equals(owner)) {
					teste = false; 
					break; 
				}
			}
		}else {
			ONEEx one = new ONEEx(); 
			throw one;
		}
		
		if(teste != false) {
			dono[freeSpace] = owner; 
			freeSpace++; 
		}else {
			System.out.println("O proprietário já está registrado no repositório."); 
		}
	}
	
	public void retirar(Owner owner) throws ONEEx  {
		if(owner != null) {
			for(int i = 0; i < number; i++) {
				
				if(owner.equals(dono[i])) {
					 
					for(int j = i; j < freeSpace ; j++) {
						dono[j] = dono[j+1]; 
					}
					
					freeSpace--; 
					break; 
				}
			}
			
		}else {
			ONEEx one = new ONEEx(); 
			throw one; 
		}
		
	}
	
	public void atualizar (Owner owner) {
		if(owner != null) {
			for(int i = 0; i < freeSpace; i++) {
				if(dono[i].getCpf().equals(owner.getCpf())) {
					dono[i] = owner; 
					break; 
				}
			}
		}
	}
	
	public void listar() {
		for(int i = 0; i < freeSpace; i++) {
			System.out.println(dono[i] + "\n"); 
		}
	}
	
	
	
	
	
}
