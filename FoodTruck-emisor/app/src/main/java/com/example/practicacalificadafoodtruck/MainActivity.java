package com.example.practicacalificadafoodtruck;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView edt_msj;
        Button btn_enviar;

        edt_msj = (TextView)findViewById(R.id.edt_msj);
        btn_enviar = (Button)findViewById(R.id.btn_enviar);

        btn_enviar.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void  onClick(View view)
            {
                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT,edt_msj.getText().toString());
                sendIntent.setType("text/plain");

                //if(null != sendIntent.resolveActivity(getPackageManager()))
                if(null != sendIntent.resolveActivity(getPackageManager()))
                {
                    startActivity(Intent.createChooser(sendIntent,getResources().getText(R.string.send_to)));
                }

            }
        });

    }

    //CODIGO PARA CHECKBOX
   public static String texto_txt = "" ;
    public static String texto_1 = "\n" ;

    public void onClicComida_1 (View v)
    {
        CheckBox check_obj_1 = (CheckBox) findViewById(R.id.comida1);

        if (check_obj_1.isChecked())
        {
            //String texto_1 = check_obj_1.getText().toString();
             texto_1 = texto_1 +  "- Estofado de Pollo -" + "\n";

        }
        else
        {
            //texto_1 = texto_1.replace( "\n" , "");
             texto_1 = texto_1.replace( "\n- Estofado de Pollo -" , "");
            //texto_1 = texto_1 + "\n";
        }

        Toast.makeText(MainActivity.this,"Comida Agregada",Toast.LENGTH_SHORT).show();

        TextView edittext_obj ;
        edittext_obj = (TextView) findViewById(R.id.edt_msj);
        edittext_obj.setText(texto_1);

    }

    public void onClicComida_2 (View v)
    {
        CheckBox check_obj_1 = (CheckBox) findViewById(R.id.comida2);

        if (check_obj_1.isChecked())
        {
            //String texto_1 = check_obj_1.getText().toString();
            texto_1 = texto_1 + "- Seco de pollo -" + "\n";

        }
        else
        {
            //texto_1 = texto_1.replace( "\n" , "");
            texto_1 = texto_1.replace( "\n- Seco de pollo -" , "");
            //texto_1 = texto_1 + "\n";
        }

        Toast.makeText(MainActivity.this,"Comida Agregada",Toast.LENGTH_SHORT).show();

        TextView edittext_obj ;
        edittext_obj = (TextView) findViewById(R.id.edt_msj);
        edittext_obj.setText(texto_1);

    }

    public void onClicComida_3 (View v)
    {
        CheckBox check_obj_1 = (CheckBox) findViewById(R.id.comida3);

        if (check_obj_1.isChecked())
        {
            //String texto_1 = check_obj_1.getText().toString();
            texto_1 = texto_1 + "- Adobo de Chancho -" + "\n";

        }
        else
        {   //texto_1 = texto_1.replace( "\n" , "");
            texto_1 = texto_1.replace( "\n- Adobo de Chancho -" , "");
            //texto_1 = texto_1 + "\n";
        }

        Toast.makeText(MainActivity.this,"Comida Agregada",Toast.LENGTH_SHORT).show();

        TextView edittext_obj ;
        edittext_obj = (TextView) findViewById(R.id.edt_msj);
        edittext_obj.setText(texto_1);
    }

    public void onClicComida_4 (View v)
    {
        CheckBox check_obj_1 = (CheckBox) findViewById(R.id.comida4);

        if (check_obj_1.isChecked())
        {
            //String texto_1 = check_obj_1.getText().toString();
            texto_1 = texto_1 + "- Chuleta de Res -" + "\n";

        }
        else
        {
            //texto_1 = texto_1.replace( "\n" , "");
            texto_1 = texto_1.replace( "\n- Chuleta de Res -" , "");
            //texto_1 = texto_1 + "\n";
        }

        Toast.makeText(MainActivity.this,"Comida Agregada",Toast.LENGTH_SHORT).show();

        TextView edittext_obj ;
        edittext_obj = (TextView) findViewById(R.id.edt_msj);
        edittext_obj.setText(texto_1);

    }

    public void onClicComida_5 (View v)
    {
        CheckBox check_obj_1 = (CheckBox) findViewById(R.id.comida5);

        if (check_obj_1.isChecked())
        {
            //String texto_1 = check_obj_1.getText().toString();
            texto_1 = texto_1 + "- Aji de Gallina -" + "\n";

        }
        else
        {
            //texto_1 = texto_1.replace( "\n" , "");
            texto_1 = texto_1.replace( "\n- Aji de Gallina -" , "");
            //texto_1 = texto_1 + "\n";
        }

        Toast.makeText(MainActivity.this,"Comida Agregada",Toast.LENGTH_SHORT).show();

        TextView edittext_obj ;
        edittext_obj = (TextView) findViewById(R.id.edt_msj);
        edittext_obj.setText(texto_1);

    }

    public void onClicComida_6 (View v)
    {
        CheckBox check_obj_1 = (CheckBox) findViewById(R.id.comida6);

        if (check_obj_1.isChecked())
        {
            //String texto_1 = check_obj_1.getText().toString();
            texto_1 = texto_1 + "- Picante a la Tacneña -" + "\n";

        }
        else
        {
            //texto_1 = texto_1.replace( "\n" , "");
            texto_1 = texto_1.replace( "\n- Picante a la Tacneña -" , "");
            //texto_1 = texto_1 + "\n";
        }

        Toast.makeText(MainActivity.this,"Comida Agregada",Toast.LENGTH_SHORT).show();

        TextView edittext_obj ;
        edittext_obj = (TextView) findViewById(R.id.edt_msj);
        edittext_obj.setText(texto_1);

    }
}
