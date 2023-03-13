package DeveloperTeam.Model.Entity;

import DeveloperTeam.Application.AskParameter;

public class Flower implements IArticle {

    private int id;
    private String name;
    private String colour; //podria ser int
    private float price;

    public Flower(int id, String name, String colour, float price) {
        this.id = id;
        this.name = name;
        this.colour = colour;
        this.price = price;
    }

    public Flower(){
        this.id = AskParameter.askInteger("Introduce the id");
        this.name = AskParameter.askString("Introduce the name");
        this.colour = AskParameter.askString("Introduce the Colour");
        this.price = AskParameter.askFloat("Introduce the Price");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Flower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
}
