package testes;

import java.math.BigDecimal;

public enum Desempenho {

    A_DESEJAR {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.03");
        }
    },

    ZERADO{
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.00");
        }
    },

    BOM {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.15");
        }
    },

    OTIMO {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.20");
        }
    },
    ESPETACULAR {
        @Override
        public BigDecimal percentualReajuste() {
            return new BigDecimal("0.40");
        }
    };

    public abstract BigDecimal percentualReajuste();
}
