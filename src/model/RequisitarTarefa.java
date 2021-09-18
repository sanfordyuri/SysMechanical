package model;

import Issues.RequisitarTarefaException;
import Services.NotificarAberturaDeNovaRequicisao;
import Services.TarefasPreDefinidas.TarefasPreDefinidas;
import Services.data.ListaDeCodigosDeRequisicoes;
import model.Clientes.Cliente;
import model.Colaboradores.Colaborador;

import java.time.LocalDate;


public class RequisitarTarefa {
    private LocalDate horarioDeAberturaDoPedido;
    private Tarefa tarefa;
    private Cliente cliente;
    private CodigoDeRequisicao codigoDeRequisicao;
    private TarefasPreDefinidas tarefasPreDefinidas;
    private Colaborador responsavel;

    public RequisitarTarefa(LocalDate horarioDeAberturaDoPedido, Tarefa tarefa, Cliente cliente, CodigoDeRequisicao codigoDeRequisicao, Colaborador responsavel) {
        this.horarioDeAberturaDoPedido = horarioDeAberturaDoPedido;
        this.tarefa = tarefa;
        this.cliente = cliente;
        this.codigoDeRequisicao = codigoDeRequisicao;
        this.responsavel = responsavel;
    }

    public RequisitarTarefa(LocalDate horarioDeAberturaDoPedido, TarefasPreDefinidas tarefasPreDefinidas, Cliente cliente, CodigoDeRequisicao codigoDeRequisicao, Colaborador responsavel) {
        this.horarioDeAberturaDoPedido = horarioDeAberturaDoPedido;
        this.tarefasPreDefinidas = tarefasPreDefinidas;
        this.cliente = cliente;
        this.codigoDeRequisicao = codigoDeRequisicao;
        this.responsavel = responsavel;
    }

    public void abrir() {
        if(ListaDeCodigosDeRequisicoes.verificaSeJaExisteUmCodigoDeRequisicaoAberto(codigoDeRequisicao)) {
            throw new RequisitarTarefaException("Ja existe um servico requisitado com esse codigo com dominio de: " + codigoDeRequisicao.getCliente().getNome());
        } else {
            ListaDeCodigosDeRequisicoes.add(codigoDeRequisicao);
            new NotificarAberturaDeNovaRequicisao(codigoDeRequisicao, tarefa).notificar();
        }
    }

}
