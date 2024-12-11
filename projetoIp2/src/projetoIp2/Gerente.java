package projetoIp2;

public class Gerente extends Pessoa {
	private String idAdmin; 
	public static int numAdm = 0; 
	
	Gerente(){
		
	}
	
	public String getId() {
		return this.idAdmin; 
	}
	
	public void setId(String id) {
		this.idAdmin = id; 
	}
	
	public boolean equals(Object obj) {
		if(obj == null || this.getClass() != obj.getClass() ) {
			return false; 
		}
		
		if(obj == this) {
			return true; 
		}
		
		Gerente g1 = (Gerente) obj; 
		
		boolean testeNome = this.getNome().equals(g1.getNome());
		boolean testeCpf = this.getCpf().equals(g1.getCpf()); 
		boolean testeIdAdm = this.getId().equals(g1.getId()); 
		
		return testeNome && testeCpf && testeIdAdm; 
		
	}
	
	
	
}
