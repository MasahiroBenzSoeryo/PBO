package week9;

public class BangunRuang extends BangunDatar
{
    private int tinggi;

    // constructor
    public BangunRuang(int sisi)
    {
        super(sisi);
    }

    // constructor
    public BangunRuang(int panjang, int lebar, int tinggi)
    {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    // constructor
    public BangunRuang(double diameter, int tinggi)
    {
        super(diameter);
        this.tinggi = tinggi;
    }

    // volume kubus
    public int volume(int sisi)
    {
        int area = super.luas(sisi);
        return area * sisi;
    }

    // volume balok
    public int volume(int panjang, int lebar, int tinggi)
    {
        int area = super.luas(panjang, lebar);
        return area * tinggi;
    }

    // volume tabung
    public double volume(double diameter, double tinggi)
    {
        double area = super.luas(diameter);
        return area * tinggi; 
    }

    // volume prisma segitiga
    public double volume(double panjang, double lebar, double tinggi)
    {
        double area = super.luas(panjang, lebar);
        return area * tinggi;
    }

    public int getTinggi()
    {
        return tinggi;
    }
}
