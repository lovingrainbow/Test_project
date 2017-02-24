package com.example.quietus.arrayadapter_customize;

import android.content.Context;
import android.widget.ArrayAdapter;

/**
 * Created by Quietus on 2017/2/19.
 */

public class MyAdapter extends  ArrayAdapter<String>{
    public MyAdapter(Context context, int resource, String[] objects) {
        super(context, resource, objects);
    }
}
