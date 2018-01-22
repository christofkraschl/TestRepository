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
public class Wasserrettungsboot {
    private int speeeeed;
    private int anzahlSchwimmwesten;
    private String name;
    private int anzahlSitzplaetze;

    public Wasserrettungsboot(int speeeeed, int anzahlSchwimmwesten, String name, int anzahlSitzplaetze) {
        this.speeeeed = speeeeed;
        this.anzahlSchwimmwesten = anzahlSchwimmwesten;
        this.name = name;
        this.anzahlSitzplaetze = anzahlSitzplaetze;
    }

    public int getSpeeeeed() {
        return speeeeed;
    }

    public void setSpeeeeed(int speeeeed) {
        this.speeeeed = speeeeed;
    }

    public int getAnzahlSchwimmwesten() {
        return anzahlSchwimmwesten;
    }

    public void setAnzahlSchwimmwesten(int anzahlSchwimmwesten) {
        this.anzahlSchwimmwesten = anzahlSchwimmwesten;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnzahlSitzplaetze() {
        return anzahlSitzplaetze;
    }

    public void setAnzahlSitzplaetze(int anzahlSitzplaetze) {
        this.anzahlSitzplaetze = anzahlSitzplaetze;
    }

    @Override
    public String toString() {
        return "Wasserrettungsboot{" + "speeeeed=" + speeeeed + ", anzahlSchwimmwesten=" + anzahlSchwimmwesten + ", name=" + name + ", anzahlSitzplaetze=" + anzahlSitzplaetze + '}';
    }
}
