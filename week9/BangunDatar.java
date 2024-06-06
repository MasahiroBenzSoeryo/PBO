package week9;

public class BangunDatar
{
    private int panjang;
    private int lebar;
    private double diameter;
    private int sisi;
    private static final double pi = 3.14;

    // constructor
    public BangunDatar(int sisi)
    {
        this.sisi = sisi;
    }

    // constructor
    public BangunDatar(int panjang, int lebar)
    {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // constructor
    public BangunDatar(double diameter)
    {
        this.diameter = diameter;
    }

    // luas persegi
    public int luas(int sisi)
    {
        return sisi * sisi;
    }

    // luas persegi panjang
    public int luas(int panjang, int lebar)
    {
        return panjang * lebar;
    }

    // luas segitiga
    public double luas(double panjang, double lebar)
    {
        return (panjang * lebar) / 2;
    }

    // luas lingkaran
    public double luas(double diameter)
    {
        double jari = diameter / 2;
        return pi * (jari * jari);
    }

    public int getPanjang()
    {
        return panjang;
    }

    public int getLebar()
    {
        return lebar;
    }

    public double getDiameter()
    {
        return diameter;
    }

    public int getSisi()
    {
        return sisi;
    }
}