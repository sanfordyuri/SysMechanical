package model.Colaboradores;

import Services.Cargos.Cargos;
import Services.DadosPessoais;

public class Colaborador {

    private DadosPessoais dadosPessoais;
    private Cargos cargo;

    public Colaborador(DadosPessoais dadosPessoais, Cargos cargo) {
        this.dadosPessoais = dadosPessoais;
        this.cargo = cargo;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public Cargos getCargo() {
        return cargo;
    }

    public void setCargo(Cargos cargo) {
        this.cargo = cargo;
    }
}
