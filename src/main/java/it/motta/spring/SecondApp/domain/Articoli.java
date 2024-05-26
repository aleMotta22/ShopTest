package it.motta.spring.SecondApp.domain;

import java.io.Serializable;
import java.sql.Date;

public class Articoli implements Serializable {

    
    private String codArt;
    private String descrizione;
    private String um;
    private String codStat;
    private int pzCart;
    private double pesoNetto;
    private int idIva;
    private String idStatoArt;
    private Date dataCreazione;
    private int idFamAss;

    public Articoli() {
    }

    public String getCodArt() {
        return codArt;
    }

    public void setCodArt(String codArt) {
        this.codArt = codArt;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getUm() {
        return um;
    }

    public void setUm(String um) {
        this.um = um;
    }

    public String getCodStat() {
        return codStat;
    }

    public void setCodStat(String codStat) {
        this.codStat = codStat;
    }

    public int getPzCart() {
        return pzCart;
    }

    public void setPzCart(int pzCart) {
        this.pzCart = pzCart;
    }

    public double getPesoNetto() {
        return pesoNetto;
    }

    public void setPesoNetto(double pesoNetto) {
        this.pesoNetto = pesoNetto;
    }

    public int getIdIva() {
        return idIva;
    }

    public void setIdIva(int idIva) {
        this.idIva = idIva;
    }

    public String getIdStatoArt() {
        return idStatoArt;
    }

    public void setIdStatoArt(String idStatoArt) {
        this.idStatoArt = idStatoArt;
    }

    public Date getDataCreazione() {
        return dataCreazione;
    }

    public void setDataCreazione(Date dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public int getIdFamAss() {
        return idFamAss;
    }

    public void setIdFamAss(int idFamAss) {
        this.idFamAss = idFamAss;
    }



}
