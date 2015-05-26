package de.dch.cw.rest;

public class CWServer {

    private long id;
    private String content;

    public CWServer(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}