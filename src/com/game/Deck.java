package com.game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck implements Comparable<Deck>
{
        private Deck()
        {
        	
        }

        public enum CARDNUMBER
        {
                TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), JACK(11), QUEEN(12), KING(13), ACE(
                                14);

                private int ord;
                
                private CARDNUMBER(int i)
                {
                        this.ord = i;
                }

                
                public int getOrd()
                {
                        return ord;
                }
        }

        public enum CARDTYPE
        {
                CLUB, DIAMOND, HEARTS, SPADE;
        }

        private CARDNUMBER cardNumber;
        private CARDTYPE cardType;

        public CARDNUMBER getCardNumber()
        {
                return cardNumber;
        }

        public CARDTYPE getCardType()
        {
                return cardType;
        }

        public static List<Deck> getPackOfCards()
        {
                List<Deck> cardList = new ArrayList<Deck>();

                for (CARDTYPE types : CARDTYPE.values())
                {
                        for (CARDNUMBER cNums : CARDNUMBER.values())
                        {
                        	Deck d = new Deck();
                                d.cardNumber = cNums;
                                d.cardType = types;
                                cardList.add(d);
                        }
                }
                return cardList;
        }

        public static void shuffleCards(List<Deck> cards)
        {
                Collections.shuffle(cards);
        }

        @Override
        public int compareTo(Deck o)
        {
                if (this.getCardNumber() == o.getCardNumber())
                {
                        return 0;
                }
                else if (this.getCardNumber().getOrd() > o.getCardNumber().getOrd())
                {
                        return 1;
                }
                else
                        return -1;
        }

        @Override
        public String toString()
        {
                return "CARD [cdNumber=" + cardNumber + ", cdType=" + cardType + "]";
        }
}

