public class Main {
    public static void main(String[] args){
     /*   WomanGamerCalculator womanGamerCalculator = new WomanGamerCalculator();
        womanGamerCalculator.hesapla();
        womanGamerCalculator.gameOver();*/


        //abstrack sınıflar asla New lenemez
        GameCalculator gameCalculator = new WomanGamerCalculator();
        gameCalculator.hesapla();
        gameCalculator.gameOver();


    }
}
