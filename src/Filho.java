public class Filho extends Pessoa {
    Integer altura;

    public Integer getAltura() {
        return altura;
    }

    public void setAltura(Integer altura) {
        this.altura = altura;
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
