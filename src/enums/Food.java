package enums;

public enum Food {
    MEAT_POULSTRY(300,"Meat poulstry"),
    FISH_SEAFOOF(950,"fish seafoof"),
    WATER(50,"water"),
    TASTY(400,"tasty");
    private int price;
    private  String name;

    Food(int price, String name) {
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Food{" +"\n"+
                "price=" + price +"\n"+
                ", name='" + name + '\'' +"\n"+
                "----------------------------"+
                '}';

    }
}
