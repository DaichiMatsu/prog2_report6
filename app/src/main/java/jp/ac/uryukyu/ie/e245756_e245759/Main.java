package jp.ac.uryukyu.ie.e245756_e245759;

import java.util.List;

public class Main {
    public static void main(String[] args){
        HandOutCards cards = new HandOutCards();  // Deckクラスのインスタンスを生成
        List<Integer> hand = cards.getRandomCards(5);
        System.out.println("手札:" + hand);


        ReplaceCards swapCards = new ReplaceCards();  //カード入れ替えのメソッドをSwap_Cardsから呼び出す
        swapCards.replaceCards(cards, hand);


         System.out.println("入れ替え後の手札: " + hand);
    }

    
}
