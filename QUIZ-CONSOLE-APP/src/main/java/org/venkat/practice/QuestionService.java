package org.venkat.practice;

import java.util.Scanner;

public class QuestionService {
    Question[] questions = new Question[5];

    String selection[] = new String[5];

    public QuestionService() {
        this.questions[0] = new Question(1, "Who is your fav actor", "Mahesh", "Prabhas",
                "Pawan", "None", "1");

        this.questions[1] = new Question(2, "Who is your fav Country", "India", "America",
                "UK", "NZ", "1");

        this.questions[2] = new Question(3, "Who is your fav Color", "Red", "Blue",
                "White", "Black", "2");

        this.questions[3] = new Question(4, "Who is your fav City", "Tirupathi", "Hyderabad",
                "Bangalore", "Delhi", "1");

        this.questions[4] = new Question(5, "Who is your fav Sport", "Cricket", "Football",
                "Vallyball", "Basketball", "1");
    }


    //    public QuestionService() {
//
//        for(int i=0; i<questions.length;i++) {
//            this.questions[i] = new Question();
//        }
//    }

    public void playQuiz(){
        int i = 0;
        for(Question que : questions) {

            System.out.println("Question : "+ que.getId());

            System.out.println(que.getQuestion());

            System.out.println("Option 1: " + que.getOpt1());

            System.out.println("Option 2: " + que.getOpt2());

            System.out.println("Option 3: " + que.getOpt3());

            System.out.println("Option 4: " + que.getOpt4());


            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;

          // System.out.println("Your Answer: " + que.getAnswer());


// Inner loop for options
//            for (int i = 1; i <= 4; i++) {
//                String option = "";
//                switch (i) {
//                    case 1:
//                        option = que.getOpt1();
//                        break;
//                    case 2:
//                        option = que.getOpt2();
//                        break;
//                    case 3:
//                        option = que.getOpt3();
//                        break;
//                    case 4:
//                        option = que.getOpt4();
//                        break;
//                }
//                System.out.println("Option " + i + ": " + option);
//            }





        }
        for(String s : selection){

            System.out.println(s);

        }




//        for(int i=0; i<questions.length;i++) {
//            System.out.println(" Question "+ i +" : "+ questions[i].getQuestion());
//        }



//        System.out.println(" Question 0: "+ questions[0].getQuestion());
//
//        System.out.println(" Question 1: "+ questions[1].getQuestion());
//
//        System.out.println(" Question 2: "+ questions[2].getQuestion());
//
//        System.out.println(" Question 3: "+ questions[3].getQuestion());
//
//        System.out.println(" Question 4: "+ questions[4].getQuestion());

        //System.out.println(" Question 5: "+ questions[5].getQuestion());



    }

    public void printScore() {

        int score = 0;

        for(int i = 0; i<questions.length;i++){

            Question que =  questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)) {
                score++;
            }

        }
        System.out.println("Score: " + score);
    }


}
