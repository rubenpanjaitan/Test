package uas2016.develops.nim11113107.suitmediatest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void  onLogin(View view){
        EditText nameValue=(EditText)findViewById(R.id.name);
        String name=nameValue.getText().toString();

        Intent intent=new Intent(this,Main.class);
        intent.putExtra(Main.nama, name);
        intent.putExtra(Main.event,"Event");
        intent.putExtra(Main.guest,"Guest");
        startActivity(intent);
    }

}
