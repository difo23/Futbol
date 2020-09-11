package com.eui.futbol.rest.model;

//      import javax.annotation.Generated;

import com.eui.futbol.mvp.model.Equipo;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Partido {

    @Expose
    private Object codeSport;
    @Expose
    private String fecha;
    @Expose
    private String starTime;
    @Expose
    private String round;
    @SerializedName("n_eHome")
    @Expose
    private String nEHome;
    @SerializedName("n_eAway")
    @Expose
    private String nEAway;
    @Expose
    private String tenCurrent;
    @Expose
    private String socCurrent;
    @Expose
    private String bskCurrent;
    @SerializedName("url_partido")
    @Expose
    private String urlPartido;
    @SerializedName("s1_l")
    @Expose
    private Object s1L;
    @SerializedName("s1_v")
    @Expose
    private Object s1V;
    @SerializedName("s2_l")
    @Expose
    private Object s2L;
    @SerializedName("s2_v")
    @Expose
    private Object s2V;
    @SerializedName("s3_l")
    @Expose
    private Object s3L;
    @SerializedName("s3_v")
    @Expose
    private Object s3V;
    @SerializedName("s4_l")
    @Expose
    private Object s4L;
    @SerializedName("s4_v")
    @Expose
    private Object s4V;
    @SerializedName("s5_l")
    @Expose
    private Object s5L;
    @SerializedName("s5_v")
    @Expose
    private Object s5V;
    @SerializedName("tenCurrent_v")
    @Expose
    private Object tenCurrentV;
    @SerializedName("tenCurrent_l")
    @Expose
    private Object tenCurrentL;
    @SerializedName("status_desc_sigla")
    @Expose
    private Object statusDescSigla;
    @Expose
    private String id;
    @Expose
    private String ligaCode;
    @Expose
    private String league;
    @SerializedName("current_l")
    @Expose
    private String currentL;
    @SerializedName("current_v")
    @Expose
    private String currentV;
    @Expose
    private String status;
    @Expose
    private String statusType;
    @Expose
    private int ct;
    @Expose
    private String country;
    @Expose
    private String orden;
    @SerializedName("id_liga")
    @Expose
    private String idLiga;
    @Expose
    private String bandera;
    @SerializedName("livestats_type")
    @Expose
    private String livestatsType;
    @Expose
    private int tiempo;
    @Expose
    private String current;
    @Expose
    private int minutoFutbol;
    @SerializedName("id_eHome")
    @Expose
    private String idEHome;
    @SerializedName("nombre_url_local")
    @Expose
    private String nombreUrlLocal;
    @Expose
    private Participantes participantes;
    @SerializedName("id_eAway")
    @Expose
    private String idEAway;
    @SerializedName("nombre_url_visitante")
    @Expose
    private String nombreUrlVisitante;
    @Expose
    private String s1;
    @Expose
    private String s2;
    @Expose
    private String s3;
    @Expose
    private String s4;
    @Expose
    private String s5;
    @Expose
    private String prioridad;



    /**
     * @return The codeSport
     */
    public Object getCodeSport() {
        return codeSport;
    }

    /**
     * @param codeSport The codeSport
     */
    public void setCodeSport(Object codeSport) {
        this.codeSport = codeSport;
    }

    public Partido withCodeSport(Object codeSport) {
        this.codeSport = codeSport;
        return this;
    }

    /**
     * @return The fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha The fecha
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Partido withFecha(String fecha) {
        this.fecha = fecha;
        return this;
    }

    /**
     * @return The starTime
     */
    public String getStarTime() {
        return starTime;
    }

    /**
     * @param starTime The starTime
     */
    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public Partido withStarTime(String starTime) {
        this.starTime = starTime;
        return this;
    }

    /**
     * @return The round
     */
    public String getRound() {
        return round;
    }

    /**
     * @param round The round
     */
    public void setRound(String round) {
        this.round = round;
    }

    public Partido withRound(String round) {
        this.round = round;
        return this;
    }

    /**
     * @return The nEHome
     */
    public String getNEHome() {
        return nEHome;
    }

    /**
     * @param nEHome The n_eHome
     */
    public void setNEHome(String nEHome) {
        this.nEHome = nEHome;
    }

    public Partido withNEHome(String nEHome) {
        this.nEHome = nEHome;
        return this;
    }

    /**
     * @return The nEAway
     */
    public String getNEAway() {
        return nEAway;
    }

    /**
     * @param nEAway The n_eAway
     */
    public void setNEAway(String nEAway) {
        this.nEAway = nEAway;
    }

    public Partido withNEAway(String nEAway) {
        this.nEAway = nEAway;
        return this;
    }

    /**
     * @return The tenCurrent
     */
    public String getTenCurrent() {
        return tenCurrent;
    }

    /**
     * @param tenCurrent The tenCurrent
     */
    public void setTenCurrent(String tenCurrent) {
        this.tenCurrent = tenCurrent;
    }

    public Partido withTenCurrent(String tenCurrent) {
        this.tenCurrent = tenCurrent;
        return this;
    }

    /**
     * @return The socCurrent
     */
    public String getSocCurrent() {
        return socCurrent;
    }

    /**
     * @param socCurrent The socCurrent
     */
    public void setSocCurrent(String socCurrent) {
        this.socCurrent = socCurrent;
    }

    public Partido withSocCurrent(String socCurrent) {
        this.socCurrent = socCurrent;
        return this;
    }

    /**
     * @return The bskCurrent
     */
    public String getBskCurrent() {
        return bskCurrent;
    }

    /**
     * @param bskCurrent The bskCurrent
     */
    public void setBskCurrent(String bskCurrent) {
        this.bskCurrent = bskCurrent;
    }

    public Partido withBskCurrent(String bskCurrent) {
        this.bskCurrent = bskCurrent;
        return this;
    }

    /**
     * @return The urlPartido
     */
    public String getUrlPartido() {
        return urlPartido;
    }

    /**
     * @param urlPartido The url_partido
     */
    public void setUrlPartido(String urlPartido) {
        this.urlPartido = urlPartido;
    }

    public Partido withUrlPartido(String urlPartido) {
        this.urlPartido = urlPartido;
        return this;
    }

    /**
     * @return The s1L
     */
    public Object getS1L() {
        return s1L;
    }

    /**
     * @param s1L The s1_l
     */
    public void setS1L(Object s1L) {
        this.s1L = s1L;
    }

    public Partido withS1L(Object s1L) {
        this.s1L = s1L;
        return this;
    }

    /**
     * @return The s1V
     */
    public Object getS1V() {
        return s1V;
    }

    /**
     * @param s1V The s1_v
     */
    public void setS1V(Object s1V) {
        this.s1V = s1V;
    }

    public Partido withS1V(Object s1V) {
        this.s1V = s1V;
        return this;
    }

    /**
     * @return The s2L
     */
    public Object getS2L() {
        return s2L;
    }

    /**
     * @param s2L The s2_l
     */
    public void setS2L(Object s2L) {
        this.s2L = s2L;
    }

    public Partido withS2L(Object s2L) {
        this.s2L = s2L;
        return this;
    }

    /**
     * @return The s2V
     */
    public Object getS2V() {
        return s2V;
    }

    /**
     * @param s2V The s2_v
     */
    public void setS2V(Object s2V) {
        this.s2V = s2V;
    }

    public Partido withS2V(Object s2V) {
        this.s2V = s2V;
        return this;
    }

    /**
     * @return The s3L
     */
    public Object getS3L() {
        return s3L;
    }

    /**
     * @param s3L The s3_l
     */
    public void setS3L(Object s3L) {
        this.s3L = s3L;
    }

    public Partido withS3L(Object s3L) {
        this.s3L = s3L;
        return this;
    }

    /**
     * @return The s3V
     */
    public Object getS3V() {
        return s3V;
    }

    /**
     * @param s3V The s3_v
     */
    public void setS3V(Object s3V) {
        this.s3V = s3V;
    }

    public Partido withS3V(Object s3V) {
        this.s3V = s3V;
        return this;
    }

    /**
     * @return The s4L
     */
    public Object getS4L() {
        return s4L;
    }

    /**
     * @param s4L The s4_l
     */
    public void setS4L(Object s4L) {
        this.s4L = s4L;
    }

    public Partido withS4L(Object s4L) {
        this.s4L = s4L;
        return this;
    }

    /**
     * @return The s4V
     */
    public Object getS4V() {
        return s4V;
    }

    /**
     * @param s4V The s4_v
     */
    public void setS4V(Object s4V) {
        this.s4V = s4V;
    }

    public Partido withS4V(Object s4V) {
        this.s4V = s4V;
        return this;
    }

    /**
     * @return The s5L
     */
    public Object getS5L() {
        return s5L;
    }

    /**
     * @param s5L The s5_l
     */
    public void setS5L(Object s5L) {
        this.s5L = s5L;
    }

    public Partido withS5L(Object s5L) {
        this.s5L = s5L;
        return this;
    }

    /**
     * @return The s5V
     */
    public Object getS5V() {
        return s5V;
    }

    /**
     * @param s5V The s5_v
     */
    public void setS5V(Object s5V) {
        this.s5V = s5V;
    }

    public Partido withS5V(Object s5V) {
        this.s5V = s5V;
        return this;
    }

    /**
     * @return The tenCurrentV
     */
    public Object getTenCurrentV() {
        return tenCurrentV;
    }

    /**
     * @param tenCurrentV The tenCurrent_v
     */
    public void setTenCurrentV(Object tenCurrentV) {
        this.tenCurrentV = tenCurrentV;
    }

    public Partido withTenCurrentV(Object tenCurrentV) {
        this.tenCurrentV = tenCurrentV;
        return this;
    }

    /**
     * @return The tenCurrentL
     */
    public Object getTenCurrentL() {
        return tenCurrentL;
    }

    /**
     * @param tenCurrentL The tenCurrent_l
     */
    public void setTenCurrentL(Object tenCurrentL) {
        this.tenCurrentL = tenCurrentL;
    }

    public Partido withTenCurrentL(Object tenCurrentL) {
        this.tenCurrentL = tenCurrentL;
        return this;
    }

    /**
     * @return The statusDescSigla
     */
    public Object getStatusDescSigla() {
        return statusDescSigla;
    }

    /**
     * @param statusDescSigla The status_desc_sigla
     */
    public void setStatusDescSigla(Object statusDescSigla) {
        this.statusDescSigla = statusDescSigla;
    }

    public Partido withStatusDescSigla(Object statusDescSigla) {
        this.statusDescSigla = statusDescSigla;
        return this;
    }

    /**
     * @return The id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Partido withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * @return The ligaCode
     */
    public String getLigaCode() {
        return ligaCode;
    }

    /**
     * @param ligaCode The ligaCode
     */
    public void setLigaCode(String ligaCode) {
        this.ligaCode = ligaCode;
    }

    public Partido withLigaCode(String ligaCode) {
        this.ligaCode = ligaCode;
        return this;
    }

    /**
     * @return The league
     */
    public String getLeague() {
        return league;
    }

    /**
     * @param league The league
     */
    public void setLeague(String league) {
        this.league = league;
    }

    public Partido withLeague(String league) {
        this.league = league;
        return this;
    }

    /**
     * @return The currentL
     */
    public String getCurrentL() {
        return currentL;
    }

    /**
     * @param currentL The current_l
     */
    public void setCurrentL(String currentL) {
        this.currentL = currentL;
    }

    public Partido withCurrentL(String currentL) {
        this.currentL = currentL;
        return this;
    }

    /**
     * @return The currentV
     */
    public String getCurrentV() {
        return currentV;
    }

    /**
     * @param currentV The current_v
     */
    public void setCurrentV(String currentV) {
        this.currentV = currentV;
    }

    public Partido withCurrentV(String currentV) {
        this.currentV = currentV;
        return this;
    }

    /**
     * @return The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    public Partido withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * @return The statusType
     */
    public String getStatusType() {
        return statusType;
    }

    /**
     * @param statusType The statusType
     */
    public void setStatusType(String statusType) {
        this.statusType = statusType;
    }

    public Partido withStatusType(String statusType) {
        this.statusType = statusType;
        return this;
    }

    /**
     * @return The ct
     */
    public int getCt() {
        return ct;
    }

    /**
     * @param ct The ct
     */
    public void setCt(int ct) {
        this.ct = ct;
    }

    public Partido withCt(int ct) {
        this.ct = ct;
        return this;
    }

    /**
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    public Partido withCountry(String country) {
        this.country = country;
        return this;
    }

    /**
     * @return The orden
     */
    public String getOrden() {
        return orden;
    }

    /**
     * @param orden The orden
     */
    public void setOrden(String orden) {
        this.orden = orden;
    }

    public Partido withOrden(String orden) {
        this.orden = orden;
        return this;
    }

    /**
     * @return The idLiga
     */
    public String getIdLiga() {
        return idLiga;
    }

    /**
     * @param idLiga The id_liga
     */
    public void setIdLiga(String idLiga) {
        this.idLiga = idLiga;
    }

    public Partido withIdLiga(String idLiga) {
        this.idLiga = idLiga;
        return this;
    }

    /**
     * @return The bandera
     */
    public String getBandera() {
        return bandera;
    }

    /**
     * @param bandera The bandera
     */
    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public Partido withBandera(String bandera) {
        this.bandera = bandera;
        return this;
    }

    /**
     * @return The livestatsType
     */
    public String getLivestatsType() {
        return livestatsType;
    }

    /**
     * @param livestatsType The livestats_type
     */
    public void setLivestatsType(String livestatsType) {
        this.livestatsType = livestatsType;
    }

    public Partido withLivestatsType(String livestatsType) {
        this.livestatsType = livestatsType;
        return this;
    }

    /**
     * @return The tiempo
     */
    public int getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo The tiempo
     */
    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Partido withTiempo(int tiempo) {
        this.tiempo = tiempo;
        return this;
    }

    /**
     * @return The current
     */
    public String getCurrent() {
        return current;
    }

    /**
     * @param current The current
     */
    public void setCurrent(String current) {
        this.current = current;
    }

    public Partido withCurrent(String current) {
        this.current = current;
        return this;
    }

    /**
     * @return The minutoFutbol
     */
    public int getMinutoFutbol() {
        return minutoFutbol;
    }

    /**
     * @param minutoFutbol The minutoFutbol
     */
    public void setMinutoFutbol(int minutoFutbol) {
        this.minutoFutbol = minutoFutbol;
    }

    public Partido withMinutoFutbol(int minutoFutbol) {
        this.minutoFutbol = minutoFutbol;
        return this;
    }

    /**
     * @return The idEHome
     */
    public String getIdEHome() {
        return idEHome;
    }

    /**
     * @param idEHome The id_eHome
     */
    public void setIdEHome(String idEHome) {
        this.idEHome = idEHome;
    }

    public Partido withIdEHome(String idEHome) {
        this.idEHome = idEHome;
        return this;
    }

    /**
     * @return The nombreUrlLocal
     */
    public String getNombreUrlLocal() {
        return nombreUrlLocal;
    }

    /**
     * @param nombreUrlLocal The nombre_url_local
     */
    public void setNombreUrlLocal(String nombreUrlLocal) {
        this.nombreUrlLocal = nombreUrlLocal;
    }

    public Partido withNombreUrlLocal(String nombreUrlLocal) {
        this.nombreUrlLocal = nombreUrlLocal;
        return this;
    }

    /**
     * @return The participantes
     */
    public Participantes getParticipantes() {
        return participantes;
    }

    /**
     * @param participantes The participantes
     */
    public void setParticipantes(Participantes participantes) {
        this.participantes = participantes;
    }

    public Partido withParticipantes(Participantes participantes) {
        this.participantes = participantes;
        return this;
    }

    /**
     * @return The idEAway
     */
    public String getIdEAway() {
        return idEAway;
    }

    /**
     * @param idEAway The id_eAway
     */
    public void setIdEAway(String idEAway) {
        this.idEAway = idEAway;
    }

    public Partido withIdEAway(String idEAway) {
        this.idEAway = idEAway;
        return this;
    }

    /**
     * @return The nombreUrlVisitante
     */
    public String getNombreUrlVisitante() {
        return nombreUrlVisitante;
    }

    /**
     * @param nombreUrlVisitante The nombre_url_visitante
     */
    public void setNombreUrlVisitante(String nombreUrlVisitante) {
        this.nombreUrlVisitante = nombreUrlVisitante;
    }

    public Partido withNombreUrlVisitante(String nombreUrlVisitante) {
        this.nombreUrlVisitante = nombreUrlVisitante;
        return this;
    }

    /**
     * @return The s1
     */
    public String getS1() {
        return s1;
    }

    /**
     * @param s1 The s1
     */
    public void setS1(String s1) {
        this.s1 = s1;
    }

    public Partido withS1(String s1) {
        this.s1 = s1;
        return this;
    }

    /**
     * @return The s2
     */
    public String getS2() {
        return s2;
    }

    /**
     * @param s2 The s2
     */
    public void setS2(String s2) {
        this.s2 = s2;
    }

    public Partido withS2(String s2) {
        this.s2 = s2;
        return this;
    }

    /**
     * @return The s3
     */
    public String getS3() {
        return s3;
    }

    /**
     * @param s3 The s3
     */
    public void setS3(String s3) {
        this.s3 = s3;
    }

    public Partido withS3(String s3) {
        this.s3 = s3;
        return this;
    }

    /**
     * @return The s4
     */
    public String getS4() {
        return s4;
    }

    /**
     * @param s4 The s4
     */
    public void setS4(String s4) {
        this.s4 = s4;
    }

    public Partido withS4(String s4) {
        this.s4 = s4;
        return this;
    }

    /**
     * @return The s5
     */
    public String getS5() {
        return s5;
    }

    /**
     * @param s5 The s5
     */
    public void setS5(String s5) {
        this.s5 = s5;
    }

    public Partido withS5(String s5) {
        this.s5 = s5;
        return this;
    }

    /**
     * @return The prioridad
     */
    public String getPrioridad() {
        return prioridad;
    }

    /**
     * @param prioridad The prioridad
     */
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public Partido withPrioridad(String prioridad) {
        this.prioridad = prioridad;
        return this;
    }

}