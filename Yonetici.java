public class Yonetici extends Calisan{
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }

    @Override
    public void Bilgileri_Goster() {
        super.Bilgileri_Goster();
        System.out.println("Yöneticinin sorumlu olduğu kişi sayısı"+sorumlu_kisi_sayisi);
    }
    public void Zam_yap(int Zammiktari){

        System.out.println(getAd()+"calisanlara"+Zammiktari+"zam yapıyor");

    }
}
