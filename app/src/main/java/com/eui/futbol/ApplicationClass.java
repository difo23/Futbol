package com.eui.futbol;

import android.app.Application;
import com.eui.futbol.di.ContextModule;
import com.eui.futbol.di.GlobalModule;
import com.eui.futbol.rest.RestClient;
import dagger.ObjectGraph;

import java.util.Arrays;
import java.util.List;

public class ApplicationClass extends Application {
 
    private ObjectGraph objectGraph;
 
    @Override
    public void onCreate() {
        super.onCreate();
        objectGraph = ObjectGraph.create(getModules().toArray());
        objectGraph.inject(this);
    }
 
    protected List<Object> getModules() {
        return Arrays.asList(
                new GlobalModule(),
                new ContextModule(this),
                new RestClient()
        );
    }
 
    public void inject(Object className) {
        objectGraph.inject(className);
    }
}