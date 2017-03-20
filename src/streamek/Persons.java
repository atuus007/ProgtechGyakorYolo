/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streamek;

/**
 *
 * @author Ati
 */
public class Persons {
    private String k_nev;
    private String v_nev;
    private int eletkor;
    private int testSuly;
    private boolean hazas;

    public Persons(String k_nev, String v_nev, int eletkor, int testSuly, boolean hazas) {
        this.k_nev = k_nev;
        this.v_nev = v_nev;
        this.eletkor = eletkor;
        this.testSuly = testSuly;
        this.hazas = hazas;
    }

    public void setK_nev(String k_nev) {
        this.k_nev = k_nev;
    }

    public void setV_nev(String v_nev) {
        this.v_nev = v_nev;
    }

    public void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    public void setTestSuly(int testSuly) {
        this.testSuly = testSuly;
    }

    public void setHazas(boolean hazas) {
        this.hazas = hazas;
    }

    public String getK_nev() {
        return k_nev;
    }

    public String getV_nev() {
        return v_nev;
    }

    public int getEletkor() {
        return eletkor;
    }

    public int getTestSuly() {
        return testSuly;
    }

    public boolean isHazas() {
        return hazas;
    }

    @Override
    public String toString() {
        return "Persons{" + "k_nev=" + k_nev + ", v_nev=" + v_nev + ", eletkor=" + eletkor + ", testSuly=" + testSuly + ", hazas=" + hazas + '}';
    }
    
}
