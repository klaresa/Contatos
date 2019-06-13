package com.example.claricesantos.contatos;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

public class ListActivity extends AppCompatActivity {

    TextView name;
    TextView tel;
    LinearLayout rootLinearLayout;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        rootLinearLayout = findViewById(R.id.rootLinear);

        intent = getIntent();
        Bundle bundle = intent.getExtras();

        String name, tel;

        name = (String) bundle.get(MainActivity.NAME_MSG);
        tel = (String) bundle.get(MainActivity.TEL_MSG);

//        <LinearLayout
//        android:id="@+id/contactLinearLayout"
//        android:layout_width="match_parent"
//        android:layout_height="wrap_content"
//        android:orientation="horizontal">

        // isso aqui sao as linhas de cima
        LinearLayout horizontalLinearLayout = new LinearLayout(this);
        horizontalLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        horizontalLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

////        <TextView
////        android:layout_width="wrap_content"
////        android:layout_height="wrap_content">

        // isso aqui sao as linhas de cima
        TextView nameTextView = new TextView(this);
        nameTextView.setLayoutParams(
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        horizontalLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        nameTextView.setText(name);

        TextView telTextView = new TextView(this);
        nameTextView.setLayoutParams(
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT));
        horizontalLinearLayout.setOrientation(LinearLayout.HORIZONTAL);

        telTextView.setText(tel);
        telTextView.setGravity(Gravity.RIGHT);

        horizontalLinearLayout.addView(nameTextView);
        horizontalLinearLayout.addView(telTextView);

        rootLinearLayout.addView(horizontalLinearLayout);

        View divider = new View(this);
        divider.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 1));
        divider.setBackgroundColor(Color.BLACK);

        rootLinearLayout.addView(divider);

    }
}
