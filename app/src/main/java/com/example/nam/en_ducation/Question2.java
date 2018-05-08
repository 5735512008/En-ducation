package com.example.nam.en_ducation;


public class Question2 {
    Integer[] mQuestion2 ={
            R.drawable.num61,
            R.drawable.num62,
            R.drawable.num63,
            R.drawable.num64,
            R.drawable.num65,
            R.drawable.num66,
            R.drawable.num67,
            R.drawable.num68,
            R.drawable.num69,
            R.drawable.num70,
            R.drawable.num71,

         };
    private String mChoices2[][]={
            {"Yellow","Black","Orange","Brown"},
            {"Brown","Purple","Pink","Blue"},
            {"Blue","Gray","Red","Green"},
            {"Red","Blue","Orange","Yellow"},
            {"White","Green","Gray","Pink"},

            {"Orange","Black","Brown","Blue"},
            {"Yellow","Purple","Brown","Green"},
            {"Gray","Purple","Yellow","Red"},
            {"Green","Black","Brown","Red"},
            {"Brown","Black","Gray","Purple"},

            {"Blue","Orange","Pink","Brown"},


    };

    private  String mCorrectAnswers[]={ "Yellow","Purple","Red","Orange","White"   ,"Blue","Green","Gray","Black","Brown"   ,"Pink",};
    public  Integer getQuestion1(int a){
        Integer question2 =mQuestion2[a];
        return question2;
    }
    public  String getChoice1(int a){
        String choice =mChoices2[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice =mChoices2[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice =mChoices2[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice =mChoices2[a][3];
        return choice;
    }
    public String getCorrectAnswer2(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }
}
