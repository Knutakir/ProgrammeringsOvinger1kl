class Valuta{

	private String valutaNavn;
	private double kurs;
	private int enhet;

	public Valuta(String valutaNavn, double kurs, int enhet){
		this.valutaNavn = valutaNavn;
		this.kurs = kurs;
		this.enhet = enhet;
	}

	public String finnNavn(){
		return valutaNavn;
	}

	public double getKurs(){
		return kurs;
	}

	public void settKurs(double nykurs){
		kurs = nykurs;
	}

	public int getEnhet(){
		return enhet;
	}

	public double beregnTilNok(double anntall){
		double norskeKroner = 0;
		norskeKroner = anntall*kurs;
		return norskeKroner;
	}

	public double beregnFraNok(double anntall){
		double nyttAnntall = 0;
		nyttAnntall = anntall/kurs;
		return nyttAnntall;
	}
}