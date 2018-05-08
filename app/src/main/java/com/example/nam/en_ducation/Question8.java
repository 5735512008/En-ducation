package com.example.nam.en_ducation;


public class Question8 {
    Integer[] mQuestion8 ={
            R.drawable.fa01,
            R.drawable.fa02,
            R.drawable.fa03,
            R.drawable.fa04,
            R.drawable.fa05,
            R.drawable.fa06,
            R.drawable.fa07,
            R.drawable.fa08,
            R.drawable.fa09,
            R.drawable.fa10,
            R.drawable.fa11,
            R.drawable.fa12,
            R.drawable.fa13,
            R.drawable.fa14,
            R.drawable.fa15,

         };
    private String mChoices8[][]={
            {"ทหาร","พ่อครัว","ชาวนา","ตำรวจ"},
            {"นักเรียน","ตำรวจ","วิศวกร","พยาบาล"},
            {"ตำรวจ","ครู","พยาบาล","หมอฟัน"},
            {"พยาบาล","นักเรียน","นักบิน","ผู้พิพากษา"},
            {"ชาวนา","คนขับรถ","พ่อครัว","นักเรียน"},

            {"คุณหมอ","วิศวกร","นักร้อง","ช่างตัดผม"},
            {"หมอฟัน","นักบิน","คุณหมอ","นักบิน"},
            {"คุณหมอ","ชาวนา","ตำรวจ","พ่อครัว"},
            {"ครู","นักร้อง","นักเรียน","พ่อครัว"},
            {"ช่างตัดผม","นักเรียน","ทหาร","ครู"},

            {"ผู้พิพากษา","ชาวนา","ช่างตัดผม","ทหาร"},
            {"พยาบาล","ทหาร","วิศวกร","หมอฟัน"},
            {"คนขับรถ","คุณหมอ","ครู","นักบิน"},
            {"คุณหมอ","ผู้พิพากษา","วิศวกร","นักร้อง"},
            {"นักบิน","คนขับรถ","ผู้พิพากษา","พ่อครัว"},


    };

    private  String mCorrectAnswers[]={ "ทหาร","ตำรวจ","พยาบาล","ผู้พิพากษา","ชาวนา",  "วิศวกร","คุณหมอ","พ่อครัว","ครู","นักเรียน",  "ช่างตัดผม","หมอฟัน","คนขับรถ","นักร้อง","นักบิน",};
    public  Integer getQuestion8(int a){
        Integer question8 =mQuestion8[a];
        return question8;
    }
    public  String getChoice1(int a){
        String choice =mChoices8[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice =mChoices8[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice =mChoices8[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice =mChoices8[a][3];
        return choice;
    }
    public String getCorrectAnswer8(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }
}
