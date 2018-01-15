package com.example.student.dominikagaborkolokwium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //stworzenie ButterKnifa
        ButterKnife.bind(this);
    }


    // stworzenie obsługi widoku po przyciśnięciu w przycisk "Wybierz lek"
    @OnClick(R.id.wybierzlek)
    void OnClick()
    {
        Intent intent = new Intent(this, Main2Activity.class);
        startActivity(intent);
    }
}
