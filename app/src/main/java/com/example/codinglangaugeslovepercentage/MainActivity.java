package com.example.codinglangaugeslovepercentage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationBarView;

import java.text.BreakIterator;
import java.util.Random;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    String line = "name\t\tlanguage\t\tscore\n";
    ImageView img;
    Random rand;
    private BreakIterator number;
    TextView txt;
    Button btn;
    String text;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner= findViewById(R.id.languageSpinner);
        ArrayAdapter <CharSequence> adapter=ArrayAdapter.createFromResource(this, R.array.languages, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(R.layout.spinner_text);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
        txt= findViewById(R.id.percentage);
        btn=findViewById(R.id.button);



        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random random=new Random();
                int val= random.nextInt(101);
                txt.setText(Integer.toString(val)+"%");
                EditText name = findViewById(R.id.username);
                TextView final_table = findViewById(R.id.table);
                if (text.equals("Choose language")){
                    //do nothing
                    img.setVisibility(View.GONE);
                }else {


                    if (text.equals("java")) {
                        if (img != null) {
                            img.setVisibility(View.GONE);
                        }
                        img = findViewById(R.id.java);
                        img.setAlpha(0f);
                        img.setVisibility(View.VISIBLE);
                        img.animate().alpha(1f).setDuration(2000).setListener(null);
                        rand = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+txt.getText().toString()+"\n";
                        final_table.setText(line);

                    } else if (text.equals("c++")) {
                        if (img != null) {
                            img.setVisibility(View.GONE);
                        }
                        img = findViewById(R.id.cplusplus);
                        img.setAlpha(0f);
                        img.setVisibility(View.VISIBLE);
                        img.animate().alpha(1f).setDuration(2000).setListener(null);
                        rand = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+txt.getText().toString()+"\n";
                        final_table.setText(line);


                    } else if (text.equals("c#")) {
                        if (img != null) {
                            img.setVisibility(View.GONE);
                        }
                        img = findViewById(R.id.csharp);
                        img.setAlpha(0f);
                        img.setVisibility(View.VISIBLE);
                        img.animate().alpha(1f).setDuration(2000).setListener(null);
                        rand = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+txt.getText().toString()+"\n";
                        final_table.setText(line);

                    } else if (text.equals("c")) {
                        if (img != null) {
                            img.setVisibility(View.GONE);
                        }
                        img = findViewById(R.id.c);
                        img.setAlpha(0f);
                        img.setVisibility(View.VISIBLE);
                        img.animate().alpha(1f).setDuration(2000).setListener(null);
                        rand = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+txt.getText().toString()+"\n";
                        final_table.setText(line);


                    } else if (text.equals("js")) {
                        if (img != null) {
                            img.setVisibility(View.GONE);
                        }
                        img = findViewById(R.id.js);
                        img.setAlpha(0f);
                        img.setVisibility(View.VISIBLE);
                        img.animate().alpha(1f).setDuration(2000).setListener(null);
                        rand = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+txt.getText().toString()+"\n";
                        final_table.setText(line);


                    } else if (text.equals("php")) {
                        if (img != null) {
                            img.setVisibility(View.GONE);
                        }
                        img = findViewById(R.id.php);
                        img.setAlpha(0f);
                        img.setVisibility(View.VISIBLE);
                        img.animate().alpha(1f).setDuration(2000).setListener(null);
                        rand = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+txt.getText().toString()+"\n";
                        final_table.setText(line);


                    } else if (text.equals("python")) {
                        if (img != null) {
                            img.setVisibility(View.GONE);
                        }
                        img = findViewById(R.id.python);
                        img.setAlpha(0f);
                        img.setVisibility(View.VISIBLE);
                        img.animate().alpha(1f).setDuration(2000).setListener(null);
                        rand = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+txt.getText().toString()+"\n";
                        final_table.setText(line);


                    } else if (text.equals("ruby")) {
                        if (img != null) {
                            img.setVisibility(View.GONE);
                        }
                        img = findViewById(R.id.ruby);
                        img.setAlpha(0f);
                        img.setVisibility(View.VISIBLE);
                        img.animate().alpha(1f).setDuration(2000).setListener(null);
                        rand = null;
                        line+= name.getText().toString()+"\t\t\t\t"+text+"\t\t\t\t\t\t\t\t\t\t"+txt.getText().toString()+"\n";
                        final_table.setText(line);


                    }

                }









            }
        });


    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long l) {
        text=parent.getItemAtPosition(position).toString();

        Toast.makeText(parent.getContext(), text, Toast.LENGTH_LONG).show();






    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {


    }


}