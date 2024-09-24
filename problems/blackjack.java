

class blackjack {
    public static boolean winnerBlackjack(String[] playerCards, String[] houseCards){
        // 関数を完成させてください
        int playerCardsTotal = getTotalOfCards(playerCards);
        int houseCardsTotal = getTotalOfCards(houseCards);

        return checkWinner(playerCardsTotal,houseCardsTotal);
    }

    public static boolean checkWinner(int player, int house){
        if(player > 21) return false;
        else if(house < 22 && player < house) return false;
        else if(house == player) return false;
        return true;
    }

    public static int getTotalOfCards(String[] cards){
        int total = 0;
        for(int i=0;i<cards.length;i++){
            int cardNum = getCardNum(cards[i]);
            total += cardNum;
        }
        return total;
    }

    public static int getCardNum(String card){
        card = card.substring(1);
        if(card.charAt(0) == 'A') card = "1";
        else if(card.charAt(0) == 'J') card = "11";
        else if(card.charAt(0) == 'Q') card = "12";
        else if(card.charAt(0) == 'K') card = "13";

        return Integer.parseInt(card);
    }

    public static void main(String args[]){
        String[] house = new String[]{"♥6","♥K","♣5","♥K"};
        String[] player = new String[]{"♥2","♣A","♣8","♥7","♥3"};
        // ["♥2","♣A","♣8","♥7","♥3"],["♥6","♥K","♣5","♥K"]
        System.out.println(winnerBlackjack(player,house));
    }
}
