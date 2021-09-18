package model.Clientes;

import Services.DadosPessoais;

public class Cliente {

    private DadosPessoais dadosPessoais;
    private int pedidos;

    public Cliente(DadosPessoais dadosPessoais, int pedidos) {
        this.dadosPessoais = dadosPessoais;
        this.pedidos = pedidos;
    }

    public String getNome() {
        return dadosPessoais.getNome();
    }

    public void setNome(String nome) {
        dadosPessoais.setNome(nome);
    }

    public String getCep() {
        return dadosPessoais.getCep();
    }

    public void setCep(String cep) {
        dadosPessoais.setCep(cep);
    }

    public String getBairro() {
        return dadosPessoais.getBairro();
    }

    public void setBairro(String bairro) {
        dadosPessoais.setBairro(bairro);
    }

    public String getRua() {
        return dadosPessoais.getRua();
    }

    public void setRua(String rua) {
        dadosPessoais.setRua(rua);
    }

    public int getNumeroDaResidencia() {
        return dadosPessoais.getNumeroDaResidencia();
    }

    public void setNumeroDaResidencia(int numeroDaResidencia) {
        dadosPessoais.setNumeroDaResidencia(numeroDaResidencia);
    }

    public int getPedidos() {
        return pedidos;
    }

    public void setPedidos(int pedidos) {
        this.pedidos = pedidos;
    }
}
