public class Main {
    public static void main(String[] args) {
        DortIslem dortIslem = new DortIslem();
        int toplama = dortIslem.topla(5,5);
        System.out.println(toplama);

        //Overloading yapmış olduk
        int toplama1 = dortIslem.topla(2,3,4);
        System.out.println(toplama1);
    }
}