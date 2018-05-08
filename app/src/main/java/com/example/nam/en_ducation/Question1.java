package com.example.nam.en_ducation;


public class Question1 {
    Integer[] mQuestion1 ={
            R.drawable.num01,
            R.drawable.num02,
            R.drawable.num03,
            R.drawable.num04,
            R.drawable.num05,
            R.drawable.num06,
            R.drawable.num07,
            R.drawable.num08,
            R.drawable.num09,
            R.drawable.num010,
            R.drawable.num11,
            R.drawable.num12,
            R.drawable.num14,
            R.drawable.num15,
            R.drawable.num16,
            R.drawable.num18,
            R.drawable.num19,
            R.drawable.num13,
            R.drawable.num17,
            R.drawable.num20,
         };
    private String mChoices1[][]={
            {"One","Two","Ten","Zero"},
            {"Twelve","Two","twenty","Four"},
            {"Thirteen","Ten","Three","Thirty"},
            {"Five","Fifty","Six","Four"},
            {"Fifty","Five","three","forty"},

            {"Six","Seven","Five","Sixty"},
            {"Eight","Nine","Seven","One"},
            {"Eighteen","Eight","Eightty","Nine"},
            {"Ten","Eleven","Eight","Nine"},
            {"Zero","Nine","Eleven","Ten"},

            {"Thirteen","Zero","Eleven","One"},
            {"Eighteen","Twelve","Two","Seven"},
            {"Fourteen","Thirty","Twelve","Thirteen"},
            {"Sixteen","twenty","Sixty","Fifteen"},
            {"Nine","Four","Sixteen","One"},

            {"Fifteen","Eightteen","Eleven","Eight"},
            {"Nineteen","Sixteen","Thirty","Zero"},
            {"Fourteen","Thirty","Twelve","Thirteen"},
            {"Seventeen","Eightteen","Eleven","Eight"},
            {"Twenty","Sixteen","Thirty","Zero"},


    };

    private  String mCorrectAnswers[]={ "One","Two","Three","Four","Five"   ,"Six","Seven","Eight","Nine","Ten"   ,"Eleven","Twelve","Fourteen","Fifteen","Sixteen",   "Eightteen","Nineteen","Thirteen","Seventeen","Twenty",};
    public  Integer getQuestion1(int a){
        Integer question1 =mQuestion1[a];
        return question1;
    }
    public  String getChoice1(int a){
        String choice =mChoices1[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice =mChoices1[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice =mChoices1[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice =mChoices1[a][3];
        return choice;
    }
    public String getCorrectAnswer1(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }
}
