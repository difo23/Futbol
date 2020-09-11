package com.eui.futbol.rest;


import com.eui.futbol.rest.model.Partido;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

import java.util.List;

public interface MarcadoresInterface {

    @GET("/widgets/includes/obtenerPartidosWidget.php")
    Observable<List<Partido>> getPartidos(@Query("nombreLiga") int nombre_liga);

}