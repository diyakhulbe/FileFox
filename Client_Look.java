package com.example.filefox;
public class Client_Look {
    private String name;
    private String client;
    private String engagement;

    public Client_Look(String name, String client, String engagement) {
        this.name = name;
        this.client = client;
        this.engagement= engagement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getEngagement() {
        return engagement;
    }

    public void setEngagement(String en) {
        this.engagement = engagement;
    }
}
