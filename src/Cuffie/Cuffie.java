package Cuffie;

import Prodotto.Prodotto;

public class Cuffie extends Prodotto {

    private String colore;

    private boolean wireless;

    public String getColore() {
        return colore;
    }

    public boolean isWireless() {
        return wireless;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setWireless(boolean wireless) {
        this.wireless = wireless;
    }
    
    
}
