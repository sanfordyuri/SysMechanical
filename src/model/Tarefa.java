package model;

import java.math.BigDecimal;

public class Tarefa {

    private BigDecimal valor;
    private String tituloTarefa;
    private String resumoTarefa;

    public Tarefa(BigDecimal valor, String tituloTarefa, String resumoTarefa) {
        this.valor = valor;
        this.tituloTarefa = tituloTarefa;
        this.resumoTarefa = resumoTarefa;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public String getTituloTarefa() {
        return tituloTarefa;
    }

    public String getResumoTarefa() {
        return resumoTarefa;
    }
}
