package pl.javastart.schronisko.model;

public class Pets {
    private int ID;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pets)) return false;

        Pets pets = (Pets) o;

        if (name != null ? !name.equals(pets.name) : pets.name != null) return false;
        if (info != null ? !info.equals(pets.info) : pets.info != null) return false;
        if (img != null ? !img.equals(pets.img) : pets.img != null) return false;
        return category == pets.category;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (info != null ? info.hashCode() : 0);
        result = 31 * result + (img != null ? img.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        return result;
    }

    public int getID() {
        return ID;
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
