package io;

import java.util.Date;

public class ServerInfo {
    private String id;
    private Date date;

    public ServerInfo(String id, Date date) {
        this.id = id;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ServerInfo{" +
                "id='" + id + '\'' +
                ", date=" + date +
                '}';
    }
}
