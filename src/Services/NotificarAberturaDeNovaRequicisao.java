package Services;

import model.CodigoDeRequisicao;
import model.Colaboradores.Colaborador;
import model.Tarefa;

public class NotificarAberturaDeNovaRequicisao {

    private final CodigoDeRequisicao codigoDeRequisicao;
    private final Tarefa tarefa;

    public NotificarAberturaDeNovaRequicisao(CodigoDeRequisicao codigoDeRequisicao, Tarefa tarefa) {
        this.codigoDeRequisicao = codigoDeRequisicao;
        this.tarefa = tarefa;
    }

    public void notificar() {
        Colaborador responsavel = codigoDeRequisicao.getResponsavel();
        System.out.println(" ==== Um novo chamado foi aberto ====");
        System.out.println(" Responsável: " + responsavel.getDadosPessoais().getNome());
        System.out.println(" Cliente: " + codigoDeRequisicao.getCliente().getNome());
        System.out.println(" Endereço: " + codigoDeRequisicao.getCliente().getBairro() + ", " + codigoDeRequisicao.getCliente().getRua() + ", " + codigoDeRequisicao.getCliente().getNumeroDaResidencia());
        System.out.println(" Tarefa: " + tarefa.getTituloTarefa());
        System.out.println(" Resumo: " + tarefa.getResumoTarefa());
        System.out.println(" Valor: R$" + tarefa.getValor());
    }

}
