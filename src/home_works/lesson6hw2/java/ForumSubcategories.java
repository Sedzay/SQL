package home_works.lesson6hw2.java;

import java.util.Date;

public class ForumSubcategories {
    private long id;
    private ForumCategories forumCategories;
    private String title;
    private String description;
    private Date dateSubcategory;
    private String ip;

    public ForumSubcategories(long id, ForumCategories forumCategories, String title, String description, Date dateSubcategory, String ip) {
        this.id = id;
        this.forumCategories = forumCategories;
        this.title = title;
        this.description = description;
        this.dateSubcategory = dateSubcategory;
        this.ip = ip;
    }
}
