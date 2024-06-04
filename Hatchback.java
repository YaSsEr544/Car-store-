import java.io.PrintWriter;
public class Hatchback extends Car {
    static String[] HCarsName = {"Accent" , "Hyundai i30" , "Ford Fiesta" , "Corolla" , "Prius"};
   public static int[][] HCAColor={{4,5,6},{1,3,5},{2,0,6},{1,2,5},{5,4,7}};
   public static int A = HCAColor[0][0] + HCAColor[0][1] +  HCAColor[0][2];
    public static int H = HCAColor[1][0] + HCAColor[1][1] +  HCAColor[1][2];
     public static int F = HCAColor[2][0] + HCAColor[2][1] +  HCAColor[2][2];
      public static int C = HCAColor[3][0] + HCAColor[3][1] +  HCAColor[3][2];
       public static int P = HCAColor[4][0] + HCAColor[4][1] +  HCAColor[4][2];
   public static int[] HCNAvailble = { A, H,F ,C ,P };
   private String[] typeOFGear = {"normal","automatic"};
    public String TypeOFGear;
   public static String[] HCarcolor = {"white","black","red"};
    public Hatchback() {}
    public Hatchback(String name , String color , int moodel) {
        super(name, color, moodel);
      }
//---------------------------------------------------
    public static int carID(String name) {
    int id;

    switch(name) {
      
        case "Accent":
        case "accent":
        case "1": 
            id = 0;
            break;
    
        case "Hyundai i30":
        case "Hyundaii30":
        case "hyundai i30":
        case "hyundaii30":
        case "2": 
            id = 1;
            break;  

        case "Ford Fiesta":
        case "ford fiesta":
        case "FordFiesta":
        case "fordfiesta":
        case "3": 
            id = 2;
            break;
            
        case "Corolla":
        case "corolla":
        case "4": 
            id = 3;
            break;         
            
        case"Prius":
        case"prius":
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
     public void getHCarsName(){
        int j = 1 ;
        for(int i = 0 ; i < HCarsName.length ; i++ ){
        System.out.println(j + "-" + HCarsName[i] );
        j++;
        }
    }
      
    //------------------------------------------------------------
    public void getHCColor(){
        int j = 1 ;
      for(int i = 0 ; i < HCarcolor.length ; i++ ){
      System.out.println(j + "-" + HCarcolor[i] );
      j++;
      }
      }
      //---------------------------------------------------------------
public  int getHCNAvailble (String HCarname){
    int flagn = 1;

    if (carID(HCarname) != -10) {

        if( HCNAvailble[carID(HCarname)]>0){
        System.out.println("the available cars of this car is ("+ HCNAvailble[carID(HCarname)]+")");
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
//-------------------------------------------------------------
  public int getHCAColor(String HCarname ,String HCarColor){
    int flagC = 1;
    
    
    if (colorID(HCarColor) != -10) {

        if(HCAColor[carID(HCarname)][colorID(HCarColor)]>0){
        System.out.println("the avalabil cars of this color is ("+ HCAColor[carID(HCarname)][colorID(HCarColor)]+")");
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
  //------------------------------------------------------------------------------
  public void settypeofgear(String HCarname ){
switch(HCarname){
 case "Accent":
 case "accent":
 case"Prius":
 case"prius":
TypeOFGear = typeOFGear[0];
break;
 case "Hyundai i30":
 case "Hyundaii30": 
 case "hyundai i30":
 case "hyundaii30":
 case "Ford Fiesta":
 case "ford fiesta":
 case "FordFiesta":
 case "fordfiesta":
 case "Corolla":
 case "corolla":
TypeOFGear = typeOFGear[1];
break;
}
  }
  //------------------------------------------
  public void setTypeOFGas(String SCarname){
    switch(SCarname){
case "Accent":
 case "accent":
 case"Prius":
 case"prius":
 case "Corolla":
 case "corolla":
super.setgas(91);
break;
case "Hyundai i30":
 case "Hyundaii30": 
 case "hyundai i30":
 case "hyundaii30":
 case "Ford Fiesta":
 case "ford fiesta":
 case "FordFiesta":
 case "fordfiesta":
super.setgas(95);
break;
}
}
//--------------------------------------------------------------
public int setHCarPrice(String HCarname ,String HCarColor){
    switch(HCarname){
  case "Accent":
 case "accent":
        switch(HCarColor){
        case "white":
        if(HCAColor[0][0]>0){
        super.carPrice=23000;
        }
        break;
        case"black":
        if(HCAColor[0][1]>0){
        super.carPrice=22500;
        }
        break;
        case "red":
        if(HCAColor[0][2]>0){
        super.carPrice=22900;
        }
        break;
        }
        break;
      case "Hyundai i30":
        case "Hyundaii30": 
         case "hyundai i30":
          case "hyundaii30":
        switch(HCarColor){
        case "white":
        if(HCAColor[1][0]>0){
        super.carPrice=27650;
        }
        break;
        case"black":
        if(HCAColor[1][1]>0){
        super.carPrice=27500;
        }
        break;
        case "red":
        if(HCAColor[1][2]>0){
        super.carPrice=26650;
        }
        }
        break;
          case "Ford Fiesta":
        case "ford fiesta":
         case "FordFiesta":
          case "fordfiesta":
        switch( HCarColor){
        case "white":
        if(HCAColor[2][0]>0){
        super.carPrice=23355;
        }
        break;
        case"black":
        if(HCAColor[2][1]>0){
        super.carPrice=23300;
        }
        break;
        case "red":
        if(HCAColor[2][2]>0){
        super.carPrice=22860;
        }
        }
        break;
     case "Corolla":
   case "corolla":
        switch(HCarColor){
        case "white":
        if(HCAColor[3][0]>0){
        super.carPrice=32000;
        }
        break;
        case"black":
        if(HCAColor[3][1]>0){
        super.carPrice=31240;
        }
        break;
        case "red":
        if(HCAColor[3][2]>0){
        super.carPrice=31500;
        }
        break;
        }
        break;
           case"Prius":
         case"prius":
        switch(HCarColor){
        case "white":
        if(HCAColor[4][0]>0){
        super.carPrice=13000;
        }
        break;
        case"black":
        if(HCAColor[4][1]>0){
        super.carPrice=13500;
        }
        break;
        case "red":
        if(HCAColor[4][2]>0){
        super.carPrice=12980;
        }
        break;
        }
        break;
        }
        super.Taxs(super.carPrice);
        return super.carPrice;
          }
          //-------------------------------------------------------------------
          public double getTaxs(){
          return super.taxs;
          }
public void setmoodle(String SCarname){
  switch(SCarname){
 case "Accent":
 case "accent":
 super.setmoodel(2011);
 break;
case "Hyundai i30":
        case "Hyundaii30": 
         case "hyundai i30":
          case "hyundaii30":
 super.setmoodel(2020);
 break;
     case "Ford Fiesta":
        case "ford fiesta":
         case "FordFiesta":
          case "fordfiesta":
           super.setmoodel(2019);
 break;
   case "Corolla":
    case "corolla":
      super.setmoodel(2024);
 break;
 case"Prius":
         case"prius":
   super.setmoodel(2024);
 break;
  }
}          
//-------------------------------------------
public void Submit(String HCarname ,String HCarColor ){

if(HCAColor[carID(HCarname)][colorID(HCarColor)]>0){
HCNAvailble[carID(HCarname)] = HCNAvailble[carID(HCarname)] - 1;
HCAColor[carID(HCarname)][colorID(HCarColor)]=HCAColor[carID(HCarname)][colorID(HCarColor)]-1;
}

}
  //-------------------------------------------------------------------
static public void testHCNAvailblecar(){
 int j = 0 ;
      for(int i = 0 ; i < HCNAvailble.length ; i++ ){
      System.out.println(HCarsName[j]+ " : " + HCNAvailble[i] );
      j++;
      }
      }
      //-------------------------------------------------
static public void testHCAcolor(){

      for(int i = 0 ; i < HCAColor.length ; ++i ){
        for(int k=0 ; k<HCAColor[i].length ; ++k){
            if(k==0){
                System.out.println("   "+HCarsName[i]+":");
            }
      System.out.println(HCarcolor[k] + " : " + HCAColor[i][k] );
      }
    }
}

 static public void toFileHCAcolor(PrintWriter p){
       for(int i = 0 ; i < HCAColor.length ; ++i ){
         for(int k=0 ; k < HCAColor[i].length ; ++k){
          if(k==0){
            p.println("   "+HCarsName[i]+":");
          }
       p.println(HCarcolor[k]+" : " + HCAColor[i][k] );
       }
     }
 }

//---------------------------------------------discaption-----------------------------
    public String toString() {
        return "Car:Hatchback"+" name: "+ super.getname() +" color: "+ super.getcolor() +" moodle: ("+ super.getmoodle() + ")  price:(" + super.carPrice + ")  the taxs will be : ("+ getTaxs() + ")  the price with the taxs will be : ("+ super.Taxs(super.carPrice)+")  type of the gear: "+ TypeOFGear + " type of the gas: (" + super.getgas()+")";
    }

}