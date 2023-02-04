package com.mycompany.InventarioGrupo8_ProgAv2;

import javax.swing.JOptionPane;


public class EstablecerCampos
{
    //Variables de Producto
    private static int cloro, detergente;
    
    //Variables de Control
    private static int minimoC, maximoC, minimoD, maximoD;
    
    //Métodos Set
    public void setCloro(int cloro1)
    {
        this.cloro = cloro1;
    }
    public void setDetergente(int detergente1)
    {
        this.detergente = detergente1;
    }
    public void setCloroMax(int cloroMax)
    {
        this.maximoC = cloroMax;
    }
    public void setDetergenteMax(int detergenteMax)
    {
        this.maximoD = detergenteMax;
    }
    public void setCloroMin(int cloroMin)
    {
        this.minimoC = cloroMin;
    }
    public void setDetergenteMin(int detergenteMin)
    {
        this.minimoD = detergenteMin;
    }
    
    //Métodos Get
    public int getCloro()
    {
        return cloro;
    }
    public int getDetergente()
    {
        return detergente;
    }
    public int getCloroMax()
    {
        return maximoC;
    }
    public int getDetergenteMax()
    {
        return maximoD;
    }
    public int getCloroMin()
    {
        return minimoC;
    }
    public int getDetergenteMin()
    {
        return minimoD;
    }

}