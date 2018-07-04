package com.company;

import java.util.*;

public class Main {

    Scanner input = new Scanner(System.in);



    public void run(){


//this.condense("Deep episodes of Deep Space Nine came on the television only after the news. Digital alarm clocks scare area children.");



      //  RPS rps = new RPS();

       // rps.play();


        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

      //  System.out.println(new MorseCode(".... . .-.. .-.. --- / -.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... . / -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"));

        new MorseCode("hello my name is zak");








    }




    public String condense(String sentence){

        String condense = "";


        String splitSentence[] = sentence.split(" ");



        int index1 = 0;
        int index2 = 1;




        while (index2 < splitSentence.length){
            ArrayList<String> splitWord1 = new ArrayList<>(Arrays.asList(splitSentence[index1].split("")));
            ArrayList<String> splitWord2 = new ArrayList<>(Arrays.asList(splitSentence[index2].split("")));


            System.out.println(splitWord1.get(splitWord1.size()-1) + " " +splitWord2.get(0));

            if(splitWord1.get(splitWord1.size()-1).equalsIgnoreCase(splitWord2.get(0))) {



                splitWord1.remove(splitWord1.size()-1);

            }


            if(splitWord1.get(splitWord1.size()-1).equalsIgnoreCase(splitWord2.get(1))) {



                splitWord1.remove(splitWord1.size()-1);
                splitWord1.remove(splitWord1.size()-2);


            }




            index1++;
            index2++;



            for (int i = 0; i < splitWord1.size(); i++){
                condense = condense + splitWord1.get(i);
            }

            condense = condense + " ";


        }


        System.out.println(condense);




        return "";
    }










    public static void main(String[] args) {

        new Main().run();


    }
}
