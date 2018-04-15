package m5.uf3;

public class Vehicle {
	
	public static final double velocitat_maxima=120;
	
	private int cilindrada;
	private int portes;
	private double velocitat_actual;
	
	public Vehicle(double velocitat_actual) {
		super();
		this.velocitat_actual = velocitat_actual;
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

}
