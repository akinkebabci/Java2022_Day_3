public class ProductValidator {
    static {
        //STATİC constructor sadece static blokların içinde çalışır
        System.out.println("static Yapıcı Blok çalıştı");
    }
    public ProductValidator(){
        System.out.println("Yapıcı Blok Çalıştı");
    }
    public static boolean isValid(Product product){         //Static Bu methodu başka yerlerde newlemeden kullanmak için
        if (product.price>0 && !product.name.isEmpty()){
            return  true;

        }else {
            return  false;
        }
    }

    //Ana clas static olamaz fakat Class İçerside class ıoluşturulur onu içersinde Static method oluşturulabilir
    //İnner Class
    public static class BaskaBirClass{
        public static void sil(){

        }

    }
}
