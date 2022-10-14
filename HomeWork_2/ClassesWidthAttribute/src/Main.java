public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(54887);
        product.set_name("Laptop");
        product.set_description("Asus Notebook");
        product.set_price(5000); ;
        product.set_stockAmount(3);
        product.set_renk("sarı");



        ProductManager productManager =new ProductManager();
        productManager.add(product);
        System.out.println(product.getKod());

    }
}