package com.delaroystudios.sqlitelogin;

/**
 * Created by PRANJAL on 30-06-2017.
 */

public class Ques1 {

    // array of questions
    private String textQuestions [] = {
            "1. Which class cannot be subclassed (or extended) in java?",
            "2. Can we declare abstract static method",
            "3. Can we access private class outside the package",
            "4. Why we use array as a parameter of main method",
            "5. Suspend thread can be revived by using",
            "6. Runnable is",
            "7. Which collection class associates values witch keys, and orders the keys according to their natural order",
            "8. Which method is used to perform DML statements in ",
            "9. Which of the following below are valid isolation levels in J2EE",
            "10. Session beans are created by the client submitting the query to the database"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"abstract class","parent class","Final class","None of above"},
            {"Yes","No","Can't say","Wrong question"},
            {"Yes","No","Can't say","Wrong question"},
            {"it is syntax","Can store multiple values","Both of above","None of above"},
            {"start() method","Suspend() method","resume() method","yield() method"},
            {"Class","Method","Variable","Interface"},
            {"java.util.HashSet","java.util.LinkedList","java.util.TreeMap","java.util.SortedSet"},
            { "execute()","executeUpdate()","executeQuery()","None of above"},
            { "TRANSACTION_READ_UNCOMMITTED","TRANSACTION_SERIALIZABLE","Only A","Both A and B"},
            {"True","False","Can't say","Wrong question"}


    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] =  {"Final class","No","No","Can store multiple values","resume() method","Interface","java.util.TreeMap","executeUpdate()","Both A and B","True"};

    // method returns number of questions
    public int getLength(){
        return textQuestions.length;
    }

    // method returns question from array textQuestions[] based on array index
    public String getQuestion(int a) {
        String question = textQuestions[a];
        return question;
    }

    // method return a single multiple choice item for question based on array index,
    // based on number of multiple choice item in the list - 1, 2, 3 or 4 as an argument
    public String getChoice(int index, int num) {
        String choice0 = multipleChoice[index][num-1];
        return choice0;
    }

    //  method returns correct answer for the question based on array index
    public String getCorrectAnswer(int a) {
        String answer = mCorrectAnswers[a];
        return answer;
    }

}
