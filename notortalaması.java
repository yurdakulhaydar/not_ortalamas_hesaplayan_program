import java.util.Scanner;


public class notortalaması {

 public static void main(String[] args) {
    
    double matv,matf,fzkv,fzkf,kmyv,kmyf,trkv,trkf,trhv,trhf,mzkv,mzkf;
int a=60;

String ogradi;

    Scanner deger = new Scanner(System.in);
    System.out.println("Öğrencinin Adını Giriniz");
    ogradi= deger.next();
    System.out.print("Matematik vize notunu giriniz:");
    matv = deger.nextDouble();
    System.out.print("Matematik final notunu giriniz:");
    matf =deger.nextDouble();
    double mato=(matf+matv)/2;

    System.out.print("Kimya vize notunu giriniz:");
    kmyv = deger.nextDouble();
    System.out.print("Kimya final notunu giriniz:");
    kmyf =deger.nextDouble();
    double kmyo=(kmyf+kmyv)/2;

    System.out.print("Fizik vize notunu giriniz:");
    fzkv = deger.nextDouble();
    System.out.print("Fizik final notunu giriniz:");
    fzkf =deger.nextDouble();
    double fzko=(fzkf+fzkv)/2;

    System.out.print("Türkçe vize notunu giriniz:");
    trkv = deger.nextDouble();
    System.out.print("Türkçe final notunu giriniz:");
    trkf =deger.nextDouble();
    double trko=(trkf+trkv)/2;

    System.out.print("Tarih vize notunu giriniz:");
    trhv = deger.nextDouble();
    System.out.print("Tarih final notunu giriniz:");
    trhf =deger.nextDouble();
    double trho=(trhf+trhv)/2;

    System.out.print("Müzik vize notunu giriniz:");
    mzkv = deger.nextDouble();
    System.out.print("Müzik final notunu giriniz:");
    mzkf =deger.nextDouble();
    double mzko=(mzkf+mzkv)/2;

boolean sonuc = ((mato>=a)&&(fzko>=a)&&(kmyo>=a)&&(trko>=a)&&(trho>=a)&&(mzko>=a));

String str= sonuc ? "Sınıfı Geçti" : "Sınıfta Kaldı";
System.out.println("Matematik Ortalaması:"+mato);
System.out.println("Fizik Ortalaması"+fzko);
System.out.println("Kimya Ortalaması"+kmyo);
System.out.println("Türkça Ortalaması"+trko);
System.out.println("Tarih Ortalaması"+trho);
System.out.println("Müzik Ortalaması"+mzko);
System.out.print(ogradi+"\t"+str);

}    
}

