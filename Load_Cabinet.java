package com.example.filefox;

public class Load_Cabinet {
    private String cabinet;
    private String file;
    private String client;

    public Load_Cabinet(String cabinet, String file, String client) {
        this.cabinet = cabinet;
        this.file = file;
        this.client = client;
    }

    public String getCabinet() {
        return cabinet;
    }

    public void setCabinet(String cabinet) {
        this.cabinet = cabinet;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}

