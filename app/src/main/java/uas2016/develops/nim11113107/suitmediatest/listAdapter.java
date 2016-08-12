package uas2016.develops.nim11113107.suitmediatest;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Hita Do on 03/08/2016.
 */
public class listAdapter extends ArrayAdapter<String>{

    private final AppCompatActivity context;
    private final String[] Nama;
    private final String[] Tanggal;

    public listAdapter(AppCompatActivity context, String[] Namas, String[] Tanggals) {
        super(context, R.layout.listview, Namas);
        this.context=context;
        this.Nama=Namas;
        this.Tanggal=Tanggals;
    }

    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.listview, null,true);

        TextView nama = (TextView) rowView.findViewById(R.id.nama);
        TextView tanggal=(TextView) rowView.findViewById(R.id.tanggal);
        ImageView imageView = (ImageView) rowView.findViewById(R.id.logo);


        nama.setText(Nama[position]);
        tanggal.setText(Tanggal[position]);
        imageView.setImageResource(R.drawable.images);

        return rowView;

    };
}
