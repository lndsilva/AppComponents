package br.com.etecia.myapp;

public class Explore {
    private String nome;
    private String latitude;
    private String logitude;

    public Explore(String nome, String latitude, String logitude) {
        this.nome = nome;
        this.latitude = latitude;
        this.logitude = logitude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLogitude() {
        return logitude;
    }

    public void setLogitude(String logitude) {
        this.logitude = logitude;
    }
}
