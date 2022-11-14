package com.example.lotto;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Generuj(View view){
        TextView textView=(TextView)findViewById(R.id.textView);
        ArrayList<Integer> lista=new ArrayList<Integer>();
        for(int i=1; i<=49; i++){
            lista.add(i);
        }
        Collections.shuffle(lista);
        ArrayList<Integer> wybrane=new ArrayList<Integer>();
        for(int i=0; i<6; i++){
            wybrane.add(lista.get(i));
        }
        Collections.sort(wybrane);
        String l=wybrane.get(0).toString()+", "+wybrane.get(1).toString()+", "+wybrane.get(2).toString()+", "+wybrane.get(3).toString()+", "+wybrane.get(4).toString()+", "+wybrane.get(5).toString();
        textView.setText(l);
    }
}