public class Product {
    private String name;
    private String description;
    private String picture;
    private  Category category;
    private double price;
    private String unityType;
    private String longDescription;
    private Brand brand;

    public Product (String name, String description, String picture, Category category,int price , String unityType, String longDescription, Brand brand)
    {
        this.name=name;
        this.description=description;
        this.picture=picture;
        this.category=category;
        this.price=price;
        this.unityType=unityType;
        this.longDescription=longDescription;
        this.brand=brand;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public String getPicture()
    {
        return picture;
    }

    public void setPicture(String picture)
    {
        this.picture = picture;
    }

    public Category getCategory()
    {
        return category;
    }

    public void setCategory(Category category)
    {
        this.category = category;
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        this.price = price;
    }

    public String getUnityType()
    {
        return unityType;
    }

    public void setUnityType(String unityType)
    {
        this.unityType = unityType;
    }



    public String getLongDescription()
    {
       return longDescription;
    }

    public void setLongDescription(String longDescription)
    {
        this.longDescription = longDescription;
    }

    public Brand getbrand()
    {
        return brand;
    }
    public void setBrand(Brand brand)
    {
        this.brand = brand;
    }


}