package com.example.testedgame;

public class Personaje {
    private String nombre;
    private int vidas;
    private int puntos;

    public Personaje(String nombre, int vidas, int puntos) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.puntos = puntos;
    }

    public Personaje() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "nombre='" + nombre + '\'' +
                ", vidas=" + vidas +
                ", puntos=" + puntos +
                '}';
    }
}
