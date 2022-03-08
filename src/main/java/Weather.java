import java.util.Scanner;

public class Weather {
    public static void main(String[] args) {
        int heat;


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your heat: ");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("You can go to Snowboard today");
        }else if ( heat <= 15 && heat >= 5){
            System.out.println("You can go to Sinema today");
        }else if ( heat>=15 && heat<= 25 ){
            System.out.println("You can go to barbeque today");

        }else if (heat > 25){
            System.out.println("You can go to swimming today");
        }
    }
}
