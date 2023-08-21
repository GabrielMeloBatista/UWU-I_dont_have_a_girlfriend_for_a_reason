public class Pai extends Pessoa {
    Integer qtdFilho;

    public Integer getQtdFilho() {
        return qtdFilho;
    }

    public void setQtdFilho(Integer qtdFilho) {
        if(qtdFilho > 0) this.qtdFilho = qtdFilho;
    }

    @Override
    String getTipoVoz() {
        return tipoVoz;
    }

    @Override
    void setTipoVoz(String tipoVoz) {
        this.tipoVoz = tipoVoz;
    }
}
