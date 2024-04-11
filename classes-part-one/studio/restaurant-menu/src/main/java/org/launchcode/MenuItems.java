public class MenuItem {
    private String name;
    private String description;
    private double price;
    private boolean vegan;
    private int[] spiceLvl = {1,2,3,4,5};
    private String category;

    public MenuItem(String aName, String aDescription, double aPrice, boolean isVegan, int[] isSpicy, String aCategory) {
        name = aName;
        description = aDescription;
        price = aPrice;
        vegan = isVegan;
        spiceLvl = isSpicy;
        category = aCategory;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegan() {
        return vegan;
    }

    public int[] getSpiceLvl() {
        return spiceLvl;
    }

    public void setSpiceLvl(int[] spiceLvl) {
        this.spiceLvl = spiceLvl;
    }
    public void getCategory() {
        return category;
    }
}