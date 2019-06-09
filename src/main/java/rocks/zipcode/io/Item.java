package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    private Long id;
    private String name;
    private Double price;
    public Item() {
        id = 0L;
        name = "";
        price = 0.01;
    }

    public Item(Long id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;

    }

    public String getName() {

        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {

        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPrice() {

        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    /*public int compareTo(Item o2) {
        if(id > o2.id) {
            return 1;
        }
        else if(id < o2.id) {
            return -1;
        }
        return 0;
    }*/
}
