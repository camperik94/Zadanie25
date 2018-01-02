
public class Palindrom {
	private String wyraz1;
	private String wyraz2;
	
	public String getWyraz1() {
		return wyraz1;
	}
	public void setWyraz1(String wyraz1) {
		this.wyraz1 = wyraz1;
	}
	public String getWyraz2() {
		return wyraz2;
	}
	public void setWyraz2(String wyraz2) {
		this.wyraz2 = wyraz2;
	}
	public Palindrom(String wyraz1, String wyraz2) {
		this.wyraz1 = wyraz1;
		this.wyraz2 = wyraz2;
	}
	
	public boolean czyPalindrom() {
		int i1 = 0;
		int i2 = wyraz2.length() - 1;
		while(i2 > i1) {
			if(!Character.toString(wyraz1.charAt(i1)).equals(Character.toString(wyraz2.charAt(i2))) ) {
				return false;
			}
			i2--;
			i1++;
		}
		return true;
		
	}
	
}
