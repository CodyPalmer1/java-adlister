package javabeans;

import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private Author author;
    private String content;

    public Quote(){}

    public Quote(Author author, long author_id, String content) {
        this.author = author;
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
