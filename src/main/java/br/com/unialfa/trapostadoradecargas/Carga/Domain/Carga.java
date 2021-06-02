package br.com.unialfa.trapostadoradecargas.Carga.Domain;

import br.com.unialfa.trapostadoradecargas.Cliente.Domain.Cliente;
import br.com.unialfa.trapostadoradecargas.Viagem.Domain.Viagem;

import javax.persistence.*;

@Entity
public class Carga {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private double peso;
    private double altura;
    private double comprimento;
    private double largura;
    private double pesoCubado;
    private TipoCarga tipoCarga;

    @ManyToOne
    private Cliente cliente;

    @ManyToOne
    private Viagem viagem;

    public Carga() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public double getPesoCubado() {
        return pesoCubado;
    }

    public void setPesoCubado(double pesoCubado) {
        this.pesoCubado = pesoCubado;
    }

    public TipoCarga getTipoCarga() {
        return tipoCarga;
    }

    public Viagem getViagem() {
        return viagem;
    }

    public void setViagem(Viagem viagem) {
        this.viagem = viagem;
    }

    public void setTipoCarga(TipoCarga tipoCarga) {
        this.tipoCarga = tipoCarga;
    }

}
