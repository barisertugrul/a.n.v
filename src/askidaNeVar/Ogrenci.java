package askidaNeVar;

public class Ogrenci {
	private int id;
	private String ogrenciAdi;
	private String ogrenciBelgesi;
	private String ogrenciAdresi;
	private String ogrenciEmail;
	
	public void ogrenciEkle(int newId, String adi, String belgesi, String adresi, String email) {
		this.setId(newId);
		this.setOgrenciAdi(adi);
		this.setOgrenciAdresi(adresi);
		this.setOgrenciBelgesi(belgesi);
		this.setOgrenciEmail(email);
		boolean data = Data.getInstance().ogrenciler.add(this);
	}
	
	public void uyeOl(String adi, String belgesi, String adresi, String email) {
		int index = Data.getInstance().ogrenciler.size()+1;
		System.out.println("Index:" + index);
		ogrenciEkle(index, adi, belgesi, adresi, email);
	}

	public String getOgrenciAdi() {
		return ogrenciAdi;
	}

	public void setOgrenciAdi(String ogrenciAdi) {
		this.ogrenciAdi = ogrenciAdi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOgrenciBelgesi() {
		return ogrenciBelgesi;
	}

	public void setOgrenciBelgesi(String ogrenciBelgesi) {
		this.ogrenciBelgesi = ogrenciBelgesi;
	}

	public String getOgrenciAdresi() {
		return ogrenciAdresi;
	}

	public void setOgrenciAdresi(String ogrenciAdresi) {
		this.ogrenciAdresi = ogrenciAdresi;
	}

	public String getOgrenciEmail() {
		return ogrenciEmail;
	}

	public void setOgrenciEmail(String ogrenciEmail) {
		this.ogrenciEmail = ogrenciEmail;
	}
}
