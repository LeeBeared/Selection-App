package com.example.pokem.barrineau_exam3;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class PersistentActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persistent);

        Button calcBtn = (Button)findViewById(R.id.calculateBtn);
      final  Spinner spinnerChoice = (Spinner)findViewById(R.id.choiceSpinner);
       final EditText productAmount = (EditText)findViewById(R.id.purchaseAmount);
        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        Toast.makeText(PersistentActivity.this,spinnerChoice.getSelectedItem().toString(),Toast.LENGTH_LONG).show();

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    try {
                        int amountPurchase = Integer.parseInt(productAmount.getText().toString());
                        SharedPreferences.Editor sharedEditor = sharedPref.edit();

                        String userChoice = spinnerChoice.getSelectedItem().toString();


                        sharedEditor.putString("key1",userChoice);
                        sharedEditor.putInt("key2",amountPurchase);
                        sharedEditor.commit();


                        startActivity(new Intent(PersistentActivity.this,TotalActivity.class));


                    }catch (NumberFormatException e)
                    {Toast.makeText(PersistentActivity.this,"Please only type number in the purchase field",Toast.LENGTH_LONG).show();}

                }

        });
    }
}
