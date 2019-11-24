public class Category {

    private String name;
    private String description;
    private String color;

    public Category(String name, String description, String color){
        this.name= name;
        this.description=description;
        this.color=color;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setColor(String color) {
        this.color = color;
    }

}

