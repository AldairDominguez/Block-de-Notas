/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package promedio;

/**
 *
 * @author User
 */
public class Datos {
    String LAB,INV,EP,PROMEDIO;

    public Datos (String LAB, String INV, String EP, String PROMEDIO) {
        this.LAB = LAB;
        this.INV = INV;
        this.EP = EP;
        this.PROMEDIO = PROMEDIO;
    }

    Datos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Datos(float f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getLAB() {
        return LAB;
    }

    public void setLAB(String LAB) {
        this.LAB = LAB;
    }

    public String getINV() {
        return INV;
    }

    public void setINV(String INV) {
        this.INV = INV;
    }

    public String getEP() {
        return EP;
    }

    public void setEP(String EP) {
        this.EP = EP;
    }

    public String getPROMEDIO() {
        return PROMEDIO;
    }

    public void setPROMEDIFINAL(String PROMEDIO) {
        this.PROMEDIO = PROMEDIO;
    }
   
}
