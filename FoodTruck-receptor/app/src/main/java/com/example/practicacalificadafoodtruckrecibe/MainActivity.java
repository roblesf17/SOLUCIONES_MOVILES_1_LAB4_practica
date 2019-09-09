package com.example.practicacalificadafoodtruckrecibe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView mensajes_recibido ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //OBTENEMOS EL INTENT, LA ACCION Y EL TIPO MIME
        Intent intent = getIntent();
        String action = intent.getAction();
        String type = intent.getType();

        if(Intent.ACTION_SEND.equals(action) && type != null)
        {
            if("text/plain".equals(type))
            {
                //manipulamos la cadena enviada
                manipularTexto(intent);
            }
        }
    }

    public void manipularTexto(Intent intent)
    {
        String shareText = intent.getStringExtra(Intent.EXTRA_TEXT);
        if(shareText != null)
        {
            Toast.makeText(MainActivity.this,shareText,Toast.LENGTH_LONG).show();

            mensajes_recibido = (TextView) findViewById(R.id.txt_texto1);
            mensajes_recibido.setText(shareText);

        }
    }
}
