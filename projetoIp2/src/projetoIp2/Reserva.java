package projetoIp2;

import java.time.LocalDate;

public class Reserva {
    private Owner proprietario;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String idReserva; 

    Reserva(Owner owner, LocalDate dataIn, LocalDate dataOut, String id) {
        this.proprietario = owner;
        this.dataInicio = dataIn;
        this.dataFim = dataOut;
        this.idReserva = id; 
    }

    public Owner getOwner() {
        return proprietario;
    }
    
    public String getIdReserva() {
    	return idReserva; 
    }
    
    public void setIdReserva(String id) {
    	this.idReserva = id; 
    }

    public void setOwner(Owner propietario) {
        this.proprietario = propietario;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;

    }

    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        Reserva reservaTeste = (Reserva) obj;

        boolean propietarioTeste = this.getOwner().equals(reservaTeste.getOwner());
        boolean dataInicioTeste = this.getDataInicio().equals(reservaTeste.getDataInicio());
        boolean dataFimTeste = this.getDataFim().equals(reservaTeste.getDataFim());
        return propietarioTeste && dataInicioTeste && dataFimTeste;

    }

    public String toString() {
        return this.getOwner() + "   " + this.getDataInicio() + "   " + this.getDataFim();
    }
}

