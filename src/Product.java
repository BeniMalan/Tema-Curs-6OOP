 class Product {
     private String name;
     private int price;
     private int quantity;
     private String category;
     private int isStock;
     private String isCategory;

    public Product(String name, int price, int quantity, String category, int isStock, String isCategory) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.isStock = isStock;
        this.isCategory = isCategory;

    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean isStock() {
        if (getQuantity() != 0){
            return true;
        }
        return false;
    }

    public boolean isCategory() {
        if (getCategory()=="sucuri") {
            return true;
        } else {
            return false;
        }
    }
}
