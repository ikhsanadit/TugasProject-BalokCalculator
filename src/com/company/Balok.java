package com.company;

public class Balok extends Abstrak{
    public void balok() {
        System.out.println("Keliling : "+Keliling()+" cm");
        System.out.println("Luas Permukaan : "+Luaspermukaan()+" cm2");
        System.out.println("Volume : "+Volume()+" cm3");
    }

    @Override
    public void setPanjang(double panjang) {
        super.setPanjang(panjang);
    }

    @Override
    public void setLebar(double lebar) {
        super.setLebar(lebar);
    }

    @Override
    public void setTinggi(double tinggi) {
        super.setTinggi(tinggi);
    }

    @Override
    double Keliling() {
        return 4*(getPanjang()+getLebar()+getTinggi());
    }

    @Override
    double Luaspermukaan() {
        return 2*((getPanjang()*getLebar())+(getPanjang()*getTinggi())+(getLebar()*getTinggi()));
    }

    @Override
    double Volume() {
        return getPanjang()*getLebar()*getTinggi();
    }
}