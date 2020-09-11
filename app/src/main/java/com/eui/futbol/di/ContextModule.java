package com.eui.futbol.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;

@Module(
        library = true
)
public class ContextModule {

    private Context appContext;

    public ContextModule(Context appContext) {
        this.appContext = appContext;
    }

    @Provides
    public Context provideAppContext() {
        return appContext;
    }
}