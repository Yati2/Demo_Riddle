package sg.edu.rp.c346.id20028056.demo_riddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnReveal_Q1;
    Button btnReveal_Q2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnReveal_Q1=findViewById(R.id.btnReveal_Q1);
        btnReveal_Q2=findViewById(R.id.btnReveal_Q2);

        btnReveal_Q1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AnswerActivity1.class);
                intent.putExtra("Question","Q1");
                startActivity(intent);
            }
        });

        btnReveal_Q2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,AnswerActivity2.class);
                intent.putExtra("Question","Q2");
                startActivity(intent);
            }
        });
    }
}