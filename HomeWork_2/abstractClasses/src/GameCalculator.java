public abstract class GameCalculator {
    public abstract  void hesapla();          //Abstrac ise bu methodu her çağırılan yerde hesapla methodunu kendisi Yazmak zorunda


    public final void gameOver(){       //Overide edilen yerde herzaman final methodu ile Aynıdır yani bu Methodu ezemez Değiştiremez
        System.out.println("Oyun Bitti");
    }

}
