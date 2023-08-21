public class Avo extends Pessoa {
    private Boolean conseguiuAposentadoria;

    public Boolean getConseguiuAposentadoria() {
        return conseguiuAposentadoria;
    }

    public void setConseguiuAposentadoria(Boolean conseguiuAposentadoria) {
        this.conseguiuAposentadoria = conseguiuAposentadoria;
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
