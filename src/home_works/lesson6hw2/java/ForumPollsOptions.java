package home_works.lesson6hw2.java;

import java.util.Date;

public class ForumPollsOptions {
    private long id;
    private ForumPosts forumPosts;
    private String title;
    private Date datePollOptions;

    public ForumPollsOptions(long id, ForumPosts forumPosts, String title, Date datePollOptions) {
        this.id = id;
        this.forumPosts = forumPosts;
        this.title = title;
        this.datePollOptions = datePollOptions;
    }
}
