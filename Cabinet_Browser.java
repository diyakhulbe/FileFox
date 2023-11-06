package com.example.filefox;

import javafx.beans.property.BooleanProperty;
import javafx.beans.property.SimpleBooleanProperty;
public class Cabinet_Browser {
    private final BooleanProperty select;
    private final String documentName;

    public Cabinet_Browser(String documentName, boolean select) {
        this.documentName = documentName;
        this.select = new SimpleBooleanProperty(select);
    }

    public BooleanProperty selectProperty() {
        return select;
    }

    public boolean isSelect() {
        return select.get();
    }

    public void setSelect(boolean select) {
        this.select.set(select);
    }

    public String getDocumentName() {
        return documentName;
    }
}