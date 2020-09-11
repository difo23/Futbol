package com.eui.futbol.rest;

import com.eui.futbol.ApplicationClass;
import com.eui.futbol.Dashboard;
import com.eui.futbol.mvp.presenter.DashboardPresenter;
import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

import javax.inject.Singleton;

/**
 * Created by lfmingo on 10/03/15.
 */
@Module (
        library = true
)
public class RestClient {

    private static RestClient restClient;
    public static MarcadoresInterface marcadoresInterface;

    public RestClient() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint("http://www.marcadoresonline.com")
                .build();

        marcadoresInterface = restAdapter.create(MarcadoresInterface.class);
    }

    @Provides
    @Singleton
    public  MarcadoresInterface getInstance() {
        if (restClient == null)
            restClient = new RestClient();
        return marcadoresInterface;
    }



}
