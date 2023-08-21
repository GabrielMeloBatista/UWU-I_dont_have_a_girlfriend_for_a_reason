public abstract class Pessoa {
    protected String tipoVoz;
    private String nome;

    abstract String getTipoVoz();

    String getNome() {
        return nome;
    }

    abstract void setTipoVoz(String tipoVoz);

    public void setNome(String nome) {
        this.nome = nome;
    }
}
