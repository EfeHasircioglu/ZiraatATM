import java.util.ArrayList;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Bank {
    ArrayList<Account> hesaplar = new ArrayList<>();
    public void hesapOluştur(){
        try {
        System.out.println("---HESAP OLUSTURMA---");
        Scanner sc = new Scanner(System.in);
        System.out.println("Hesap Adı:"); 
        String hesapAdi = sc.nextLine();
        System.out.println("Hesap Numarası:"); 
        int hesapNo = sc.nextInt();
        Account newAccount = new Account(hesapNo,hesapAdi);
       hesaplar.add(newAccount);
        System.out.println("Hesabınız kaydedilmistir. \n HESAP BILGILERI \n --Hesap No: " + hesapNo + "\n --Hesap Adı: " + hesapAdi);
    }
    catch (NoSuchElementException nse) {
        System.out.println("SISTEMSEL HATA!");
    } 

    }

    public void hesaplariListele(){
        try{
           
            System.out.println("---\nBUTUN HESAPLARINIZ");
            if (hesaplar.isEmpty()){
                System.out.println("Henüz bir hesabiniz bulunmamaktadir."); // aslında gereksiz ve çalışmıyor????
            }
        for (Account account : hesaplar) {        
                System.out.println(account);         
        }

    }
    catch (NullPointerException e){
    System.out.println("SISTEMSEL HATA!" + e); //Potansiyel bir hataya karşı
   }
    }
    private Account findAccount(int accountNumber) {
        for (Account account : hesaplar) {
            if (account.accountNumber == accountNumber) {
                return account;
            }
        }
        return null; // Hesap olmadığı zmn
    }
    public void hesapBul(){
        try{
        Scanner sc2=new Scanner(System.in);
        System.out.println("Bulunacak Hesap No: ");
        int bHesapNo = sc2.nextInt();
        boolean bulundu = false;
        for (Account acc : hesaplar ){
            if (acc.accountNumber == bHesapNo){
                System.out.println("Hesap adı: " + acc.accountHolderName + "\n Bakiye: " + acc.balance);
                bulundu = true;
                break;
            }
            else{
                System.out.println("HESAP BULUNAMADI.");
                continue;
            }
        }
    } catch (NoSuchElementException e){
        System.out.println("SISTEMSEL HATA! " + e );
    }
    }
    public void hesabaParaYukle(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hesap No: ");
        int yNo = sc.nextInt();
        System.out.println("Miktar? ");
        int mik = sc.nextInt();

        Account acc = findAccount(yNo);
        if (acc != null) {
            acc.paraYukle(mik);
        }
        else if (acc == null){
            System.out.println("HESAP BULUNAMADI.");
        }
        
    }
    public void hesaptanParaCek(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hesap No: ");
        int yNo = sc.nextInt();
        System.out.println("Miktar? ");
        int mik = sc.nextInt();

        Account acc = findAccount(yNo);
        if (acc != null) {
            acc.paraCek(mik);
        }
        else if (acc == null){
            System.out.println("HESAP BULUNAMADI.");
        }
        
    }
    public void hesapBakiyeSorgula(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hesap No: ");
        int yNo = sc.nextInt();
        Account acc = findAccount(yNo);
        if (acc != null) {
            acc.bakiyeSorgula();
        }
        else if (acc == null){
            System.out.println("HESAP BULUNAMADI.");
        }    }

}
