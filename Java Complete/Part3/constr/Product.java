class Product{
    int id;
    String product_Name;
    Product(int id, String product_Name){
        System.out.println("const exe automatically");
        this.id = id;
        this.product_Name = product_Name;
    }
    public static void main(String[] args){

    Product p1 = new Product(101, "Iphone 5s");
    //System.out.println(p1.id);
    //System.out.println(p1.product_Name);
    }
    
}