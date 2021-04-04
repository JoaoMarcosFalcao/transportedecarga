package br.com.unialfa.trapostadoradecargas.Rota.Domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;

@Entity
public class Rota {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String cidadeSaida;
    private String cidadeChegada;
    private double distancia;
    private String cidadeParadas;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCidadeSaida() {
        return cidadeSaida;
    }

    public void setCidadeSaida(String cidadeSaida) {
        this.cidadeSaida = cidadeSaida;
    }

    public String getCidadeChegada() {
        return cidadeChegada;
    }

    public void setCidadeChegada(String cidadeChegada) {
        this.cidadeChegada = cidadeChegada;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public String getCidadeParadas() {
        return cidadeParadas;
    }

    public void setCidadeParadas(String cidadeParadas) {
        this.cidadeParadas = cidadeParadas;
    }

}
