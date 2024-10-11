package com.example.api_ibge;

import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.Call;

public interface IbgeService {

    @GET("localidades/estados")
    public Call<List<Estado>> getEstados();

    @GET("localidades/estados/{estadoId}/municipios")
    public Call<List<Municipio>> getMunicipios(@Path("estadoId") int estadoId);

}
