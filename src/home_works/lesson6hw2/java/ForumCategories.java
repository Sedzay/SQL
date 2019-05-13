package home_works.lesson6hw2.java;

import java.util.Date;

public class ForumCategories {
    private long id;
    private String title;
    private String description;
    private Date dateCategory;
    private String ip;

    public ForumCategories(long id, String title, String description, Date dateCategory, String ip) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dateCategory = dateCategory;
        this.ip = ip;
    }
}
