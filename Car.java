public class Car extends Sells{
	
	
    private String name;
    private String color;
    private int gas;
    private int moodel;
    private int hoursePower;
    private int MaxSpeed;
    private int MaxOFCapsity;
    
    
    public Car(){
    	super();
    }
    public Car (String name , String color , int moodel ,String pyment ,String carState ,int carPrice ){
    	super  ( pyment , carState , carPrice );
		this.name = name;
		this.color = color;
		this.moodel = moodel;
    }
    public Car (String name , String color , int moodel ){
    	super  ();
		this.name = name;
		this.color = color;
		this.moodel = moodel;
    }
    
    
    public void setname (String name){
    this.name = name;
    }
	public void setcolor (String color){
	this.color = color;
	}
	public void setmoodel(int moodel){
	this.moodel = moodel;
	}
	public void setgas (int gas){
	this.gas = gas;
	}
	public void sethoursePower (int hoursePower){
		this.hoursePower = hoursePower;
	}
	public void setMaxSpeed (int MaxSpeed){
		this.MaxSpeed = MaxSpeed;
	}
	public void setMaxOFCapsity(int MaxOFCapsity){
	    this.MaxOFCapsity = MaxOFCapsity; 
	}
	

	public String getname(){
		return name;
	}
	public String getcolor(){
		return color;
	}
	public int getgas(){
	    return gas;
	}
	public int gethoursePower(){
	    return hoursePower;
	}
	public int getMaxSpeed(){
	    return MaxSpeed;
	}
	public int getMaxOFCapsity(){
	    return MaxOFCapsity;
	}
	public int getmoodle(){
	    return moodel;
	}
	@Override
	   public String toString(){
		return "name : " + name  + "  color : " + color + "  moodel : " + moodel +  "  pyment : " + pyment +  "  carState : " + carState +  "  carPrice : " + carPrice ; 
	}
}