import java.util.Scanner;
import java.text.*;

public class MichaelKarimizadehException{
  public static void main(String[] args){
    //Exercise 1
    /*
    Scanner sc=new Scanner(System.in);
    DecimalFormat df=new DecimalFormat("#.00");
    Double currency=0.0;
    boolean valid = false;
    int choice=0;
    Double[]conversion={0.9784,0.7658,0.6188,77.5858,8.0966};
    do{
      System.out.print("Enter dollars in Canadian currency:\t");
      try{
        currency=sc.nextDouble();
        valid=true;
      }
      catch(Exception e){
        System.out.println("Invalid data! Please try again...\n");
        sc.next();
      }
    }while(!valid);
    String[]ending={"$"+currency+" CAD equals $"+df.format(currency*conversion[0])+" USD!",
    "$"+currency+" CAD equals \u20ac"+df.format(currency*conversion[1])+" EUR!",
    "$"+currency+" CAD equals \u00a3"+df.format(currency*conversion[2])+" GBP!",
    "$"+currency+" CAD equals \u00a5"+df.format(currency*conversion[3])+" JPY!",
    "$"+currency+" CAD equals \u0052"+df.format(currency*conversion[4])+" ZAR!"};
    System.out.println("\nChoose conversion...\n");
    System.out.println("1. Canadian (CAD) to US Dollars (USD)");
    System.out.println("2. Canadian (CAD) to Euro (EUR)");
    System.out.println("3. Canadian (CAD) to British Pounds (GBP)");
    System.out.println("4. Canadian (CAD) to Japanese Yen (JPY)");
    System.out.println("5. Canadian (CAD) to South African Rands (ZAR)");
    valid=false;
    do{
      System.out.print("Enter your choice:\t\t\t");
      try{
        choice=sc.nextInt();
        if (choice>0&&choice<6){
          valid=true;
        }
        else{
          System.out.println("Invalid Selection! Please try again...\n");
        }
      }
      catch(Exception e){
        System.out.println("Invalid Selection! Please try again...\n");
        sc.next();
      }
    }while(!valid);
    System.out.println(ending[choice-1]);
    */

    //Exercise 2
    
    Scanner sc=new Scanner(System.in);
    DecimalFormat df=new DecimalFormat("##");
    int choice=0;
    boolean valid=false;
    Double temperature;
    System.out.println("TEMPERATURE CONVERTER PROGRAM\n");
    System.out.println("1. Fahrenheit (\u00B0F) --> Celsius (\u00B0C)");
    System.out.println("1. Celsius (\u00B0C) --> Fahrenheit (\u00B0F)\n");
    do{
      System.out.print("Enter your choice:\t\t\t");
      try{
        choice=sc.nextInt();
        if (choice>0&&choice<3){
          valid=true;
        }
        else{
          System.out.println("Invalid choice! Please try again...\n");
        }
      }
      catch(Exception e){
        System.out.println("Invalid choice! Please try again...\n");
        sc.next();
      }
    }while(!valid);
    if (choice==1){
      System.out.print("Enter a temperature in Fahrenheit:\t");
      temperature=sc.nextDouble();
      System.out.println("\n"+df.format(temperature)+"\u00B0F equals "+df.format((temperature-32)/9.0*5)+"\u00B0C");
    }
    else {
      System.out.print("Enter a temperature in Celsius:\t");
      temperature=sc.nextDouble();
      System.out.println("\n"+df.format(temperature)+"\u00B0C equals "+df.format((temperature*9)/5.0+32)+"\u00B0F");
    }
    
  }
}