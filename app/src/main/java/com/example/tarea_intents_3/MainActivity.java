package com.example.tarea_intents_3;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;  // Import necesario para manejar el botón

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // encontrar el botón por su ID (button) y asignarle un listener para capturar el clic
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            // sobreescribir el metodo al hacer click en el boton (onClick)
            public void onClick(View v) {
                // crear un intent explícito que inicia la segunda actividad
                Intent intent = new Intent(MainActivity.this, Actividad2.class);
                // definir la actividad actual y la actividad de destino
                startActivity(intent);  // iniciar la actividad
            }
        });
    }
}
