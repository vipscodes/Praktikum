package latihan4;

public class GajiPelatih extends Gaji{
	private int bonusJuara;
	
	public GajiPelatih() {
		super();
	}
	
	public GajiPelatih(int gaji) {
		super(gaji);
	}
	
	public GajiPelatih(int gaji, int bonusJuara) {
		super(gaji);
		this.bonusJuara = bonusJuara;
	}
	
	@Override
	public int hitungGaji() {
		return super.hitungGaji() + bonusJuara;
	}
}
