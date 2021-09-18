package Services.data;

import Services.Cargos.Cargos;
import Services.DadosPessoais;
import model.CodigoDeRequisicao;
import model.Clientes.Cliente;
import model.Colaboradores.Colaborador;

import java.util.ArrayList;
import java.util.List;

public class ListaDeCodigosDeRequisicoes {

    public static List<CodigoDeRequisicao> listaCodigosDeRequisicoes;

    public ListaDeCodigosDeRequisicoes() {
        this.listaCodigosDeRequisicoes = new ArrayList<>();

        DadosPessoais dadosPessoaisC = new DadosPessoais("Yuri Sanford", "60713030", "Manoel Satiro", "Alzirio zarur", 293);
        Colaborador colaborador = new Colaborador(dadosPessoaisC, Cargos.DESENVOLVEDOR);
        this.listaCodigosDeRequisicoes.add(new CodigoDeRequisicao(new Cliente(new DadosPessoais("Yuri Rodrigues Sanford", "607130-30", "Manoel Sátiro", "Alzirio zarur", 293), 1), colaborador));
        this.listaCodigosDeRequisicoes.add(new CodigoDeRequisicao(new Cliente(new DadosPessoais("Ana Dolores Sanford", "607130-30", "Manoel Sátiro", "Alzirio zarur", 293), 2), colaborador));
    }

    public static void add(CodigoDeRequisicao codigoDeRequicisao) {
        listaCodigosDeRequisicoes.add(codigoDeRequicisao);
    }

    public static boolean verificaSeJaExisteUmCodigoDeRequisicaoAberto(CodigoDeRequisicao codigoDeRequicisao) {
        return listaCodigosDeRequisicoes.contains(codigoDeRequicisao);
    }

}
