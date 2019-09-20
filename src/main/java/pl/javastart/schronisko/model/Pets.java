package pl.javastart.schronisko.model;

public class Pets {
    private String name;
    private String info;
    private String img;
    private Category category;

    public Pets() {
    }

    public Pets(String name, String info, String img, Category category) {
        this.name = name;
        this.info = info;
        this.img = img;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
