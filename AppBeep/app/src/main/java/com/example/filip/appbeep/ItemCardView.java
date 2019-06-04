package com.example.filip.appbeep;

public class ItemCardView {

    int background;
    String cardtitle;
    String cardgenero;



    public  ItemCardView(){

    }

    public ItemCardView(int background, String cardtitle, String cardgenero){
            this.background = background;
            this.cardtitle = cardtitle;
            this.cardgenero = cardgenero;
    }

    public int getBackground() {
        return background;
    }

    public String getCardtitle() {
        return cardtitle;
    }

    public String getCardgenero() {
        return cardgenero;
    }

    public void setBackground(int background) {
        this.background = background;
    }

    public void setCardtitle(String cardtitle) {
        this.cardtitle = cardtitle;
    }

    public void setCardgenero(String cardgenero) {
        this.cardgenero = cardgenero;
    }
}
