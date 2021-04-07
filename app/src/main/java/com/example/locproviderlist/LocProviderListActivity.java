package com.example.locproviderlist;

import androidx.appcompat.app.AppCompatActivity;

import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class LocProviderListActivity extends AppCompatActivity{
    TextView mTextView;
    LocationManager locMgr;
    List<String> locProviders;
    Button mbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = findViewById(R.id.txtOutput);
        mbutton = findViewById(R.id.button);
        mbutton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {

                locMgr = (LocationManager) getSystemService(LOCATION_SERVICE);
                locProviders = locMgr.getAllProviders();


                for (String s: locProviders) {

                    s += ("Loc. Provider : " + locProviders + "\n"
                            + "Status : " + locMgr.isProviderEnabled(locProviders + "\n\n"));
                    mTextView.setText(s);
                }

            }

        });
        }
    }


