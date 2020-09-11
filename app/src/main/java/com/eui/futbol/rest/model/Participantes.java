package com.eui.futbol.rest.model;

//import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class Participantes {

    @SerializedName("2")
    @Expose
    private String _2;
    @SerializedName("1")
    @Expose
    private String _1;

    /**
     * @return The _2
     */
    public String get2() {
        return _2;
    }

    /**
     * @param _2 The 2
     */
    public void set2(String _2) {
        this._2 = _2;
    }

    public Participantes with2(String _2) {
        this._2 = _2;
        return this;
    }

    /**
     * @return The _1
     */
    public String get1() {
        return _1;
    }

    /**
     * @param _1 The 1
     */
    public void set1(String _1) {
        this._1 = _1;
    }

    public Participantes with1(String _1) {
        this._1 = _1;
        return this;
    }

}

