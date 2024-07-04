package org.example.Facade.subsistema;

public class CepApi {

    private static CepApi instancia = new CepApi();

    private CepApi(){
        super();
    }

    public static  CepApi getInstance(){
        return instancia;
    }

    public String recuperarCidade(String cep){
        return "Jacarei";
    }

    public String recuperarEstado(String cep){
        return "SP";
    }

}
