public abstract class Sells {
	public String nameOfSelar ;
	public String pyment ;
	public String carState ;
	public int carPrice ;
	public Double taxs ;

	public Sells() {}
	public Sells ( String pyment ,String carState ,int carPrice ) {
		this.pyment = pyment ;
		this.carState = carState ;
		this.carPrice = carPrice ; 
	}
	public Double Taxs ( int carPrice ) {
	     taxs = carPrice * 0.15 ;
		  return taxs + carPrice ;
	}
	

}
