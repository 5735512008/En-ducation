package com.example.nam.en_ducation;


public class Question5 {
    Integer[] mQuestion5 ={
            R.drawable.eng401,
            R.drawable.eng402,
            R.drawable.eng403,
            R.drawable.eng404,
            R.drawable.eng405,
            R.drawable.eng406,
            R.drawable.eng407,
            R.drawable.eng408,
            R.drawable.eng409,
            R.drawable.eng410,
            R.drawable.eng411,
            R.drawable.eng412,
            R.drawable.eng413,
            R.drawable.eng414,
            R.drawable.eng415,
            R.drawable.eng416,
            R.drawable.eng417,

         };
    private String mChoices5[][]={
            {"tiger","Rabbit","Cow","Lion"},
            {"Rabbit","Pig","Chicken","Bear"},
            {"Bear","Monkey","Bird","fish"},
            {"Cat","Bird","Rat","Chicken"},
            {"Chicken","Rat","Lion","Snake"},

            {"Dog","Chicken","Cow","Horse"},
            {"Rabbit","Pig","Elephant","Cow"},
            {"Whale","Dog","Cat","fish"},
            {"Bird","Elephant","Monkey","Pig"},
            {"Lion","Horse","Cow","tiger"},

            {"Elephant","fish","tiger","Rat"},
            {"Monkey","Cat","Whale","Bird"},
            {"Cat","Lion","Chicken","Whale"},
            {"tiger","Snake","Bear","Monkey"},
            {"Monkey","Whale","Snake","Lion"},

            {"Dog","fish","Horse","Rabbit"},
            {"Horse","Lion","Bird","Elephant"},

    };

    private  String mCorrectAnswers[]={ "Cow","Pig","Bear","Rat","Snake",  "Dog","Rabbit","Cat","Monkey","Lion",  "fish","Bird","Chicken","tiger","Whale",  "Horse","Elephant",};
    public  Integer getQuestion5(int a){
        Integer question2 =mQuestion5[a];
        return question2;
    }
    public  String getChoice1(int a){
        String choice =mChoices5[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice =mChoices5[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice =mChoices5[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice =mChoices5[a][3];
        return choice;
    }
    public String getCorrectAnswer5(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }
}
