package com.myappneelclub;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AlertDialogActivity extends AppCompatActivity {

    Button btnAlert,btnDialog,btnCustomToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_dialog);
        btnAlert = findViewById(R.id.btn_alertDialog);
        btnDialog = findViewById(R.id.btn_Dialog);
        btnCustomToast = findViewById(R.id.btn_toast);
        btnCustomToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater layoutInflater = getLayoutInflater();
                View myView = layoutInflater.inflate(R.layout.raw_toast,null);

                Toast.makeText(AlertDialogActivity.this, "Add", Toast.LENGTH_SHORT).show();

                Toast toast = new Toast(AlertDialogActivity.this);
                toast.setView(myView);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.show();

            }
        });

        btnDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                LayoutInflater layoutInflater = getLayoutInflater();
                View myview = layoutInflater.inflate(R.layout.raw_dialog,null);

                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
                builder.setView(myview);
                builder.show();



            }
        });


        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                AlertDialog.Builder builder = new AlertDialog.Builder(AlertDialogActivity.this);
                builder.setIcon(R.drawable.home);
                builder.setTitle("MyAppNeel");
                builder.setMessage("Are you sure, you want to delete this file");
                builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Toast.makeText(AlertDialogActivity.this, "Yes is clicked",
                                        Toast.LENGTH_SHORT).show();

                            }
                        }
                );
                builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(AlertDialogActivity.this, "No is clicked", Toast.LENGTH_SHORT).show();
                    }
                });
                builder.setNeutralButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                builder.show();

            }
        });


    }
}