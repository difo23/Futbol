package com.eui.futbol.mvp.model;

import android.util.Log;

import java.util.HashMap;

/**
 * Created by lfmingo on 11/03/15.
 */
public class Partido {
    private Equipo local;
    private Equipo visitante;
    private String ligaCode;
    private String ligaCode_name;
    private String country;



    public String getLigaCode_name() {
        return ligaCode_name;
    }

    public void setLigaCode_name(String ligaCode_name) {
        this.ligaCode_name = ligaCode_name;
    }



    public String getLigaCode() {
        return ligaCode;
    }

    public void setLigaCode(String ligaCode) {
        this.ligaCode = ligaCode;
    }

    public Partido(com.eui.futbol.rest.model.Partido partido) {
        this.local = new Equipo(partido.getParticipantes().get1(), partido.getIdEHome());
        this.visitante = new Equipo(partido.getParticipantes().get2(), partido.getIdEAway());
        this.ligaCode = partido.getLigaCode();
        this.country = partido.getCountry();
        this.ligaCode_name = partido.getLeague();
        this.getLocal().setGoles(partido.getCurrentL());
        this.getVisitante().setGoles(partido.getCurrentV());
    }

    public Equipo getVisitante() {
        return visitante;
    }

    public void setVisitante(Equipo visitante) {
        this.visitante = visitante;
    }

    public Equipo getLocal() {
        return local;
    }

    public void setLocal(Equipo local) {
        this.local = local;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public HashMap<String, String> toHashMap() {
        HashMap<String, String> hm = new HashMap<String, String>();

        hm.put("local", this.getLocal().getNombre());
        hm.put("imagen_local","http://medias.marcadores.com/logos/icons/teams-80/"+this.getLocal().getId()+".png");
        hm.put("goles_local", this.getLocal().getGoles());

        // dibujo liga http://medias.marcadores.com/logos/icons/league-64/87.png?v=2
        // bandera pais http://medias.marcadores.com/logos/icons/country-64/8.png?v=5
        // http://img.freeflagicons.com/thumb/football_icon/costa_rica/costa_rica_640.png

        //hm.put("imagen_local", "http://www.marcadoresonline.com/enetpulse/includes/imagen.php?tipo=logo&equipo="+partido.getLocal().getId());
        //hm.put("imagen_local","http://www.bettingexpert.com/assets/images/system/clash/team_logos/football/"+partido.getLocal().getId()+"_Logo.png");

        hm.put("visitante", this.getVisitante().getNombre());
        hm.put("imagen_visitante","http://medias.marcadores.com/logos/icons/teams-80/"+this.getVisitante().getId()+".png");
        hm.put("goles_visitante", this.getVisitante().getGoles());
        //hm.put("imagen_visitante", "http://www.marcadoresonline.com/enetpulse/imagen/logo/"+partido.getVisitante().getId()+".png");//includes/imagen.php?tipo=logo&equipo="+partido.getVisitante().getId());
        //hm.put("imagen_visitante","http://www.bettingexpert.com/assets/images/system/clash/team_logos/football/"+partido.getVisitante().getId()+"_Logo.png");

        return hm;
    }

    public String getCountry() {
        return country;
    }
}
