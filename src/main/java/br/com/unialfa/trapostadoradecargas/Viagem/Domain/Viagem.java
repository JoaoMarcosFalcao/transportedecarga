package br.com.unialfa.trapostadoradecargas.Viagem.Domain;

import br.com.unialfa.trapostadoradecargas.Carga.Domain.Carga;
import br.com.unialfa.trapostadoradecargas.Cliente.Domain.Cliente;
import br.com.unialfa.trapostadoradecargas.Motorista.Domain.Motorista;
import br.com.unialfa.trapostadoradecargas.Rota.Domain.Rota;
import br.com.unialfa.trapostadoradecargas.Veiculo.Domain.Veiculo;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Viagem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String horaPartida;
    private String horaChegada;
    private LocalDate dataSaida;
    private LocalDate dataChegada;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Carga> carga;

    @OneToOne
    private Veiculo veiculo;

    @OneToOne
    private Motorista motorista;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Rota> rota;

    private BigDecimal frete;

    public Viagem() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getHoraPartida() {
        return horaPartida;
    }

    public void setHoraPartida(String horaPartida) {
        this.horaPartida = horaPartida;
    }

    public String getHoraChegada() {
        return horaChegada;
    }

    public void setHoraChegada(String horaChegada) {
        this.horaChegada = horaChegada;
    }

    public LocalDate getDataSaida() {
        return dataSaida;
    }

    public void setDataSaida(LocalDate dataSaida) {
        this.dataSaida = dataSaida;
    }

    public LocalDate getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(LocalDate dataChegada) {
        this.dataChegada = dataChegada;
    }

    public List<Carga> getCarga() {
        return carga;
    }

    public void setCarga(List<Carga> carga) {
        this.carga = carga;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public List<Rota> getRota() {
        return rota;
    }

    public void setRota(List<Rota> rota) {
        this.rota = rota;
    }

    public BigDecimal getFrete() {
        return frete;
    }

    public void setFrete(BigDecimal frete) {
        this.frete = frete;
    }

}
