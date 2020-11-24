package com.example.mymcq;

public class QuestionBank {

    private String QuestionBank[] = {
            "Who is the Dean of FIT?",
            "Who is the HOP of BCSI and BITI?",
            "What is name of INTI IU Library?",
            "Where does INTI IU located?",
            "What is the name of the lecturer teaching this course?",
            "What is the name of the platform used by INTI students?",
            "What is the name of this course?"
    };

    private String choices[][] = {
            {"Dr.Redha", "Dr.Choo","Dr.Malathy"},
            {"Mr.Zul", "Mrs.Chong","Mr.Shahriel"},
            {"Tan Sri Abdullah", "Tan Sri Abdul Kasim","Tan Sri Abdul Majid"},
            {"Subang", "Nilai","Penang"},
            {"Mr.Zul", "Mrs.Deshinta","Mrs Chong"},
            {"BlackBoard", "WhiteBoard","Moodle"},
            {"Introduction to Software Engineering", "Mobile Apps Development using Android",
                    "Computational Simulation and Modeling"}

    };

    private String correct_answer [] = {
            "Dr.Choo","Mrs.Chong","Tan Sri Abdul Majid","Nilai","Mrs.Deshinta","BlackBoard",
            "Mobile Apps Development using Android"
    };

    public String getQuestionBank (int a) {
        String question = QuestionBank [a];
        return question;
    }

    public String getChoice0 (int a) {
        String choice0 = choices[a][0];
        return choice0;
    }

    public String getChoice1 (int a) {
        String choice0 = choices[a][1];
        return choice0;
    }

    public String getChoice2 (int a) {
        String choice0 = choices[a][2];
        return choice0;
    }

    public String getcorrect_answer (int a) {
        String answer = correct_answer [a];
        return answer;
    }


}
