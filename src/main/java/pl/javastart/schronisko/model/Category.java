package pl.javastart.schronisko.model;

import java.util.ArrayList;
import java.util.List;

public enum Category {
    All ("Wszystkie"),
    CATS ("Koty"),
    DOGS ("Psy"),
    OTHER ("Inne");

    private final String categoryName;

    private Category(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return categoryName;
    }

    public static List<String> getCategoryList() {
        List<String> catList = new ArrayList<>();
        for (Category cat: Category.values()) {
            catList.add(cat.categoryName);
        }
        return  catList;
    }
}
