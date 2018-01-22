/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package githubtestproject;

/**
 *
 * @author schueler
 */
public class LKW {
    private String marke;
    private String modell;
    private String kennzeichen;
    private boolean hasSchneekettenOn = true;

    public LKW(String marke, String modell, String kennzeichen, boolean hasSchneekettenOn) {
        this.marke = marke;
        this.modell = modell;
        this.kennzeichen = kennzeichen;
        this.hasSchneekettenOn = hasSchneekettenOn;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
    }

    public boolean isHasSchneekettenOn() {
        return hasSchneekettenOn;
    }

    public void setHasSchneekettenOn(boolean hasSchneekettenOn) {
        this.hasSchneekettenOn = hasSchneekettenOn;
    }

    @Override
    public String toString() {
        return "LKW{" + "marke=" + marke + ", modell=" + modell + ", kennzeichen=" + kennzeichen + ", hasSchneekettenOn=" + hasSchneekettenOn + '}';
    }
}
