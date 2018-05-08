package com.example.nam.en_ducation;


public class Question6 {
    Integer[] mQuestion6 ={
            R.drawable.eng501,
            R.drawable.eng502,
            R.drawable.eng503,
            R.drawable.eng504,
            R.drawable.eng505,
            R.drawable.eng506,
            R.drawable.eng507,
            R.drawable.eng508,
            R.drawable.eng509,
            R.drawable.eng510,
            R.drawable.eng511,
            R.drawable.eng512,
            R.drawable.eng513,
            R.drawable.eng514,
            R.drawable.eng515,

         };
    private String mChoices6[][]={
            {"banana","potato","cherry","rose apple"},
            {"grape","apple","orange","kiwi"},
            {"rose apple","guava","cherry","durian"},
            {"pineapple","grape","potato","guava"},
            {"corn","orange","lychee","banana"},

            {"cherry","lychee","coconut","kiwi"},
            {"guava","grape","durian","potato"},
            {"banana","durian","rose apple","cherry"},
            {"lychee","kiwi","cherry","pineapple"},
            {"apple","rose apple","grape","corn"},

            {"pineapple","kiwi","apple","grape"},
            {"durian","orange","kiwi","coconut"},
            {"kiwi","coconut","lychee","durian"},
            {"apple","corn","kiwi","potato"},
            {"grape","durian","mangosteen","apple"},

    };

    private  String mCorrectAnswers[]={ "banana","apple","cherry","pineapple","corn",  "coconut","guava","durian","kiwi","rose apple", "grape","orange","lychee","potato","mangosteen",};
    public  Integer getQuestion6(int a){
        Integer question6 =mQuestion6[a];
        return question6;
    }
    public  String getChoice1(int a){
        String choice =mChoices6[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice =mChoices6[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice =mChoices6[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice =mChoices6[a][3];
        return choice;
    }
    public String getCorrectAnswer6(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }
}
