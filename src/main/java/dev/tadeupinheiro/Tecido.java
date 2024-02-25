package dev.tadeupinheiro;

public class Tecido {

    private String artigo;
    private String acabamento;
    private String cor;
    private double metragem;
    private int qualidade;
    private int notafiscal;
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
