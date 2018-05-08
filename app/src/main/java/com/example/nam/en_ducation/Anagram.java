package com.example.nam.en_ducation;

import java.util.Random;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
/**
 * Created by nolog on 4/6/2018.
 */

public class Anagram {
    public static final Random RANDOM=new Random();
    Integer[] mAnagram  ={
            R.drawable.m200,
            R.drawable.m205,
            R.drawable.m204,
            R.drawable.m203,
            R.drawable.m202,
            R.drawable.m201,
            R.drawable.m209,
            R.drawable.m207,
            R.drawable.m206,
            R.drawable.m214,
            R.drawable.m212,
            R.drawable.m210,
    };
    public static final String[] WORDS ={"APPLE","BANANA","PEAR","GRAPE","CHERRY",
            "ORANGE","PEACH","PINEAPPLE","WATERMELON","KIWI","COCONUT","MANGO"};



    public static String randomWord(){
        return WORDS[RANDOM.nextInt(WORDS.length)];
            }
    public static String shuffleWord(String word){
        if (word !=null && !"".equals(word)){
            char a[] = word.toCharArray();
            for (int i=0;i<a.length;i++){
                int j = RANDOM.nextInt(a.length);
                char tmp=a[i];
                a[i]=a[j];
                a[j]=tmp;
            }
            return new String(a);
        }
        return word;
    }
    public  Integer getAnagram(int a){
       // int a=12;
        Integer mAnagrams =mAnagram[a];
        return mAnagrams;
    }
    public String getWORDS(int a){
        String answer =WORDS[a];
        return answer;
    }

}
