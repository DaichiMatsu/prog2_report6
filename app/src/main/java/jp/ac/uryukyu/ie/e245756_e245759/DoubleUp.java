package jp.ac.uryukyu.ie.e245756_e245759;
import java.util.List;
import java.util.Scanner;
public class DoubleUp {   
    public int chooseCard(List<Integer> cards){
        Scanner scanner = new Scanner(System.in);
        int cardnumber = -1; //絶対に使わない数字を入力
        while(true){
            System.out.println("どのカードをめくりますか？(1:1枚目, 2:2枚目, 3:3枚目, 4:4枚目)");
            cardnumber = scanner.nextInt(); 
            if(cardnumber == 1){
                System.out.println(cards.get(1));
                return 1;
            } else if(cardnumber == 2){
                System.out.println(cards.get(2));
                return 2;
            } else if(cardnumber == 3){
                System.out.println(cards.get(3));
                return 3;
            } else if(cardnumber == 4){
                System.out.println(cards.get(4));
                return 4;
            } else{
                System.out.println("無効なワードです。もう一度カードを指定してください");
                    
            }
            
        }

        
    } 
    public static void isDoubleUp(){
        
    }
}
