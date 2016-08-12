package uas2016.develops.nim11113107.suitmediatest;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Event extends AppCompatActivity {
    public static String nama="Name";

    ListView list;

    String[] Namas = {
            "Andi",
            "Budi",
            "Charlie",
            "Dede",
            "Joko"

    };
    String[] Tanggals={
            "2014-01-01",
            "2014-02-02",
            "2014-03-03",
            "2014-06-06",
            "2014-02-12"
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        //ge data
        Intent intent=getIntent();
        String nameValue=intent.getStringExtra(nama);
        nama=nameValue;



        listAdapter adapter = new listAdapter(this, Namas, Tanggals);
        list = (ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);


        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Pilihitem = Namas[+position];
                String tanggalPilihan=Tanggals[+position];
                //String tanggal=tanggalPilihan.substring(0,2);
                String tanggal=tanggalPilihan.substring(tanggalPilihan.length()-2);
                int tanggalPilih=Integer.parseInt(tanggal);
                //Toast.makeText(getApplicationContext(), tanggal, Toast.LENGTH_SHORT).show();
                if(tanggalPilih%3==0 && tanggalPilih%2==0){
                    Toast.makeText(getApplicationContext(), "IOS", Toast.LENGTH_SHORT).show();
                }else if(tanggalPilih%3==0){
                    Toast.makeText(getApplicationContext(), "Android", Toast.LENGTH_SHORT).show();
                }else if(tanggalPilih%2==0) {
                    Toast.makeText(getApplicationContext(), "BlackBerry", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(getApplicationContext(), "No Specification Maybe your phone Jadulll", Toast.LENGTH_SHORT).show();
                }
                Intent intent=new Intent(getApplicationContext(),Main.class);
                intent.putExtra(Main.event, Pilihitem);
                intent.putExtra(Main.nama,nama);
                intent.putExtra(Main.guest,"Guest");
                startActivity(intent);

            }
        });
    }
}
