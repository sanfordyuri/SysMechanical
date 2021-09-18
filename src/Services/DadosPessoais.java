package Services;

public class DadosPessoais {

    private String nome;
    private String cep;
    private String bairro;
    private String rua;
    private int numeroDaResidencia;

    public DadosPessoais(String nome, String cep, String bairro, String rua, int numeroDaResidencia) {
        this.nome = nome;
        this.cep = cep;
        this.bairro = bairro;
        this.rua = rua;
        this.numeroDaResidencia = numeroDaResidencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumeroDaResidencia() {
        return numeroDaResidencia;
    }

    public void setNumeroDaResidencia(int numeroDaResidencia) {
        this.numeroDaResidencia = numeroDaResidencia;
    }

}
