import java.util.*;
import java.io.*;
public class PT {   
    static int orderNumber = 1; 
    public static void main(String[] args) {
        Scanner CH = new Scanner(System.in);
        boolean onMnue = true;
        while (onMnue) {
            System.out.println("");
            System.out.println("Welcom to MA Cars Factory ");
            System.out.println("---------------------------");
            System.out.println("       -------------       ");
            System.out.println("1- Car Order");
            System.out.println("2- Show Cars Availble");
            System.out.println("3- File with Cars Availble");
            System.out.println("4- Exit");
            
            int select = CH.nextInt();

            switch (select) {
                case 1:
                    order();
                    break;
                case 2:
                System.out.println("------------------------------- SPORT CARS:"); 
                sportCar.testSCNAvailblecar();
                System.out.println("--------------");
                sportCar.testSCAcolor();

                System.out.println("------------------------------- HATCHBACK CARS:"); 
                Hatchback.testHCNAvailblecar();
                System.out.println("--------------");
                Hatchback.testHCAcolor();
                System.out.println("-------------------------------"); 
                    break;
                case 3:
                    
                    file();
                    break;
                case 4: 
                    onMnue = false;
                    break;
            }
        } //end loob
    } //end main
    
    
    public static void order() {
        Scanner CS = new Scanner(System.in);

        System.out.println("what type of car do you want to ordeo?");
        System.out.println("1- Sport car   2- Hatchback car");
        
        String CarType ; 
        CarType = CS.nextLine();
        System.out.println("----------------------------------");

        switch(CarType){
            case "Sport car":
            case "sport":
            case "Sport":
            case "sport car":
            case "1":   
                sportCar CSport = new sportCar();
                String SCarname;
                String SCarColor;
                System.out.println("witch car would you like to order?");
                CSport.getSCarsName();

                SCarname = sportCar.SCarsName[CS.nextInt()-1];/*car name */
                System.out.println("-------------------------------");
                CSport.setname(SCarname);
                CSport.setTypeOFGear(SCarname);
                CSport.setTypeOFGas(SCarname);
                CSport.setmoodle(SCarname);
                int x = CSport.getSCNAvailble(SCarname);
                if( x == 1){
                    System.out.println("-------------------------------");
                    System.out.println("which color do you brefer to order for the car?");
                    CSport.getSCColor();
                    SCarColor = sportCar.SCarcolor[CS.nextInt()-1];/*CAR COLOR*/
                    System.out.println("-------------------------------");
                    CSport.setcolor(SCarColor);
                    int g = CSport.getSCAColor(SCarname , SCarColor);
                    if(g == 1){
                        CSport.setSCarPrice(SCarname , SCarColor);
                        CSport.getTaxs();
                        System.out.println("-------------------------------");
                        System.out.println("do you want a Description for the car?");
                        System.out.println("1- yes");
                        System.out.println("2- no");
                        int Description;
                        Description = CS.nextInt();
                        if (Description == 1){
                            System.out.println("-------------------------------");
                            System.out.println(CSport);
                            System.out.println("-------------------------------");
                        }

                        System.out.println("this is the last step do you want to submit?");
                        System.out.println("1- yes");
                        System.out.println("2- no");
                        int submit;
                        submit = CS.nextInt();
                        if (submit == 1){
                            CSport.Submit(SCarname , SCarColor);
                            orderFile(CSport.toString());
                            //CSport.testSCAcolor();
                            System.out.println("-------------------------------");
                            //CSport.testSCNAvailblecar();
                        }
                        else{
                                break;
                        }
                    }
                    else if (g == -1){
                            System.out.print("Sorry the color you chose is not available ");
                    }
                }
                else if(x==-1){
                System.out.print("Sorry the car you chose is not available ");
                }
                break;
            case "Hatchback car":
            case "hatchback car":
            case "Hatchback":
            case "hatchback":
            case "2":   
                Hatchback CHatchback = new Hatchback();
                String HCarname;
                String HCarColor;
                System.out.println("witch car would you like to order?");
                CHatchback.getHCarsName();
                HCarname = Hatchback.HCarsName[CS.nextInt()-1];/*car name */
                System.out.println("-------------------------------");
                CHatchback.setname(HCarname);
                CHatchback.settypeofgear(HCarname);
                CHatchback.setTypeOFGas(HCarname);
                CHatchback.setmoodle(HCarname);
                int y = CHatchback.getHCNAvailble(HCarname);
                if( y == 1){
                    System.out.println("-------------------------------");
                    System.out.println("which color do you brefer to order for the car?");
                    CHatchback.getHCColor();
                    HCarColor = Hatchback.HCarcolor[CS.nextInt()-1];/*CAR COLOR*/
                    System.out.println("-------------------------------");
                    CHatchback.setcolor(HCarColor);

                    int k = CHatchback.getHCAColor(HCarname ,HCarColor );
                    if(k == 1){
                    CHatchback.setHCarPrice(HCarname ,HCarColor);
                    CHatchback.getTaxs();
                        System.out.println("do you want a Description for the car?");
                        System.out.println("1- yes");
                        System.out.println("2- no");
                        int Description;
                        Description = CS.nextInt();
                        if (Description == 1){
                            System.out.println("-------------------------------");
                            System.out.println(CHatchback);
                            System.out.println("-------------------------------");
                    }

                        System.out.println("this is the last step do you want to submit?");
                        System.out.println("1- yes");
                        System.out.println("2- no");
                        int submit;
                        submit = CS.nextInt();
                        if (submit == 1){
                        System.out.println("-------------------------------");
                        CHatchback.Submit(HCarname ,HCarColor);
                        orderFile(CHatchback.toString());
                        //CHatchback.testHCNAvailblecar();
                        System.out.println("-------------------------------");
                        //CHatchback.testHCAcolor();
                    }
                    else{
                            break;
                    }

                    }
                    else if (k == -1){
                            System.out.println("-------------------------------");
                            System.out.print("Sorry the color you chose is not available ");
                    }
                    }
                    else if(y == -1){
                        System.out.println("-------------------------------");
                System.out.print("Sorry the car you chose is not available ");
                }
                break;
        } //end switch
    } // end order
    
    
    public static void file() {
        
        PrintWriter outputStream = null;
        try {
            FileOutputStream s = new FileOutputStream("All Availble Cars.txt");
            outputStream = new PrintWriter(s);
        } catch (Exception e) {
            System.out.println("error");
        }
        
                outputStream.println("------------------------------- SPORT CARS:"); 
                sportCar.toFileSCAcolor(outputStream);

                outputStream.println("------------------------------- HATCHBACK CARS:"); 
                Hatchback.toFileHCAcolor(outputStream);

        outputStream.close();
        System.out.println("Availble Cars have saved in text file with name: "+"All Availble Cars.txt");
    }
    
    
    public static void orderFile(String description) {
        
        PrintWriter outputStream = null;
        try {
            FileOutputStream s = new FileOutputStream("orderFile"+orderNumber+".txt");
            outputStream = new PrintWriter(s);
        } catch (Exception e) {
            System.out.println("error");
        }
                outputStream.println("------------------------------- YOUR ORDER:"); 
                outputStream.println(description);
                outputStream.close();
                System.out.println("Your order have saved in text file with name: "+"orderFile"+orderNumber+".txt");
        orderNumber++;
    } 
}// end class