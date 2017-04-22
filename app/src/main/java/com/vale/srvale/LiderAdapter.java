package com.vale.srvale;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by iago_ on 21/04/2017.
 */

public class LiderAdapter extends ArrayAdapter  {

    private List list = new ArrayList();

    public LiderAdapter(Context context, int resource) {
        super(context, resource);
    }

    public void add(LiderClass object) {
        list.add(object);
        super.add(object);
    }
    static class ImgHolder{
        ImageView IMG;
        TextView NAME;
        TextView RAMAL;
    }
    @Override
    public int getCount() {
        return this.list.size();
    }

    @Nullable
    @Override
    public Object getItem(int position) {
        return this.list.get(position);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ImgHolder holder;
        if(convertView == null) {
            LayoutInflater inflater = (LayoutInflater) this.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = inflater.inflate(R.layout.raw_layout, parent, false);
            holder = new ImgHolder();
            holder.IMG = (ImageView) row.findViewById(R.id.imageView3);
            holder.NAME = (TextView) row.findViewById(R.id.textView10);
            holder.RAMAL = (TextView) row.findViewById(R.id.textView4);
            row.setTag(holder);
        }else{
            holder = (ImgHolder) row.getTag();
        }
        LiderClass LC = (LiderClass) getItem(position);
        holder.IMG.setImageResource(LC.getLiderResource());
        holder.NAME.setText(LC.getLiderName());
        holder.RAMAL.setText(LC.getLiderRamal());

        return row;
    }
}
