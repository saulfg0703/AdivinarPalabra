package com.example.adivinarpalabra;

import android.content.DialogInterface;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.adivinarpalabra.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String palabra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        palabra = findViewById(R.id.palabraAdivinar).toString();
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
    }

    public void validarPalabra(View vista) {
        createSimpleDialog();
    }
    public void createSimpleDialog(){
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Comprobacion");
        builder.setMessage("Palabra correcta");
        builder.setPositiveButton("Validar", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                if (palabra.equals("pantalla")) {
                    Toast.makeText(MainActivity.this,"ACEPTAR", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this,"CANCELAR", Toast.LENGTH_SHORT).show();
                }
            }
        }).setNegativeButton("CANCELAR", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.dismiss();
            }
        });


        builder.show();
    }
}