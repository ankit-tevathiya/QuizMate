package com.delaroystudios.sqlitelogin;

// This file contains questions from QuestionBank

public class QuestionBank {

    // array of questions
    private String textQuestions [] = {
            "1. Which are the screen sizes in Android?",
            "2. What is the difference between Activity context and Application Context?",
            "3. Parent class of Service?",
            "4. If you need your interface to work across different processes, you can create an interface for the service with a ________?",
            "5. When contentProvider would be activated?",
            "6. Parent class of Activity?",
            "7. Which one is NOT related to fragment class?",
            "8. Which of the  important device characteristics that you should consider as you design and develop your application?",
            "9. What are the Direct subclasses of Activity?",
            "10. Layouts in android?",
            "11. You can shut down an activity by calling its _______ method",
            "12. Definition of Loader?",
            "13. Characteristics of the  Loaders?",
            "14. Which are the  screen densities in Android?",
            "15. What are the indirect Direct subclasses of Services?",
            "16. Which component is not activated by an Intent?",
            "17. If your service is private to your own application and runs in the same process as the client (which is common), you should create your interface by extending the ________class?",
            "18. How many ways to start services?",
            "19. Once installed on a device, each Android application lives in_______?",
            "20. What are the indirect Direct subclasses of Activity?"
    };

    // array of multiple choices for each question
    private String multipleChoice [][] = {
            {"small"  , "normal"  ,   "large"   ,   "all of the above"},
            {"The Activity instance is tied to the lifecycle of an Activity. while the application instance is tied to the lifecycle of the application",  "The Activity instance is tied to the lifecycle of the application, while the application instance is tied to the lifecycle of an Activity.",  "The Activity instance is tied to the lifecycle of the Activity, while the application instance is tied to the lifecycle of an application." , "none of the above"},
            {"Object",   "Context",  "ContextWrapper",  "ContextThemeWrapper"},
            {"Binder",   "Messenger" ,  "AIDL",   "b or c"},
            {"using Intent",   "using SQLite" , "using ContentResolver",  "none of the above"},
            {"object",   "context",  "activityGroup",   "contextThemeWrapper"},
            {"dialogFragment","listFragment","preferenceFragment","cursorFragment"},
            { "screen size and density","input configurations","device features","all the above"},
            { "ListActivity","ActivityGroup","FragmentActivity","all the above"},
            {"Frame Layout","Linear Layout","Relative Layout","All of the above"},
            {"onDestory()","finishActivity()","finish()","none of the above"},
            {"loaders make it easy to synchronously load data in an activity or fragment.","loaders make it easy to asynchronously load data in an activity or fragment.","loaders does not make it easy to asynchronously load data in an activity or fragment.","none of the above."},
            {"they are available to every Activity and Fragment.","they provide asynchronous loading of data.","they monitor the source of their data and deliver new results when the content changes.","all of the above."},
            {"low density","medium density","extra high density","all of the above"},
            {"recognitionService","remoteViewsService","spellCheckerService","inputMethodService"},
            {"activity","services","contentProvider","broadcastReceiver"},
            {"messenger","binder","AIDL","none of the above"},
            {"started","bound","a & b ","messenger"},
            {"device memory","external memory","security sandbox","none of the above"},
            {"launcherActivity","preferenceActivity","tabActivity","all the above"}

    };

    // array of correct answers - in the same order as array of questions
    private String mCorrectAnswers[] = {"large", "The Activity instance is tied to the lifecycle of the application, while the application instance is tied to the lifecycle of an Activity.","ContextThemeWrapper","Messenger" ,"none of the above","object","preferenceFragment","all the above","all the above","All of the above","none of the above","none of the above.","they monitor the source of their data and deliver new results when the content changes.","all of the above","spellCheckerService","contentProvider","none of the above","messenger","none of the above","tabActivity"};

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