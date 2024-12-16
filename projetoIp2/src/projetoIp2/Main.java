package projetoIp2;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		//estabelecimento dos repositórios 
		
		RepositorioOwner ro = new RepositorioOwner(); 
		RepositorioReserva rr = new RepositorioReserva(); 
		RepositorioGerente rg = new RepositorioGerente(); 
		
		//teste classe owner 
		//a partir de testes de métodos da classe mãe
		//é corolário que esses testes também deem resultados positivos nas outras subclasses
		//portanto, testes de classe mãe não serão repetidos
		
		
		//System.out.println("----Início Teste Owner----");
		Owner o1 = new Owner("710850","jose","8855"); 
		Owner o2 = new Owner("995861","joao","6655"); 
		Owner o3 = new Owner("555778","felipe","3355"); 
		System.out.println("Número Total de proprietários:" + Owner.getQuantProp());
		
		System.out.println(o1.getNome()); 
		System.out.println(o2.getCpf()); 
		System.out.println(o3.getId() + "\n"); 
		
		o1.setCpf("3562");
		o2.setNome("romario"); 
		o3.setId("5533");
		
		System.out.println(o1.getNome()); 
		System.out.println(o2.getCpf()); 
		System.out.println(o3.getId() + "\n"); 
		System.out.println(o3); 
		System.out.println("----Fim teste Owner----");
		System.out.println("\n");
		
		//teste Gerente
	
		Gerente g1 = new Gerente("996655","andre","6655"); 
		Gerente g2 = new Gerente("885544","jonas","5544"); 
		Gerente g3 = new Gerente("774433","pedro","4433"); 
		Gerente g4 = new Gerente("663322","santiago","3322"); 
		
		g1.setId(null);
		System.out.println(g1); 
		System.out.println("----Fim Teste Gerente----"); 
		System.out.println("\n");
		
		//teste Reserva
		
		LocalDate li1 =  LocalDate.of(2024,2,3);
		LocalDate lo1 =  LocalDate.of(2024,2,10);
		LocalDate li2 =  LocalDate.of(2024,3,3);
		LocalDate lo2 =  LocalDate.of(2024,3,10);
		LocalDate li3 =  LocalDate.of(2024,4,3);
		LocalDate lo3 =  LocalDate.of(2024,4,10);
		
		//datas teste 
		
		LocalDate lt1 = LocalDate.of(2025, 2, 3);
		LocalDate lt2 = LocalDate.of(2025, 2, 10);
		
		
		Reserva r1 = new Reserva(o1,li1,lo1,"001");
		Reserva r2 = new Reserva(o2,li2,lo2,"002");
		Reserva r3 = new Reserva(o3,li3,lo3,"003");
		
		System.out.println(r1); 
		r1.setDataInicio(lt1);
		r1.setDataFim(lt2);
		r1.setIdReserva(null);
		System.out.println("----Novas datas r1----");
		System.out.println(r1.getDataInicio() + "   " +  r1.getDataFim() + "   " + r1.getIdReserva());
		
		r1.setOwner(o3);
		System.out.println(r1);
		
		
		
		//teste repositórios 
		
		//teste repositório Owner 
		
		
		System.out.println("----Início Teste RepositorioOwner----");
		ro.adicionar(o1);
		ro.adicionar(o2);
		ro.adicionar(o3);
		ro.listar(); 
		System.out.println("----Fim Primeira Listagem Owner----");
		ro.retirar(o2);
		ro.listar();
		System.out.println("----Fim  Segunda Listagem Owner----");
		o3.setNome(null);
		ro.atualizar(o3);
		ro.listar(); 
		System.out.println("----Fim  Terceira Listagem Owner----");
		System.out.println("----Fim Teste RepositorioOwner----");
		
		 //teste repositório Gerente 
		
		rg.adicionar(g1);
		rg.adicionar(g2);
		rg.adicionar(g3);
		rg.adicionar(g4);
		rg.listar(); 
		System.out.println("----Fim Primeira Listagem Gerente----");
		System.out.println("\n");
		rg.retirar(g2);
		rg.listar(); 
		System.out.println("----Fim  Segunda Listagem Gerente----");
		System.out.println("\n");
		g1.setNome(null);
		rg.atualizar(g1);
		rg.listar(); System.out.println("----Fim  Terceira Listagem Gerente----");
		System.out.println("----Fim Teste RepositorioGerente----");
		System.out.println("\n");
		
		//teste repositório reserva 
		
		rr.adicionar(r1);
		rr.adicionar(r2);
		rr.adicionar(r3);
		rr.listar(); 
		System.out.println("----Fim Primeira Listagem Reserva----");
		System.out.println("\n");
		rr.retirar(r2);
		rr.listar(); 
		System.out.println("----Fim  Segunda Listagem Reservar----");
		System.out.println("\n");
		r1.setOwner(o2);;
		rr.atualizar(r1);
		rr.listar();
		System.out.println("----Fim  Terceira Listagem Reserva----");
		System.out.println("----Fim Teste RepositorioReserva----");
		System.out.println("\n");
		
		
		
		
		
		
	}

}
