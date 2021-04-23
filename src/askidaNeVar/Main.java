package askidaNeVar;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Data.getInstance().ogrenciListesiOlustur(100);

		ArrayList<Ogrenci> ogrenciler = Data.getInstance().getOgrenciler();
		
		//Yeni ��renci �yeli�i sim�lasyonu
		Ogrenci yeniOgrenci = new Ogrenci();
		yeniOgrenci.uyeOl(
				"YeniOgrenci �smi",
				"Belgesi",
				"Adresi",
				"E-Posta Adresi"
			);
		
		//�ekili� sim�lasyonu
		Aski aski = new Aski();
		aski.cekilisYap();
		int[] kazananlar = Data.getInstance().wins;
		
		//Kazananlar� Listeleme
				System.out.println();
				System.out.println("*****************************************");
				System.out.println("********** Kazanan ��renciler **********");
				System.out.println("*****************************************");
				System.out.format("%5s%20s%20s\n", "ID", "Ad�-Soyad�","E-Posta Adresi");
				System.out.format("%5s%20s%20s\n", "_____", "_______________","_______________");

		
		for(int kazanan:kazananlar) {
			Ogrenci ogrenci = ogrenciler.get(kazanan);
			System.out.format("%5d%20s%20s\n", ogrenci.getId(), ogrenci.getOgrenciAdi(),ogrenci.getOgrenciEmail());
		}
	}
}
