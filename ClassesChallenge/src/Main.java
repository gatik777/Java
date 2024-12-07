import java.util.Locale;

public class Main {

    public static void main(String[] args) {

//        Accounts Account = new Accounts(12345,
//                 500,
//                "Gatik Prasher",
//                "gatikprasher@gmail.com",
//                "9779199800"
//        );

        Accounts gatiksAccount = new Accounts();

        System.out.println(gatiksAccount.getAccountNumber());
        System.out.println(gatiksAccount.getBalance());

        Accounts gatik = new Accounts("Gatik", "gatikprasher@gmail.com", "12345");

        System.out.println("AccountNo: " + gatiksAccount.getPhoneNumber() +
                " ; name " + gatiksAccount.getName());




    }
}