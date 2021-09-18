package Services.data;

import Services.Cargos.Cargos;
import Services.DadosPessoais;
import model.Colaboradores.Colaborador;

import java.util.ArrayList;
import java.util.List;

public class ListaDeColaboradores {


    public static List<Colaborador> listaDeColaboradores;

    public ListaDeColaboradores() {
        this.listaDeColaboradores = new ArrayList<>();
        DadosPessoais dadosPessoais = new DadosPessoais("Yuri Sanford", "60713030", "Manoel Satiro", "Alzirio zarur", 293);
        add(new Colaborador(dadosPessoais, Cargos.DESENVOLVEDOR));
    }

    public static void add(Colaborador colaborador) {
        listaDeColaboradores.add(colaborador);
    }

}
