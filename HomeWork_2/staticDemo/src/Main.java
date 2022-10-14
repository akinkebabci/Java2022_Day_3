public class Main {
    public static void main(String[] args) {
        Product product = new Product();
        product.name = "Mause";
        product.id =2;
        product.price = 3000;

        ProductMenager productMenager = new ProductMenager();
        productMenager.add(product);

        DataBaseHelper.Curd.delete();
        DataBaseHelper.Connection.createConnettion();
    }
}