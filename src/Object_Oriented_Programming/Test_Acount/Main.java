package Object_Oriented_Programming.Test_Acount;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        Account[] accountList = new Account[n];
        for (int i = 0; i < n; ++i) { 
            accountList[i] = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
        }
        int q = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < q; ++i) {
            String username = sc.nextLine();
            String password = sc.nextLine();
            boolean check = false; 
            for2 : for (int j = 0; j < n; ++j) {
                if (accountList[i].checkLogin(username, password)) {
                    check = true;
                    break for2;
                }
            }
            if (check) { 
                System.out.println("Login Successful");
            }
            else {
                System.out.println("Login Failed");
            }
        }
    }
}
