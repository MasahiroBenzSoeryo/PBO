package pertemuan1;

public class latihan1_poinE2c {

	public static void main(String[] args) {

		double diameterTabung = 5;
		double tinggiTabung = 10;
		double jariJariTabung = diameterTabung / 2;
        double volumeTabung = Math.PI * jariJariTabung * jariJariTabung * tinggiTabung;
        
        System.out.println("Diameter tabung = 5");
        System.out.println("Tinggi tabung = 10");
        System.out.println("Volume tabung dengan diameter 5 dan tinggi 10 adalah = " + volumeTabung);
		
	}

}
