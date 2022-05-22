package com.example.quizapp;

public class QuestionAnswer {

    public static String question[] ={
            "While(true) { cout << sum } will run --- times ?",
            "Which one is not the programming language ?",
            "Which one should be placed at the end of the line ?",
            "let sum = 5. sum += 20. What will be the answer ?"
    };

    public static String choices[][] = {
            {"1","2","3","Infinity"},
            {"Java","Kotlin","Notepad","Python"},
            {".",":",";","NONE"},
            {"30","20","45","25"}
    };

    public static String correctAnswers[] = {
            "Infinity",
            "Notepad",
            ";",
            "25"
    };

}
