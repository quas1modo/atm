import java.sql.SQLOutput;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        String userName,password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500 ;
        int select;


        while (right>0){
            System.out.print("User Name: ");
            userName = inp.nextLine();
            System.out.print("User Password: ");
            password = inp.nextLine();

            if (userName.equals("patika") && password.equals("dev123")){
                System.out.println("Login successful");
                do {

                    System.out.println("1- Deposit\n"+
                            "2- Withdraw money\n" +
                            "3- Show balance\n" +
                            "4- Log out\n" );

                    select = inp.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Price Amount");
                            int price = inp.nextInt();
                            balance += price;
                            System.out.println("Successfully increased");
                            break;
                        case 2:
                            System.out.println("Price Amount");
                            price = inp.nextInt();
                            if(price > balance){
                                System.out.println("Insufficient balance");
                            }else {
                                balance -= price;
                                System.out.println("Successfully you get cash");
                            }
                        case 3:
                            System.out.println("your balance : " + balance);
                            break;
                    }
                }while (select != 4);
                System.out.println("Logged Out");
                break;
            }else {
                right--;
                System.out.println("Username or Password is incorrect. Try again.");
                if (right == 0){
                    System.out.println("Your account is blocked. ");
                }else{
                    System.out.println("Your remaining right: " + right);
                }

            }


        }
    }
}

