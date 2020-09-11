package com.eui.futbol;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.*;
import com.eui.futbol.adapters.MiSimpleAdapter;
import com.eui.futbol.mvp.model.Partido;
import com.eui.futbol.mvp.presenter.DashboardPresenter;
import com.eui.futbol.mvp.view.IDashboardView;
import com.eui.futbol.mvp.view.InjectedActivity;
import com.squareup.picasso.Picasso;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

public class Dashboard extends InjectedActivity implements IDashboardView {

    private List<HashMap<String, String>> datos = new ArrayList<HashMap<String, String>>();
    private SimpleAdapter adapter;

    @Inject
    DashboardPresenter presenter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        presenter.setView(this);

        adapter = new MiSimpleAdapter(this,
                                    datos,
                                    R.layout.row,
                                    new String[] {"local", "imagen_local", "visitante", "imagen_visitante", "goles_visitante", "goles_local"},
                                    new int[] {R.id.local, R.id.imagen_local, R.id.visitante, R.id.imagen_visitante, R.id.goles_visitante, R.id.goles_local});
        ((ListView)findViewById(R.id.mi_lista_partido)).setAdapter(adapter);

        load_Partidos();
    }
/// "http://www.marcadoresonline.com//enetpulse/includes/imagen.php?tipo=logo&equipo="+o.getString("id_eHome")10205

    private ProgressDialog pd;

    @Override
    public void load_Partidos() {
        refreshHeader = 0;
        datos.clear();
        pd =  ProgressDialog.show(this, "Loading...","Connecting to server.", true);
        presenter.loadPartidos();
    }

    @Override
    public void refreshUI(com.eui.futbol.mvp.model.Partido partido) {
        if (partido != null) {
            HashMap<String, String> hm = partido.toHashMap(); //new HashMap<String, String>();
            datos.add(hm);

            refreshlHeader(partido);
        } else {
            refreshHeader = 0;
            Toast.makeText(this, "Error conexion datos", Toast.LENGTH_SHORT).show();
        }
        adapter.notifyDataSetChanged();
        pd.dismiss();

    }

    private int refreshHeader = 0;
    private void refreshlHeader(Partido partido) {
        if (refreshHeader == 0) {
            Picasso.with(this)
                    .load("http://medias.marcadores.com/logos/icons/league-64/" + partido.getLigaCode() + ".png")
                    .into((ImageView) findViewById(R.id.ligaCode));
            ((TextView) findViewById(R.id.ligaCode_name)).setText(partido.getLigaCode_name());


            StringBuffer country = new StringBuffer(partido.getCountry());
            if (country.indexOf("-") != -1) {
                // TODO: poner 1a letra despues de _
                // en mayusculas

            }
            country.setCharAt(0, country.substring(0, 1).toUpperCase().charAt(0));
            Log.e("...", country.toString());

            ((TextView) findViewById(R.id.country_name)).setText(country.toString().replaceAll("-", " "));
            Picasso.with(this)
                    .load("http://country-flags.net/medium/" + country + ".png")
                            //.load("http://img.freeflagicons.com/thumb/football_icon/"+partido.getCountry()+"/"+partido.getCountry()+"_640.png")
                    .into(((ImageView) findViewById(R.id.country)));
            refreshHeader = 1;
        }
    }

    public void loadData(View view) {
        this.load_Partidos();
    }
}
