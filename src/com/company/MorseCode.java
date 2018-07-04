package com.company;

import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MorseCode {

    String text = "";
    HashMap<String, String> list = new HashMap<>();

    String splitCode[];

    int index = 0;

    public MorseCode(String code) {

        list.put(".-", "a");
        list.put("-....", "b");
        list.put("-.-.", "c");
        list.put("-..", "d");
        list.put(".", "e");
        list.put("..-.", "f");
        list.put("--.", "g");
        list.put("....", "h");
        list.put("..", "i");
        list.put(".---", "j");
        list.put("-.-", "k");
        list.put(".-..", "l");
        list.put("--", "m");
        list.put("-.", "n");
        list.put("---", "o");
        list.put(".--.", "p");
        list.put("--.-", "q");
        list.put(".-.", "r");
        list.put("...", "s");
        list.put("-", "t");
        list.put("..-", "u");
        list.put("...-", "v");
        list.put(".--", "w");
        list.put("-..-", "x");
        list.put("-.--", "y");
        list.put("--..", "z");

        list.put("/", " ");

        splitCode = code.split(" ");

       // toLetter();

        toMorseCode();


    }

    public void toMorseCode() {

        try {
            // Open an audio input stream.
            File soundFile = new File("beep.wav"); //you could also get the sound file with an URL
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


       // System.out.print(list.get(splitCode[index]));

        String splitWord[] = splitCode[index].split("");

        for (int x = 0; x < splitWord.length; x++){

           String splitMorseWord[] = splitWord[x].split("");

           for (int y = 0; y < splitMorseWord.length; y++){


               System.out.print(getKeyFromValue(list,splitWord[x]));

           }

            System.out.print(getKeyFromValue(list,splitWord[x]));
            System.out.print(" ");




        }

        System.out.print("     ");


        index++;

        if (index != splitCode.length) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            toMorseCode();
        }
    }


    public static Object getKeyFromValue(Map hm, Object value) {
        for (Object o : hm.keySet()) {
            if (hm.get(o).equals(value)) {
                return o;
            }
        }
        return null;
    }


    public void toLetter() {

        try {
            // Open an audio input stream.
            File soundFile = new File("beep.wav"); //you could also get the sound file with an URL
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip();
            // Open audio clip and load samples from the audio input stream.
            clip.open(audioIn);
            clip.start();
        } catch (UnsupportedAudioFileException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (LineUnavailableException e) {
            e.printStackTrace();
        }


        System.out.print(list.get(splitCode[index]));

        index++;

        if (index != splitCode.length) {
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            toLetter();
        }
    }

    @Override
    public String toString() {
        return this.text;
    }
}
