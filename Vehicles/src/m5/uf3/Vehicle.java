package m5.uf3;

public class Vehicle {
	
	public static final double velocitat_maxima=120;
	
	private int cilindrada;
	private int portes;
	private double velocitat_actual;
	private int marxes;
	private int marxa_actual;
	
	public Vehicle(double velocitat_actual, int marxes, int marxa_actual) {
		super();
		this.velocitat_actual = velocitat_actual;
		this.velocitat_actual = 0;
		this.marxes = marxes;
		this.marxes = 5;
		this.marxa_actual = marxa_actual;
		this.marxa_actual = 0;
	}
	
	public double getVelocitat() {
		return velocitat_actual;
	}

	public void setVelocitat(double velocitat_actual) {
		this.velocitat_actual = velocitat_actual;
	}

	public double accelerar(double velocitat_actual){
		if(this.velocitat_actual<velocitat_maxima)
			return this.velocitat_actual+=10;
		else
			return this.velocitat_actual;
	}
	
	public double desaccelerar (double velocitat_actual){
		if(this.velocitat_actual>0)
			return this.velocitat_actual-=10;
		else
			return this.velocitat_actual;
	}
	
	public int pujaMarxa(){
		if(this.marxa_actual>this.marxes)
			return this.marxa_actual+=1;
		else
			return this.marxa_actual;
	}
	
	public int baixaMarxa(){
		if(this.marxa_actual>0)
			return this.marxa_actual-=1;
		else
			return this.marxa_actual;
	}

}
