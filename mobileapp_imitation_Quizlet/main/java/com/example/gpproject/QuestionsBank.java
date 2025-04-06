package com.example.gpproject;
import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionsList> mathQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("What is 1 + 1","1","2","4","5","2","");
        final QuestionsList question2 = new QuestionsList("What is 2 + 2","4","3","6","7","4","");
        final QuestionsList question3 = new QuestionsList("What is 3 + 3","3","4","6","8","6","");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);


        return questionsLists;
    }

    private static List<QuestionsList> englishQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("What is past tense","Things that happen in the past","Things that now happening","Facts","Things that happen in the future","Things that happen in the past","");
        final QuestionsList question2 = new QuestionsList("What is continuous tense ","Things that happen in the past","Things that now happening","Facts","Things that happen in the future","Things that now happening","");
        final QuestionsList question3 = new QuestionsList("What is the past tense of \"Learn\"","Learn","Learning","Learnt","Learned","Learnt","");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);


        return questionsLists;
    }

    private static List<QuestionsList> itQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("","","","","","","");
        final QuestionsList question2 = new QuestionsList("","","","","","","");
        final QuestionsList question3 = new QuestionsList("","","","","","","");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);

        return questionsLists;
    }

    private static List<QuestionsList> androidQuestions() {

        final List<QuestionsList> questionsLists = new ArrayList<>();

        // Create object of QuestionsList class and pass a questions along with options and answer
        final QuestionsList question1 = new QuestionsList("","","","","","","");
        final QuestionsList question2 = new QuestionsList("","","","","","","");
        final QuestionsList question3 = new QuestionsList("","","","","","","");

        // add all questions to List<QuestionsList>
        questionsLists.add(question1);
        questionsLists.add(question2);
        questionsLists.add(question3);

        return questionsLists;
    }

    public static List<QuestionsList> getQuestions(String selectedTopicName) {
        switch (selectedTopicName) {
            case "Math":
                return mathQuestions();
            case "English":
                return englishQuestions();
            case "Android":
                return androidQuestions();
            default:
                return itQuestions();
        }
    }
}
