package home_works.lesson6hw2.java;

import java.util.Date;

public class ForumPollsOptionsVotes {
    private long id;
    private ForumPollsOptions forumPollsOptions;
    private Users users;
    private Date datePollOptionVote;
    private String ip;

    public ForumPollsOptionsVotes(long id, ForumPollsOptions forumPollsOptions, Users users, Date datePollOptionVote, String ip) {
        this.id = id;
        this.forumPollsOptions = forumPollsOptions;
        this.users = users;
        this.datePollOptionVote = datePollOptionVote;
        this.ip = ip;
    }
}
