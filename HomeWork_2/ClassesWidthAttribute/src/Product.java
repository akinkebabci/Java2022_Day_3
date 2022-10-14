public class Product {
    //attiribute | field
    private int _id;
    private String _name;
    private String _description;
    private double _price;
    private int _stockAmount ;
    private String _renk;

    private  String _kod;

    public Product(){

    }

    public Product(int _id, String _name, String _description, double _price, int _stockAmount, String _renk, String _kod) {
        this._id = _id;
        this._name = _name;
        this._description = _description;
        this._price = _price;
        this._stockAmount = _stockAmount;
        this._renk = _renk;
        this._kod = _kod;
    }

    //Getter
    public int getId(){
        return  _id;
    }
    //Setter
    public void setId(int id){
       this._id = id;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String renk) {
        this._renk = renk;
    }

    public String getKod() {
        return this._name.substring(0,1) + _id;
    }

}
