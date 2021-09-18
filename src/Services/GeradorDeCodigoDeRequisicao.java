package Services;

import java.util.Random;

import static Constants.Contansts.*;

public class GeradorDeCodigoDeRequisicao {

    public static String gerar() {
        Random r = new Random();
        StringBuilder key = new StringBuilder();
        for(int i=0;i<=4;i++) {
            int ra = r.nextInt(100);
            if(ra <= 30) {
                key.append(NUMEROS[r.nextInt(NUMEROS.length - 1)]);
            } else if( ra <= 50) {
                key.append(LETRAS[r.nextInt(LETRAS.length - 1)]);
            } else if(ra <= 70) {
                key.append(LETRAS[r.nextInt(LETRAS.length - 1)].toUpperCase());
            } else {
                key.append(LETRAS[r.nextInt(LETRAS.length - 1)].toUpperCase());
            }
        }
        return ODM + key;
    }

}
