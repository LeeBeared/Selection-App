package com.example.pokem.barrineau_exam3;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.text.DecimalFormat;

public class TotalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);

        ImageView productImg = (ImageView)findViewById(R.id.imgChoice);
        TextView totalText = (TextView)findViewById(R.id.textTotal);

        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);

        String choiceProduct = sharedPref.getString("key1","NONE");
        int choiceAmount = sharedPref.getInt("key2",999999999);
        double choicePrice = 0;

        DecimalFormat currency = new DecimalFormat("$###,###,###.##");

        if(choiceProduct =="NONE"||choiceAmount==999999999){
            totalText.setText("There was an error please go back one page\nProudct: "+choiceProduct+"\nAmount: "+choiceAmount);
        }

        else{
            if(choiceProduct.equals("mild")){productImg.setImageResource(R.drawable.mild);choicePrice=29.95;}
            else if(choiceProduct.equals("medium")){productImg.setImageResource(R.drawable.medium);choicePrice=39.95;}
            else if(choiceProduct.equals("hot")){productImg.setImageResource(R.drawable.hot);choicePrice=49.95;}

         totalText.setText("You purchased: "+choiceAmount+" "+choiceProduct+"\n\n\nYour cost is: "+currency.format(choiceAmount*choicePrice));
        }
    }
}
