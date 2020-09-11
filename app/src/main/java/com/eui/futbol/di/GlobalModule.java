package com.eui.futbol.di;

import com.eui.futbol.ApplicationClass;
import com.eui.futbol.Dashboard;
import com.eui.futbol.mvp.presenter.DashboardPresenter;
import dagger.Module;

@Module(
        injects = { ApplicationClass.class,
                    Dashboard.class,
                    DashboardPresenter.class},
        library = true,
        complete = false
)
public class GlobalModule {
}
