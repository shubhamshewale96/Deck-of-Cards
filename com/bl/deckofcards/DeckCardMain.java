package com.bl.deckofcards;

import java.util.Arrays;
import java.util.Scanner;

public class DeckCardMain {

	public static void main(String[] args) {

        //Array of all the cards with the face type have been declared.
        String shape[]={"Spades","Clubs","Diamond","Heart"};
        String rank[]={"2","3","4","5","6","7","8","9","10","Jack","Queen","King","Ace"};
        //Number of Players
        System.out.print("Enter the Number of player's:");
        Scanner sc=new Scanner(System.in);
        int player_num=sc.nextInt();
        Player object[]=new Player[player_num];
        //Object from the player class has been initialized.
        if(player_num<2||player_num>4)
        {
            System.out.println("Minimum Players are 2 and Maximum are 4");
        }
        else
        {
            for(int i=0;i<player_num;i++)
            {
                object[i]=new Player();
            }
        }
        //A 2D Array has been initialized.
        int[][] combinations=new int[4][13];
        for(int index1=0;index1<4;index1++) {
            for(int index2=0;index2<13;index2++) {
                combinations[index1][index2]=0;
            }
        }

        //Check on a random basis that each and every player gets only 9 cards.
        int distributed_cards=player_num*9;
        for(int check=0;check<distributed_cards;check++) {
            int index1=(int)(Math.random()*3);

            int index2=(int)(Math.random()*12);

            if(combinations[index1][index2]==0) {

                //Storing the value in  Object array created from player class.
                object[check%player_num].getCards(rank[index2]+" of "+shape[index1]);
                combinations[index1][index2]=1;
            }
            else
            {
                check--;
            }
        }

        //Printing the sorted value stored in linked list after applying the queue method.
        for(int index=0;index<player_num;index++) {
            System.out.print("Player "+(index+1)+"  :  ");
            object[index].queue.print();
            System.out.println();
        }
    }
}
