package com.company;

public abstract class Abstrak implements Rumus{
    double panjang, lebar, tinggi;

    public double getPanjang() { return panjang; }

    public double getLebar() { return lebar; }

    public double getTinggi() { return tinggi; }

    public void setPanjang(double panjang) { this.panjang = panjang; }

    public void setLebar(double lebar) { this.lebar = lebar; }

    public void setTinggi(double tinggi) { this.tinggi = tinggi; }

    abstract double Keliling();
    abstract double Luaspermukaan();
    abstract double Volume();
}