package Test;

import Services.Cargos.Cargos;
import Services.DadosPessoais;
import Services.data.ListaDeCodigosDeRequisicoes;
import model.Clientes.Cliente;
import model.CodigoDeRequisicao;
import model.Colaboradores.Colaborador;
import model.RequisitarTarefa;
import model.Tarefa;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class RequisitarTarefaTest {

    private static RequisitarTarefa requisitarTarefa;
    private static CodigoDeRequisicao codigo;

    @BeforeAll
    static void inicia() {
        ListaDeCodigosDeRequisicoes listaDeCodigosDeRequisicoes = new ListaDeCodigosDeRequisicoes();
        DadosPessoais dadosPessoais = new DadosPessoais("Yuri Rodrigues Sanford", "607130-30", "Manoel Sátiro", "Alzirio zarur", 293);
        Cliente cliente = new Cliente(dadosPessoais, 1);
        Tarefa tarefa = new Tarefa(new BigDecimal("50.0"), "Troca de pneu", "Precisa trocar o pneu do fiesta");
        DadosPessoais dadosPessoaisC = new DadosPessoais("Yuri Sanford", "60713030", "Manoel Satiro", "Alzirio zarur", 293);
        Colaborador colaborador = new Colaborador(dadosPessoaisC, Cargos.DESENVOLVEDOR);
        codigo = new CodigoDeRequisicao(cliente, colaborador);

        requisitarTarefa = new RequisitarTarefa(LocalDate.now(), tarefa, cliente, codigo, colaborador);
        requisitarTarefa.abrir();
    }


    @Test
    public void aoInserirUmCodigoNaoUsadoAnteriormenteDeveRetornarOCodigoNaUltimaPosicaoDaLista() {
        int ultimoIndex = ListaDeCodigosDeRequisicoes.listaCodigosDeRequisicoes.size() - 1;
        CodigoDeRequisicao codigoDaUltimaPosicao = ListaDeCodigosDeRequisicoes.listaCodigosDeRequisicoes.get(ultimoIndex);
        assertEquals(codigo.getCodigo(), codigoDaUltimaPosicao.getCodigo());
    }

    @Test
    public void aoInserirUmCodigoUsadoAnteriormenteDeveRetornarUmaExecao() {
        DadosPessoais dadosPessoais = new DadosPessoais("Mylena Sousa", "607130-30", "Pv", "Alcindo Guanabara", 1006);
        Cliente cliente = new Cliente(dadosPessoais, 1);
        Tarefa tarefa = new Tarefa(new BigDecimal("25.0"), "Oleo no motor", "Precisa colocar oleo no motor do meu carro");
        DadosPessoais dadosPessoaisC = new DadosPessoais("Yuri Sanford", "60713030", "Manoel Satiro", "Alzirio zarur", 293);
        Colaborador colaborador = new Colaborador(dadosPessoaisC, Cargos.DESENVOLVEDOR);
        requisitarTarefa = new RequisitarTarefa(LocalDate.now(), tarefa, cliente, codigo, colaborador);

        RuntimeException exception = assertThrows(RuntimeException.class, () -> {
            requisitarTarefa.abrir();
        });
        assertEquals("Erro ao tentar criar um codigo, pois o mesmo ja existe", exception.getMessage());
    }

    @Test
    public void aoNotificarUmaAberturaDeveRetornarOsDados() {
        DadosPessoais dadosPessoais = new DadosPessoais("Mylena Sousa", "607130-30", "Pv", "Alcindo Guanabara", 1006);
        Cliente cliente = new Cliente(dadosPessoais, 1);
        Tarefa tarefa = new Tarefa(new BigDecimal("25.0"), "Oleo no motor", "Precisa colocar oleo no motor do meu carro");
        DadosPessoais dadosPessoaisC = new DadosPessoais("Yuri Sanford", "60713030", "Manoel Satiro", "Alzirio zarur", 293);
        Colaborador colaborador = new Colaborador(dadosPessoaisC, Cargos.DESENVOLVEDOR);
        requisitarTarefa = new RequisitarTarefa(LocalDate.now(), tarefa, cliente, codigo, colaborador);

        requisitarTarefa.abrir();

    }

}