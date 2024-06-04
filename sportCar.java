import java.io.PrintWriter;

public class sportCar extends Car {
  public static String[] SCarsName = { "Bugatti" , "Ferrari" , "Mustang" , "Lamborghini" , "Camaro" };
  public static int[][] SCAColor = {{4,7,2},{1,3,4},{3,2,4},{0,8,7},{4,1,6}};
  public static int B = SCAColor[0][0] + SCAColor[0][1] +  SCAColor[0][2];
    public static int F = SCAColor[1][0] + SCAColor[1][1] +  SCAColor[1][2];
     public static int M = SCAColor[2][0] + SCAColor[2][1] +  SCAColor[2][2];
      public static int L = SCAColor[3][0] + SCAColor[3][1] +  SCAColor[3][2];
       public static int C = SCAColor[4][0] + SCAColor[4][1] +  SCAColor[4][2];
       public static int[] SCNAvailble = { B, F, M, L, C};
 static  public String[] SCarcolor = {"white","black","red"};
    private String[] typeOFGear = {"normal","automatic"};
    public String TypeOFGear;
    //----------------------------------------------------------------cunstent---------------------------------------------------------
    public sportCar(){
    	super();
    }
    public sportCar (String name , String color , int moodel){
		super ( name , color , moodel);
    }
    
//---------------------------------------------------
    public static int carID(String name) {
        int id;

        switch(name) {

            case "Bugatti":
            case "bugatti":
            case "1": 
                id = 0;
                break;

            case "Ferrari":
            case "ferrari":
            case "2": 
                id = 1;
                break;  

            case "Mustang":
            case "mustang":
            case "3": 
                id = 2;
                break;

            case "Lamborghini":
            case "lamborghini":
            case "4": 
                id = 3;
                break;         

            case"Camaro":
            case"camaro":
            case "5": 
                id = 4;
                break; 
            default: 
                id = -10;
                break; 
        }
        return id;
    }
    
