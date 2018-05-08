package com.example.nam.en_ducation;


public class Question3 {
    Integer[] mQuestion3 ={
            R.drawable.num31,
            R.drawable.num32,
            R.drawable.num33,
            R.drawable.num34,
            R.drawable.num35,
            R.drawable.num36,
            R.drawable.num37,
            R.drawable.num38,
            R.drawable.num39,
            R.drawable.num40,
            R.drawable.num41,
            R.drawable.num42,

         };
    private String mChoices3[][]={
            {"Star","Heart","Square","Hexagon"},
            {"Oval","Square","Triangle","Star"},
            {"Pentagon","Heart","Circle","Cylinder"},
            {"Triangle","Diamond","Hexagon","Heart"},
            {"Hexagon","Rectangle","Circle","Triangle"},

            {"Rectangle","Square","Pentagon","Diamond"},
            {"Cylinder","Diamond","Heart","Star"},
            {"Trapezoid","Circle","Ellipse","Triangle"},
            {"Square","Hexagon","Trapezoid","Diamond"},
            {"Pentagon","Oval","Hexagon","Circle"},

            {"Heart","Cylinder","Rectangle","Diamond"},
            {"Star","Ellipse","Trapezoid","Rectangle"},

    };

    private  String mCorrectAnswers[]={ "Star","Square","Circle","Heart","Triangle"   ,"Rectangle","Diamond","Ellipse","Hexagon","Pentagon"   ,"Cylinder","Trapezoid",};
    public  Integer getQuestion1(int a){
        Integer question2 =mQuestion3[a];
        return question2;
    }
    public  String getChoice1(int a){
        String choice =mChoices3[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice =mChoices3[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice =mChoices3[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice =mChoices3[a][3];
        return choice;
    }
    public String getCorrectAnswer2(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }
}
