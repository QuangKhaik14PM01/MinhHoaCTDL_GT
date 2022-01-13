package oo;

public class accountTestDrive {
    public static void main(String[] args) {
       //biến tham chiếu đối tượng
        account account;
        account = new account();

        account.show();
        account.deposit();
        account.show();
        account.withraw();
        account.show();
    }
}
