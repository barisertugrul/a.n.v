package askidaNeVar;

import java.util.ArrayList;
import java.util.Random;

public class Data {
	private static Data instance;

    public ArrayList<Ogrenci> ogrenciler;
    public ArrayList<Sirket> sirketler;
    public ArrayList<Gonullu> gonulluler;
    public int[] comments;
    public int[] likes;
    public int[] wins;

    private Data() {
    	sirketler = new ArrayList<Sirket>();
    	gonulluler = new ArrayList<Gonullu>();
    	ogrenciler = new ArrayList<Ogrenci>();
    	
    	
    	//Sahte �irket ekleme
    	sirketler.add(new Sirket(1,"�irket1"));
    	sirketler.add(new Sirket(2,"�irket2"));
    	sirketler.add(new Sirket(3,"�irket3"));
    	sirketler.add(new Sirket(4,"�irket4"));
    	
    	//Sahte g�n�ll� ekleme
    	gonulluler.add(new Gonullu(1,"G�n�ll�1"));
    	gonulluler.add(new Gonullu(2,"G�n�ll�2"));
    	gonulluler.add(new Gonullu(3,"G�n�ll�3"));
    	gonulluler.add(new Gonullu(4,"G�n�ll�4"));
    	
    	//Sahte yorum ve like listesi olu�turma

        comments = new int[]{1,5,8,12,21,24,65,82,95};
        likes = new int[]{2,5,7,11,21,27,65,81,95,100};
    }

    public static Data getInstance() {
        if (instance == null) {
            instance = new Data();
        }
        return instance;
    }

	public ArrayList<Ogrenci> getOgrenciler() {
		return ogrenciler;
	}
	
	//Random string yaratma
	private String stringLorem(int uzunluk) {
		String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < uzunluk-1) {
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
	}
	
	//Otomatik ��renci listesi olu�turma
	public void ogrenciListesiOlustur(int ogrenciSayisi) {
		
		for(int i=1;i<=ogrenciSayisi;i++) {
			Ogrenci ogrenci = new Ogrenci();
	   		ogrenci.ogrenciEkle(
	    				i,
	    				stringLorem(7) + " " + stringLorem(10),
	    				stringLorem(7),
	    				stringLorem(14),
	    				stringLorem(5).toLowerCase() + "@" + stringLorem(4).toLowerCase() + ".com"
	    			);
	    }
	}
}
