import java.util.*;
public class Firstgame {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random rn = new Random();
        System.out.println("Here we go!\nselect or click 0 for choose Rock.\nselect or click 1 for choose Paper.\nselect or click 2 for choose scissor.");
        int player=in.nextInt();
        switch(player) {
            case 0:
            System.out.println("You choosed : Rock");
            break;
            case 1:
            System.out.println("You choosed : Paper");
            break;
            case 2:
            System.out.println("You choosed : Scissor");
            break;
        }
        int opponent=rn.nextInt(3);
        switch(opponent) {
            case 0:
            System.out.println("Computer choosed : Rock");
            break;
            case 1:
            System.out.println("Computer choosed : Paper");
            break;
            case 2:
            System.out.println("Computer choosed : Scissor");
            break;
        }
        if(player==opponent){
            System.out.println("ohhh! well played but it's Draw");
        }
        else if(player==0 && opponent==1){
            System.out.println("computer win!!!!");
        }
        else if(player==0 && opponent==2){
            System.out.println("Congrats You won!!!!");
        }
        else if(player==1 && opponent==0){
            System.out.println("computer win!!!!");
        }
        else if(player==1 && opponent==2){
            System.out.println("Congrats You won!!!!");
        }
        else if(player==2 && opponent==0){
            System.out.println("computer win!!!!");
        }
        else if(player==2 && opponent==1){
            System.out.println("Congrats You won!!!!");
        }
        else if(player>2){
            System.out.println("Please choose number between 0 to 2.");
        }
    }
}