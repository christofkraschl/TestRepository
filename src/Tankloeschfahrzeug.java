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
public class Tankloeschfahrzeug extends LKW{
    private String rufKennzeichen;
    private int tankSize;
    private int schaumCapacity;
    private int anzahlSitzplaetze;
    
    public Tankloeschfahrzeug(String marke, String modell, String kennzeichen, boolean hasSchneekettenOn) {
        super(marke, modell, kennzeichen, hasSchneekettenOn);
    }

    public String getRufKennzeichen() {
        return rufKennzeichen;
    }

    public void setRufKennzeichen(String rufKennzeichen) {
        this.rufKennzeichen = rufKennzeichen;
    }

    public int getTankSize() {
        return tankSize;
    }

    public void setTankSize(int tankSize) {
        this.tankSize = tankSize;
    }

    public int getSchaumCapacity() {
        return schaumCapacity;
    }

    public void setSchaumCapacity(int schaumCapacity) {
        this.schaumCapacity = schaumCapacity;
    }

    public int getAnzahlSitzplaetze() {
        return anzahlSitzplaetze;
    }

    public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
        this.anzahlSitzplaetze = anzahlSitzplaetze;
    }

    @Override
    public String toString() {
        return "Tankloeschfahrzeug{" + "rufKennzeichen=" + rufKennzeichen + ", tankSize=" + tankSize + ", schaumCapacity=" + schaumCapacity + ", anzahlSitzplaetze=" + anzahlSitzplaetze + '}';
    }
}
