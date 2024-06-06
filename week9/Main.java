package week9;

public class Main
{
    public static void main(String[] args)
    {
        BangunDatar BangunDatar = new BangunDatar(0);
        
        System.out.println("================Bangun Datar===================");
        System.out.println("Luas Persegi: " + BangunDatar.luas(2));
        System.out.println("Luas Persegi Panjang: " + BangunDatar.luas(2, 3));
        System.out.println("Luas Segitiga: " + BangunDatar.luas(2.7, 5.8));
        System.out.println("Luas Lingkaran: " + BangunDatar.luas(7.0));
        System.out.println("================Bangun Datar===================");

        BangunRuang BangunRuang = new BangunRuang(0);

        System.out.println("================Bangun Ruang===================");
        System.out.println("Volume Balok: " + BangunRuang.volume(5, 4, 2));
        System.out.println("Volume Kubus: " + BangunRuang.volume(5));
        System.out.println("Volume Tabung: " + BangunRuang.volume(10.0, 4.0));
        System.out.println("Volume Prisma Segitiga: " + BangunRuang.volume(5.5, 3.0, 4.5));
        System.out.println("================Bangun Ruang===================");
    }
}