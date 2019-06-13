package com.example.claricesantos.contatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String NAME_MSG = "name";
    public static final String TEL_MSG = "tel";

    LinearLayout linearLayout;
    int count = 1;

    EditText nameEditText;
    EditText telEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        linearLayout = findViewById(R.id.telLinearLayout);
        nameEditText = findViewById(R.id.nameEditText);
        telEditText = findViewById(R.id.telEditText);
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

    public void saveContact(View view) {

        String name, tel;
        name = nameEditText.getText().toString();
        tel =  telEditText.getText().toString();

        // criando a intent
        Intent intent = new Intent(this, ListActivity.class);

        intent.putExtra(NAME_MSG, name);
        intent.putExtra(TEL_MSG, tel);

        // iniciando activity_list
        startActivity(intent);

        nameEditText.setText("");
        telEditText.setText("");
    }
}
