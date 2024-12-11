package projetoIp2;

public abstract class  Pessoa {
	
	private String cpf; 
	private String nome; 
	
	Pessoa(String cpf, String nome){
		this.cpf = cpf; 
		this.nome = nome; 
	}
	
	
	public String getCpf() {
		return this.cpf; 
	}
	
	public String getNome() {
		return this.nome; 
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf; 
	}
	
	public void setNome(String nome) {
		this.nome = nome; 
	}
	
	public boolean equals(Object obj) {
		
		if(this == obj) {
			return true; 
		}
		
		if(obj == null || this.getClass() != obj.getClass()) {
			return false; 
		}
		
		Pessoa pessoaTeste = (Pessoa) obj; 
		
		boolean cpfTeste = this.getCpf().equals(pessoaTeste.getCpf()); 
		boolean nomeTeste = this.getNome().equals(pessoaTeste.getNome()); 
		
		return cpfTeste && nomeTeste; 
		
	}
	
	public String toString() {
		return this.getNome() + "   " + this.getCpf(); 
	}
	
	
	
	
	
}
