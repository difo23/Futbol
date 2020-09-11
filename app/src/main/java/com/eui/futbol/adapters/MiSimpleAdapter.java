package com.eui.futbol.adapters;

import android.content.Context;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import com.eui.futbol.Dashboard;
import com.eui.futbol.R;
import com.eui.futbol.utils.CircleTransform;
import com.squareup.picasso.Picasso;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lfmingo on 11/03/15.
 */
public class MiSimpleAdapter extends SimpleAdapter {

    private Context context;

    public MiSimpleAdapter(Context context, List<? extends Map<String, ?>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
        this.context = context;
    }

    @Override
    public void setViewImage(ImageView v, String value) {
        //super.setViewImage(v, value);
        Picasso.with(context)
                .load(value)
                .resize(50, 50)
                .into(v);
    }
}
