package Services.TarefasPreDefinidas;

import java.math.BigDecimal;

public enum TarefasPreDefinidas {

    TROCAR_PNEU {
        @Override
        public BigDecimal getValor() {
            return new BigDecimal("50.0");
        }
    },
    TROCAR_OLEO {
        @Override
        public BigDecimal getValor() {
            return new BigDecimal("30.0");
        }
    },
    REVISAO {
        @Override
        public BigDecimal getValor() {
            return new BigDecimal("150.0");
        }
    };

    public abstract BigDecimal getValor();
}
