package projetoIp2;

public class RepositorioReserva {
    private int espacoLivre = 0;
    private Reserva[] reservas;
    private int numero;

    RepositorioReserva(){
        this.numero = 10;
        reservas = new Reserva[numero];
        }
    
    RepositorioReserva(int numero){
        this.numero = numero;
        reservas = new Reserva[numero];
    }
    
    public void adicionar(Reserva reserva){
       boolean teste = true; 
       
       if(reserva != null) {
    	   for(int i= 0 ; i <espacoLivre;i++) {
    		   if(reserva.equals(reservas[i])) {
    			   teste = false; 
    			   break; 
    		   }
    	   }
       }else {
    	   System.out.println("não pode ser adicionado uma reserva null."); 
       }
       
       if(teste != false) {
    	   reservas[espacoLivre] = reserva; 
    	   espacoLivre++; 
       }else {
    	   System.out.println("essa reserva já está presente no array"); 
       }
       
       
    }
    
    
    public void listar(){
        for(int i = 0; i < espacoLivre; i++){
            System.out.println(reservas[i]);
        }

    }
    
    
    public void retirar(Reserva reserva){
        if(reserva != null){
            for(int i = 0; i < espacoLivre;i++){
                if (reserva.equals(reservas[i])){
                    for(int j = i; j < espacoLivre; j++){
                        reservas[j] = reservas[j+1];
                    }
                    espacoLivre--;
                    break;
                }
            }
        }
    }
    
    
    public void atualizar(Reserva reserva){
        if(reserva != null){
            for(int i = 0; i < espacoLivre; i++){
                if (reserva.equals(reservas[i])){
                    reservas[i] = reserva;
                    break;
                }
            }
        }
    }

}
