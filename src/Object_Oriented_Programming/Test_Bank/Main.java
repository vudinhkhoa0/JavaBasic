package Object_Oriented_Programming.Test_Bank;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Account[] accountList = new Account[n];
        for (int i = 0; i < n; ++i) { 
            sc.nextLine();
            accountList[i] = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
        }
        int q = sc.nextInt(); 
        for (int i = 0; i < q; ++i) { 
            sc.nextLine();
            String tran = sc.nextLine();
            if (tran.equals("withdraw")) {
                String taiKhoan = sc.next();
                int tien = sc.nextInt();
                int pos = Account.findPos(accountList, taiKhoan);
                accountList[pos].withdraw(tien);
            }
            else if (tran.equals("deposit")) { 
                String taiKhoan = sc.next();
                int tien = sc.nextInt();
                int pos = Account.findPos(accountList, taiKhoan);
                accountList[pos].deposit(tien);
            }
            else { 
                String X = sc.next();
                String Y = sc.next(); 
                int tien = sc.nextInt();
                int pos1 = Account.findPos(accountList, X);
                int pos2 = Account.findPos(accountList, Y);
                if (accountList[pos1].getSoDu() - 50000 >= tien) { 
                    accountList[pos1].withdraw(tien);
                    accountList[pos2].withdraw(tien);
                }
            }
        }
        for (int i = 0; i < n; ++i) 
            System.out.println(accountList[i]);
    }
}
