package com.example.nam.en_ducation;


public class Question7 {
    Integer[] mQuestion7 ={
            R.drawable.fam01,
            R.drawable.fam02,
            R.drawable.fam03,
            R.drawable.fam04,
            R.drawable.fam05,
            R.drawable.fam06,
            R.drawable.fam07,
            R.drawable.fam08,
            R.drawable.fam09,
            R.drawable.fam10,
            R.drawable.fam11,
            R.drawable.fam12,
            R.drawable.fam13,
            R.drawable.fam14,
            R.drawable.fam15,
            R.drawable.fam16,
            R.drawable.fam17,

         };
    private String mChoices7[][]={
            {"พ่อ","แม่","คุณปู่/คุณตา","หลานชาย"},
            {"พ่อ","พี่ชาย/น้องชาย","สามี","แม่"},
            {"ลูกชาย","หลานชาย","สามี","ลูกสาว"},
            {"คุณปู่/คุณตา","ลูกสาว","พ่อแม่","ภรรยา"},
            {"ป้า/น้า","หลานชาย","พี่ชาย/น้องชาย","สามี"},

            {"หลานชาย","พี่สาว/น้องสาว","ลูกชาย","ลูกสาว"},
            {"สามี","พ่อแม่","คุณปู่/คุณตา","ป้า/น้า"},
            {"พี่ชาย/น้องชาย","ภรรยา","ลูกเขย","ลุง/อา"},
            {"พ่อแม่","ลุง/อา","ลูกสาว","หลานชาย"},
            {"ลุง/อา","แม่","ภรรยา","คุณปู่/คุณตา"},

            {"คุณย่า/คุณยาย","ป้า/น้า","แม่","พ่อ"},
            {"พี่สาว/น้องสาว","สามี","หลานชาย","หลานสาว"},
            {"หลานสาว","ลุง/อา","คุณย่า/คุณยาย","ลูกชาย"},
            {"ลูกชาย","ลูกเขย","พี่สาว/น้องสาว","ป้า/น้า"},
            {"หลานชาย","ภรรยา","ลูกเขย","พ่อแม่"},

            {"คุณย่า/คุณยาย","หลานสาว","หลานชาย","พ่อแม่"},
            {"พี่ชาย/น้องชาย","พี่สาว/น้องสาว","หลานสาว","ลูกเขย"},

    };

    private  String mCorrectAnswers[]={ "พ่อ","แม่","ลูกชาย","ลูกสาว","พี่ชาย/น้องชาย",  "พี่สาว/น้องสาว","สามี","ภรรยา","พ่อแม่","คุณปู่/คุณตา",  "คุณย่า/คุณยาย","หลานชาย","ลุง/อา","ป้า/น้า","หลานชาย", "หลานสาว","ลูกเขย",};
    public  Integer getQuestion7(int a){
        Integer question7 =mQuestion7[a];
        return question7;
    }
    public  String getChoice1(int a){
        String choice =mChoices7[a][0];
        return choice;
    }
    public  String getChoice2(int a){
        String choice =mChoices7[a][1];
        return choice;
    }
    public  String getChoice3(int a){
        String choice =mChoices7[a][2];
        return choice;
    }
    public  String getChoice4(int a){
        String choice =mChoices7[a][3];
        return choice;
    }
    public String getCorrectAnswer7(int a){
        String answer =mCorrectAnswers[a];
        return answer;
    }
}
