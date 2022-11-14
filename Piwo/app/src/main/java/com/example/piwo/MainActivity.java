package com.example.piwo;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickFindBeer(View myView){
        TextView beerText = (TextView) findViewById(R.id.finalText);
        Spinner spinner = (Spinner) findViewById(R.id.beerTypesSpinner);
        String beerType = spinner.getSelectedItem().toString();
        beerText.setText(beerType);
    }
}