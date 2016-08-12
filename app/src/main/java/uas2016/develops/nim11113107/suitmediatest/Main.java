package uas2016.develops.nim11113107.suitmediatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    public static  String nama="Nama";
    public static final String event="Event";
    public static final String guest="Guest";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=getIntent();
        String nameValue=intent.getStringExtra(nama);
        TextView name=(TextView)findViewById(R.id.name);
        name.setText("Nama       :" + nameValue);
        nama=nameValue;
        //event
        String eventValue=intent.getStringExtra(event);
        Button event=(Button) findViewById(R.id.event);
        event.setText(eventValue);

        //guest
        String guestValue=intent.getStringExtra(guest);
        Button guest=(Button) findViewById(R.id.guest);
        guest.setText(guestValue);
    }

    public void  Event(View view){
        Intent intent=new Intent(this,Event.class);
        intent.putExtra(Event.nama,nama);
        startActivity(intent);
    }

    public void  Guest(View view){
        Intent intent=new Intent(this,Guest.class);
        intent.putExtra(Guest.nama,nama);
        startActivity(intent);
    }
}
