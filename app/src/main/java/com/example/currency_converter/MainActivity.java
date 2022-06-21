package com.example.currency_converter;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Spinner sp1,sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        ed1 = findViewById(R.id.txtamount);
        b1 = findViewById(R.id.btn1);


        String[] from = {"USD",};
        ArrayAdapter ad = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,from);
        sp1.setAdapter(ad);


        String[] to = {"INR","Yuan","Yen","Srilankan Rupees"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,to);
        sp2.setAdapter(ad1);




        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;

                Double amt = Double.parseDouble(ed1.getText().toString());

                if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "INR")
                {
                    tot = amt * 78.4;
                    Toast.makeText(getApplicationContext(),"1 USD = 78.4 INR",Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"Total Amount = " + tot.toString()+" INR",Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Yuan")
                {
                    tot = amt * 6.69;
                    Toast.makeText(getApplicationContext(),"1 USD = 6.69 Yuan",Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"Total Amount = "+ tot.toString()+" Yuan",Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Yen")
                {
                    tot = amt * 135.11;
                    Toast.makeText(getApplicationContext(),"1 USD = 135.11 Yen",Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"Total Amount = "+ tot.toString()+" Yen",Toast.LENGTH_LONG).show();
                }
                else if(sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Srilankan Rupees")
                {
                    tot = amt * 356.98;
                    Toast.makeText(getApplicationContext(),"1 USD = 356.98 Srilankan Rupees",Toast.LENGTH_LONG).show();
                    Toast.makeText(getApplicationContext(),"Total Amount =  "+tot.toString()+" Srilankan rupees",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}