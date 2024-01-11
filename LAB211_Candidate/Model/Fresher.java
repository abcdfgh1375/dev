package Model;
import java.text.DecimalFormat;
import java.util.*;
public abstract class Bee {
    static Scanner sc = new Scanner(System.in);
    String name;
    double health;
    boolean dead;
    String type;
    public Bee(){}

    public Bee(String type, String name, double health, boolean dead) {
        this.type = type;
        this.name = name;
        this.health = health;
        this.dead = dead;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public boolean isDead() {
        return dead;
    }

    public void setDead(boolean dead) {
        this.dead = dead;
    }

    @Override
    public String toString() {
        return "Bee{" + "name=" + name + ", health=" + health + ", dead=" + dead + '}';
    }
     
    public static boolean inputBoolean(String msg) {
    boolean data = false;
    do {
        System.out.print(msg);
        String input = sc.nextLine().trim().toLowerCase();
        if(input.equals("true")) {
            data = true;
            break;
        } else if (input.equals("false")) {
            data = false;
            break;
        } else {
            System.out.print("Your input must be 'true' or 'false'. ");
            System.out.println();
        }
    } while (true);
    return data;
}

    public static double inputDouble(String msg, double min, double max){
       //get an int between min and max
        if(min > max){
            double t = min;
            min = max;
            max = t;
        }
        double data;
        do{
            System.out.print(msg);
            data = Double.parseDouble(sc.nextLine());
        }while(data < min || data > max);
        return data;
    }
    
    public static int inputInt(String msg, int min, int max){
       //get an int between min and max
        if(min > max){
            int t = min;
            min = max;
            max = t;
        }
        int data;
        do{
            System.out.print(msg);
            data = Integer.parseInt(sc.nextLine());
        }while(data < min || data > max);
        return data;
    }
    
    public static String inputStr(String msg){
        boolean check = true;
        String data;
        do{
            System.out.print(msg);
            data = sc.nextLine().trim();
            check = false;
            while(data.matches(".*\\d+.*")) {
                System.out.print("Invalid string.\nEnter name again: ");
                data = sc.nextLine().trim();}
        }while(check);
        return data;
    }
    
}
    