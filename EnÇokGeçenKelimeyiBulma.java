
package com.company;
import java.util.HashMap;
import java.util.Scanner;

public class EnÇokGeçenKelimeyiBulma {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text;
        System.out.println("Metni giriniz : ");
        text = input.nextLine();
        String [] seperate = text.split(" ");
        HashMap<String, Integer> mostUsed = new HashMap<>();

        for(String newText : seperate){
            Integer counter = mostUsed.get(newText);
            if(counter == null){
                mostUsed.put(newText,1);
            }else{
                mostUsed.put(newText, counter + 1);
            }
        }
        String mostUsedWord = null ;
        int maxCount = 0;
        for(String word : mostUsed.keySet()){
            int count = mostUsed.get(word);
            if(count > maxCount){
                maxCount = count;
                mostUsedWord = word;
            }
        }
        System.out.println("En çok geçen kelime : " + mostUsedWord);
        System.out.println("Sayısı : " + maxCount);
    }
}
