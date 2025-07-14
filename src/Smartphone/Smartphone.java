package Smartphone;

import Prodotto.Prodotto;

public class Smartphone extends Prodotto{

    protected  int codiceImei;

    private int spazioMemoria;

    public int getCodiceImei() {
        return codiceImei;
    }

    public void setCodiceImei(int codiceImei) {
        this.codiceImei = codiceImei;
    }

    public int getSpazioMemoria() {
        return spazioMemoria;
    }

    public void setSpazioMemoria(int spazioMemoria) {
        this.spazioMemoria = spazioMemoria;
    }

    
}
