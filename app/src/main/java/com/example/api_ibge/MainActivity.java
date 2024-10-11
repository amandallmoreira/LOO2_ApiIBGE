package com.example.api_ibge;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView autoCompleteEstados; //Campo para digitar e sugerir estados
    private AutoCompleteTextView autoCompleteMunicipios; //Campo para digitar e sugerir municipios
    private Button btnMostrar; //Botao que exibe o estado e municipio selecionados
    private Retrofit retrofit; //Objeto retrofit para realizar requisições HTTP
    private IbgeService ibgeService; //Interface da API para buscar estados e municipios

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        autoCompleteEstados = findViewById(R.id.autoCompleteEstado);
        autoCompleteMunicipios = findViewById(R.id.autoCompleteMunicipio);
        btnMostrar = findViewById(R.id.btnMostrar);
        retrofit = new Retrofit.Builder()
                .baseUrl("https://servicodados.ibge.gov.br/api/v1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        ibgeService = retrofit.create(IbgeService.class);

        //carregarEstados();

    }//fim onCreate


}//fim class