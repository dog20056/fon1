package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bgButton;
    private ConstraintLayout constraintLayout;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bgButton = findViewById(R.id.button_fon);
        constraintLayout = findViewById(R.id.constraintLayout);
        context = MainActivity.this;
        bgButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);

        final CharSequence[] items = {getText(R.string.red),
                getText(R.string.yellow), getText(R.string.green), getText(R.string.purple)
        };

        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which) {
                    case 0:
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.redColor);
                        break;
                    case 1:
                        Toast.makeText(context, R.string.yellow, Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.yellowColor);
                        break;
                    case 2:
                        Toast.makeText(context, R.string.green, Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.greenColor);
                        break;
                    case 3:
                        Toast.makeText(context, R.string.red, Toast.LENGTH_LONG).show();
                        constraintLayout.setBackgroundResource(R.color.purpleColor);
                        break;
                }
            }
        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
