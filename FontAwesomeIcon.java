package com.example.filefox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
public class FontAwesomeIcon extends Text {
    public FontAwesomeIcon(String iconCode, double size ) {
        Font fontAwesomeFont = Font.loadFont(getClass().getResourceAsStream("/fontawesome-webfont.ttf"), size);
        setFont(fontAwesomeFont);
        setText(iconCode);
    }
}