package projetoIp2;

import java.time.LocalDate;

public class Reserva {
    private projetoIp2.Owner propietario;
    private LocalDate dataInicio;
    private LocalDate dataFim;

    Reserva() {
        this.propietario = propietario;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    public Owner getPropietario() {
        return propietario;
    }

    public void setPropietario(Owner propietario) {
        this.propietario = propietario;
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

        boolean propietarioTeste = this.getPropietario().equals(reservaTeste.getPropietario());
        boolean dataInicioTeste = this.getDataInicio().equals(reservaTeste.getDataInicio());
        boolean dataFimTeste = this.getDataFim().equals(reservaTeste.getDataFim());
        return propietarioTeste && dataInicioTeste && dataFimTeste;

    }

    public String toString() {
        return this.getPropietario() + "   " + this.getDataInicio() + "   " + this.getDataFim();
    }
}

