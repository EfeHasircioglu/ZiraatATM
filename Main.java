import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Account ac = new Account();
        Bank bank = new Bank();
        System.out.println("ZIRAATE HOS GELDINIZ...");
        while (true){
        Scanner scan = new Scanner(System.in);
        System.out.println("YAPACAGINIZ ISLEMI SECIN \n 1 PARA YUKLE \n 2 PARA CEK \n 3 BAKIYE SORGULA \n 4 HESAP OLUSTUR  \n 5 BUTUN HESAPLARI GOR \n 6 HESAP ARA \n 0 CIKIS YAP");
        int islem= scan.nextInt();
        if (islem == 1) {
            bank.hesabaParaYukle();
        }
        else if (islem == 2) {
            bank.hesaptanParaCek();
        }
        else if (islem == 3) {
            bank.hesapBakiyeSorgula();
                }
        else if (islem == 4) {
            bank.hesapOluştur();        
        }
        else if (islem == 5) {
            bank.hesaplariListele();
        }
        else if (islem == 6){
            bank.hesapBul();
        }
        else if (islem == 0) {
            System.out.println("GORUSURUZ BIR DAHA BEKLERIZ ZIRAAT BANK!");
            break;
        }
}
    }
}