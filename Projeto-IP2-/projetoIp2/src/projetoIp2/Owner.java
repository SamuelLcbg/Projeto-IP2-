package projetoIp2;

public class Owner extends Pessoa{
	private String idProp; 
	private static int numDono = 0;  
	
	Owner(String cpf, String nome, String id){
		super(cpf,nome); 
		this.idProp = id; 
		numDono++; 
	}
	
	
	public String getId() {
		return this.idProp; 
	}       
	
	public static int getQuantProp() {
		return numDono; 
	}
	
	public void setId(String id) {
		this.idProp = id; 
	}
	
	public boolean equals(Object obj){
		
		if(obj == this) {
			return true; 
		}
		
		if(obj == null || obj.getClass() != this.getClass()) {
			return false; 
		}
		
		Owner owner = (Owner) obj; 
		
		boolean testeId =  this.getId().equals(owner.getId()); 
		boolean testeCpf = this.getCpf().equals(owner.getCpf()); 
		boolean testeNome = this.getNome().equals(owner.getNome()); 
		
		return testeId && testeCpf && testeNome; 
		
	}
	
	public String toString() {
		return this.getNome() + "   " + this.getCpf() + "   "  + this.getId(); 
	}
	
	
	
	
	
}
