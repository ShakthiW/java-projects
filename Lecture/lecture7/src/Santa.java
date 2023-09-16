public class Santa {
    private String name;
    private String toy_code;
    private double price;
    private String gender;
    private String category;
    private int stock;

    public Santa(String name, String toy_code, double price, String gender, String category, int stock) {
        this.name = name;
        this.toy_code = toy_code;
        this.price = price;
        this.gender = gender;
        this.category = category;
        this.stock = stock;
    }

    public void createToy(int number){
        this.stock = this.stock+number;
    }

    public void sellToy(int number){
        this.stock = this.stock-number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String print(String toy_number) {
        System.out.print(toy_number + ": ");
        return "{" +
                "name='" + name + '\'' +
                ", toy_code=" + toy_code +
                ", price=" + price +
                ", gender='" + gender + '\'' +
                ", category='" + category + '\'' +
                ", stock=" + stock +
                '}';
    }




}
