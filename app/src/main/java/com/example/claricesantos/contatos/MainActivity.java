package com.example.claricesantos.contatos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout linearLayout;
    int count = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.telLinearLayout);

    }

    public void addTel(View view) {

        count++;

        EditText editTextTel = new EditText(this);
        editTextTel.setHint("Telefone " + count);
        editTextTel.setLayoutParams(new LinearLayout.
                LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT));

        linearLayout.addView(editTextTel);

    }
}
