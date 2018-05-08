package com.example.nam.en_ducation;

import android.media.MediaPlayer;
import android.widget.ImageView;

/**
 * Created by nolog on 18/9/2560.
 */

public class Question {

    Integer[] mQuestion ={
            R.drawable.ga1,
            R.drawable.ga2,
            R.drawable.ga3,
            R.drawable.ga4,
            R.drawable.ga5,
            R.drawable.ga6,
            R.drawable.ga7,
            R.drawable.ga8,
            R.drawable.ga9,
            R.drawable.ga10,
            R.drawable.ga11,
            R.drawable.ga12,
            R.drawable.ga13,
            R.drawable.ga14,
            R.drawable.ga15,
            R.drawable.ga16,
            R.drawable.ga17,
            R.drawable.ga18,
            R.drawable.ga19,
            R.drawable.ga20,
            R.drawable.ga21,
            R.drawable.ga22,
            R.drawable.ga23,
            R.drawable.ga24,
            R.drawable.ga25,
            R.drawable.ga26,
            R.drawable.ga27,

    };
    private String mChoices[][]={
            {"C","D","E","F"},
            {"D","B","F","E"},
            {"I","K","L","P"},
            {"Q","O","K","R"},
            {"A","B","C","F"},

            {"F","A","D","I"},
            {"V","X","W","U"},
            {"V","S","X","Q"},
            {"Q","T","O","S"},
            {"O","Q","L","K"},

            {"K","I","G","M"},
            {"S","T","W","U"},
            {"D","G","E","A"},
            {"A","B","C","G"},
            {"A","B","C","F"},


            {"G","H","I","L"},
            {"H","I","M","N"},
            {"H","I","V","N"},
            {"Y","V","R","S"},
            {"R","Z","Y","U"},

            {"T","Z","Y","U"},
            {"M","Q","R","N"},
            {"T","U","Q","P"},
            {"D","G","F","J"},
            {"D","E","F","J"},

            {"F","J","M","R"},
            {"W","T","R","M"},


    };
    private  String mCorrectAnswers[]={ "C","B","I","O","F",  "D","X","S","Q","O",   "K","W","A","C","F",  "I","M" ,"V","Y","Z"  ,"T","Q","U","G","J", "M","R",};
    public  Integer getQuestion(int a){
        Integer question =mQuestion[a];
        return question;
    }
    public  String getChoice1(int a){
        String choice1 =mChoices[a][0];
        return choice1;
    }
    public  String getChoice2(int a){
        String choice2 =mChoices[a][1];
        return choice2;
    }
    public  String getChoice3(int a){
        String choice3 =mChoices[a][2];
        return choice3;
    }
    public  String getChoice4(int a){
        String choice4 =mChoices[a][3];
        return choice4;
    }
public String getCorrectAnswer(int a){
    String answer =mCorrectAnswers[a];
    return answer;
}

}
