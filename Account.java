public class Account {
    int accountNumber;
    String accountHolderName;
    int balance;

    public Account(int _accountNumber, String _accountHolderName){
        this.accountNumber = _accountNumber;
        this.accountHolderName = _accountHolderName;
        this.balance =0;
    }

    public Account() {
        //TODO Auto-generated constructor stub
    }
     @Override 
    public String toString() {
        return  "" +
                "Hesap Numarası: " + accountNumber +"\n" + 
                "Hesap Sahibi: " + accountHolderName + "\n" +
                "Hesap Bakiyesi: " + balance + "\n"
                 ;
     
}
    public void paraYukle(int miktar){
        try{
         if (miktar <= 0){
            System.out.println("GECERSIZ BAKIYE GIRIŞI! TEKRAR GIRINIZ!");
        } else {
        balance += miktar;  
        System.out.println("Paranız yüklenmistir.");  
    }
} catch (Exception e) {
    System.out.println("PROGRAMDA HATA VAR! = " + e);
} 
    }
    public void paraCek(int miktar){
        try {

         if (balance <= miktar){
            System.out.println("BU KADAR PARANIZ YOK HAHA FAKIR!");
        }
        else if (miktar <= 0){
            System.out.println("GECERSIZ MIKTAR");
        }
         else {
        balance -= miktar;
    }
}
catch (Exception e) {
    System.out.println(e + " PROGRAMDA HATA VAR ZIRAAT ATM!");
} 

    
    }

    public void bakiyeSorgula(){
        System.out.println(balance + " TL BAKIYENIZ BULUNMAKTADIR!");
    }
}
