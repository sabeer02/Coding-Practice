import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Booking {
    public static List<Taxi> createTaxis(int num){
        List<Taxi> taxiList = new ArrayList<>();
        for(int i=0;i<num;i++){
            Taxi t = new Taxi();
            taxiList.add(t);
        }
        return taxiList;
    }
    public static void main(String[] args) {
        List<Taxi> taxiList = createTaxis(4);
        Scanner scr = new Scanner(System.in);
        while (true){
            System.out.println("1.book");
            System.out.println("2.View");
            int ch = scr.nextInt();
            switch (ch){
                case 1:{
                    //pickup point
                    //drop point
                    //valid drop and pick
                    //time
                    //get free taxi
                    // no taxi return
                    //nearest and low earnings
                    //book taxi
                }
            }
        }
    }
}