    public static int colorID(String name) {
        int id;

        switch(name) {


            case "white":
            case "1":  
                id = 0;
                break;  

            case "black":
            case "2": 
                id = 1;
                break;

            case "red":
            case "3": 
                id = 2;
                break;         

            default: 
                id = -10;
                break; 
        }
        return id;
    }
//-----------------------------------------------------------------------
    public void getSCarsName(){
int j = 1 ;
for(int i = 0 ; i < SCarsName.length ; i++ ){
System.out.println(j + "- " + SCarsName[i] );
j++;
}
 }
 //----------------------------------------------------------------------
    public void getSCColor(){
  int j = 1 ;
for(int i = 0 ; i < SCarcolor.length ; i++ ){
System.out.println(j + "- " + SCarcolor[i] );
j++;
}
}
 //-------------------------------------------name--------------------------------------------------------------------------
public  int getSCNAvailble (String SCarname){
    int flagn = 1;

    if (carID(SCarname) != -10) {

        if( SCNAvailble[carID(SCarname)]>0){
        System.out.println("the available cars of this car is ("+ SCNAvailble[carID(SCarname)]+")");
        }
        else{
          flagn=-1;
        }

    } else {
    System.out.println("sorry there is no car's with this name");
    flagn = 0;
    }
    return flagn;
    }
  //-------------------------------------------color--------------------------------------------------------------------------
  public int getSCAColor(String SCarname ,String SCarColor){
    int flagC = 1;
    
    
    if (colorID(SCarColor) != -10) {

        if(SCAColor[carID(SCarname)][colorID(SCarColor)]>0){
        System.out.println("the avalabil cars of this color is ("+ SCAColor[carID(SCarname)][colorID(SCarColor)]+")");
        }
        else{
          flagC=-1;
        }

    } else {
    System.out.println("sorry there is no car's with this name");
    flagC = 0;
    }
    
    return flagC;
  }
  //----------------------------------------------------------------------
    public void setTypeOFGear (String SCarname) {
        switch(SCarname){
            case"Bugatti":
            case"bugatti":
            case "Ferrari":
            case "ferrari":
            case "Lamborghini":
            case "lamborghini":
                TypeOFGear = typeOFGear[1];
            break;
            case "Mustang":
            case "mustang":
            case"Camaro":
            case"camaro":
                TypeOFGear = typeOFGear[0];
            break;
        }
    }
    //----------------------------------------------
    public void setTypeOFGas(String SCarname){
        switch(SCarname){
            case"Bugatti":
            case"bugatti":
            case "Ferrari":
            case "ferrari":
            case "Mustang":
            case "mustang":
                super.setgas(91);
            break;
            case "Lamborghini":
            case "lamborghini":
            case"Camaro":
            case"camaro":
                super.setgas(95);
            break;
    }
  }
  //---------------------------------------------
  public int setSCarPrice(String SCarname ,String SCarColor){
switch(SCarname){
case"Bugatti":
case"bugatti":
switch(SCarColor){
case "white":
if(SCAColor[0][0]>0){
super.carPrice=1000000;
}
break;
case"black":
if(SCAColor[0][1]>0){
super.carPrice=1300000;
}
break;
case "red":
if(SCAColor[0][2]>0){
super.carPrice=1290000;
}
break;
}
break;
case "Ferrari":
case "ferrari":
switch(SCarColor){
case "white":
if(SCAColor[1][0]>0){
super.carPrice=7000000;
}
break;
case"black":
if(SCAColor[1][1]>0){
super.carPrice=6900000;
}
break;
case "red":
if(SCAColor[1][2]>0){
super.carPrice=6800000;
}
}
break;
case "Mustang":
case "mustang":
switch(SCarColor){
case "white":
if(SCAColor[2][0]>0){
super.carPrice=500000;
}
break;
case"black":
if(SCAColor[2][1]>0){
super.carPrice=490000;
}
break;
case "red":
if(SCAColor[2][2]>0){
super.carPrice=495000;
}
}
break;
case "Lamborghini":
case "lamborghini":
switch(SCarColor){
case "white":
if(SCAColor[3][0]>0){
super.carPrice=2000000;
}
break;
case"black":
if(SCAColor[3][1]>0){
super.carPrice=1990000;
}
break;
case "red":
if(SCAColor[3][2]>0){
super.carPrice=2100000;
}
break;
}
break;
case"Camaro":
case"camaro":
switch(SCarColor){
case "white":
if(SCAColor[4][0]>0){
super.carPrice=251000;
}
break;
case"black":
if(SCAColor[4][1]>0){
super.carPrice=250000;
}
break;
case "red":
if(SCAColor[4][2]>0){
super.carPrice=240000;
}
break;
}
break;
}
super.Taxs(super.carPrice);
return super.carPrice;
  }
  //--------------------------------------------------------------
  public double getTaxs(){
    return super.taxs;
    }
    //-------------------------------------------------------------
    public void setmoodle(String SCarname){
      switch(SCarname){
   case"Bugatti":
case"bugatti":
     super.setmoodel(2019);
     break;
    case "Ferrari":
case "ferrari":
     super.setmoodel(2021);
     break;
        case "Mustang":
case "mustang":
               super.setmoodel(2022);
     break;
       case "Lamborghini":
case "lamborghini":
          super.setmoodel(2024);
     break;
     case"Camaro":
case"camaro":
       super.setmoodel(2024);
     break;
      }
    }          
  //-------------------------------------------------------------------------------
public void Submit(String SCarname ,String SCarColor ){

if(SCAColor[carID(SCarname)][colorID(SCarColor)]>0){
SCNAvailble[carID(SCarname)] = SCNAvailble[carID(SCarname)] - 1;
SCAColor[carID(SCarname)][colorID(SCarColor)]=SCAColor[carID(SCarname)][colorID(SCarColor)]-1;
}

}
//-------------------------------------------------------------------------
static public void testSCNAvailblecar(){
int g =0;
       for(int i = 0 ; i < SCNAvailble.length ; i++ ){
       System.out.println(SCarsName[g] +" : " + SCNAvailble[i] );
       g++;
       }
       }
       //-------------------------------------------------
 static public void testSCAcolor(){
       for(int i = 0 ; i < SCAColor.length ; ++i ){
         for(int k=0 ; k < SCAColor[i].length ; ++k){
          if(k==0){
            System.out.println("   "+SCarsName[i]+":");
          }
       System.out.println(SCarcolor[k]+" : " + SCAColor[i][k] );
       }
     }
 }
 
 static public void toFileSCAcolor(PrintWriter p){
       for(int i = 0 ; i < SCAColor.length ; ++i ){
         for(int k=0 ; k < SCAColor[i].length ; ++k){
          if(k==0){
            p.println("   "+SCarsName[i]+":");
          }
       p.println(SCarcolor[k]+" : " + SCAColor[i][k] );
       }
     }
 }
 //---------------------------discraption--------------------------------
    public String toString() {
        return "Car:Sport"+" name: "+ super.getname() +" color: "+ super.getcolor() +"  moodle: ("+ super.getmoodle()+ ")  price:(" + super.carPrice + ")  the taxs will be : ("+ getTaxs() + ")  the price with the taxs will be : ("+ super.Taxs(super.carPrice)+")  type of the gear: "+ TypeOFGear + " type of the gas: (" + super.getgas()+")";
    }
}