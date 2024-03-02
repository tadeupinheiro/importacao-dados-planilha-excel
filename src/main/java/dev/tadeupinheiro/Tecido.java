package dev.tadeupinheiro;

import java.math.BigDecimal;

public class Tecido {

    private int codigoRolo;
    private String artigo;
    private String acabamento;
    private String cor;
    private double metragem;
    private double largura;
    private int qualidade;
    private BigDecimal precoCusto;

    private int numeroPedido;
    private int notafiscal;
    private String dataNota;
    private String empresa;

    public String getArtigo() {
        return artigo;
    }

    public void setArtigo(String artigo) {
        this.artigo = artigo;
    }

    public String getAcabamento() {
        return acabamento;
    }

    public void setAcabamento(String acabamento) {
        this.acabamento = acabamento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getMetragem() {
        return metragem;
    }

    public void setMetragem(double metragem) {
        this.metragem = metragem;
    }

    public int getQualidade() {
        return qualidade;
    }

    public void setQualidade(int qualidade) {
        this.qualidade = qualidade;
    }

    public int getNotafiscal() {
        return notafiscal;
    }

    public void setNotafiscal(int notafiscal) {
        this.notafiscal = notafiscal;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCodigoRolo() {
        return codigoRolo;
    }

    public void setCodigoRolo(int codigoRolo) {
        this.codigoRolo = codigoRolo;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public BigDecimal getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(BigDecimal precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public String getDataNota() {
        return dataNota;
    }

    public void setDataNota(String dataNota) {
        this.dataNota = dataNota;
    }

    @Override
    public String toString() {
        return "Tecido{" +
                "artigo='" + artigo + '\'' +
                ", acabamento='" + acabamento + '\'' +
                ", cor='" + cor + '\'' +
                ", metragem=" + metragem +
                ", qualidade=" + qualidade +
                ", notafiscal=" + notafiscal +
                ", empresa='" + empresa + '\'' +
                '}';
    }
}
