public class Gadget {

    private String name;
    private int priceTag;

    public Gadget(String name, Integer priceTag) {
        this.name = name;
        this.priceTag = priceTag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPriceTag() {
        return priceTag;
    }

    public void setPriceTag(int priceTag) {
        this.priceTag = priceTag;
    }
}