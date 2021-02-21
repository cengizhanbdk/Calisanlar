public class Yazilimci extends Calisan{
    private String diller;

    public Yazilimci(String ad, String soyad, int id, String diller) {
        super(ad, soyad, id);
        this.diller = diller;



    }
    public void formatAt(String isletim_sistemi){

        System.out.println(getAd()+""+isletim_sistemi+"yüklüyor");


    }

    @Override
    public void Bilgileri_Goster() {
        super.Bilgileri_Goster();
        System.out.println("Yazılımcının bildiği diller:"+diller);
    }
}
