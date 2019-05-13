package home_works.lesson6hw2.java;

import java.util.Date;

public class ForumPosts {
    private long id;
    private ForumSubcategories forumSubcategories;
    private Users users;
    private ForumPosts forumPosts;
    private String title;
    private String content;
    private boolean isPool;
    private Date datePost;
    private String ip;

    public ForumPosts(long id, ForumSubcategories forumSubcategories, Users users, ForumPosts forumPosts, String title, String content, boolean isPool, Date datePost, String ip) {
        this.id = id;
        this.forumSubcategories = forumSubcategories;
        this.users = users;
        this.forumPosts = forumPosts;
        this.title = title;
        this.content = content;
        this.isPool = isPool;
        this.datePost = datePost;
        this.ip = ip;
    }
}
