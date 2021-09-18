package Issues;

public class RequisitarTarefaException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public RequisitarTarefaException(String mensagem) {
        super(mensagem);
    }

}
