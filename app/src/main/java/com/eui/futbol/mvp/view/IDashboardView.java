package com.eui.futbol.mvp.view;

import com.eui.futbol.mvp.model.Partido;
import com.eui.futbol.mvp.presenter.DashboardPresenter;

/**
 * Created by lfmingo on 10/03/15.
 */
public interface IDashboardView {
    public void load_Partidos();

    void refreshUI(Partido partido);
}
