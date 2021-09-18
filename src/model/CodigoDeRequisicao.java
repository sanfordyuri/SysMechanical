package model;

import Services.GeradorDeCodigoDeRequisicao;
import model.Clientes.Cliente;
import model.Colaboradores.Colaborador;

public class CodigoDeRequisicao {

    private final Cliente cliente;
    private final String codigo;
    private final Colaborador responsavel;

    public CodigoDeRequisicao(Cliente cliente,Colaborador responsavel) {
        this.cliente = cliente;
        this.codigo = GeradorDeCodigoDeRequisicao.gerar();
        this.responsavel = responsavel;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public Colaborador getResponsavel() {
        return responsavel;
    }
}
