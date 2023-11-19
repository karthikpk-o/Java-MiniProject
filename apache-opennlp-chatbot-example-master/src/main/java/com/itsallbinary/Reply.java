package com.itsallbinary;

import java.util.HashMap;
import java.util.Map;

public class Reply {
    public static Map<String, String[]> questionAnswer = new HashMap<>();
    public static Map<String, String> ans_temp = new HashMap<>();

    public static String[] greeting={
            "Hey there!! How can i help?",
            "Hi! How can i help?",
            "Hi I'm your new friend, How can i help?",
            "Hey, How can I help?",
            "Yo!What's up, How can i help?",
    };
    public static String[] ask_question={
            "Doing great!!. How are you?",
            "Looking Forward to talk to you!!",
            "Very Well!! Thanks. How are you?",
            "Great, How you doin?",
            "Doing very well!. Thanks. How are you?",
            "Awesome, Thanks a lot. How you doin?",
            "Good, Thank you. What about you?",
    };

    public static String[] conversation_continue_bot={
            "That's nice, what else i can do for you?",
            "cool, what do you wanna do?",
    };
    public static String[] not_understood={
            "Sorry! I didn't get you",
            "Couldn't understand what you're telling. What can i do for you?",
            "Sorry Didn't get you. I can tell you a joke if you want",
            "hmm i don't know if i got what you're telling. Do you want to hear a song?",
            "hmm seems like you're bored, Do you wanna play a game?",
    };

    public static String[] conversation_complete= {
                    "Thank you for your time bye bye",
                    "OK bye i'm here if you need me",
                    "See you stay safe!!",
                    "Cool Bye Bye!",
            };

    static {
        questionAnswer.put("greeting", greeting);
        questionAnswer.put("ask-question", ask_question);
        questionAnswer.put("conversation-continue", conversation_continue_bot);
		questionAnswer.put("not-under", not_understood);
        questionAnswer.put("conversation-complete", conversation_complete);
    }

    public int getRandomNumber(int min, int max)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }
    public String Answer(String category)
    {
        String[] temp = (String[]) questionAnswer.get(category);
        int arrlen = temp.length;
        String randstr = temp[getRandomNumber(0,arrlen)];
        ans_temp.put(category, randstr);
        return (String) ans_temp.get(category);
    }
}


class jokes
{
    static String[] jokes = {
            "What falls, but never needs a bandage? The rain.",
            "I was going to tell you a joke about boxing but I forgot the punch line",
            "I'm not a fan of spring cleaning. Let's be honest, I'm not into summer, fall, or winter cleaning either.",
            "Why did the egg hide? It was a little chicken",
            "What did the dirt say to the rain? If you keep this up, my name will be mud!",
            "Why couldn't the sunflower ride its bike? It lost its petals.",
            "What's an egg's favorite vacation spot? New Yolk City.",
            "I ate a sock yesterday. It was very time-consuming.",
            "What kind of candy do astronauts like? Mars bars.",
            "I wanted to buy some camo pants but couldn't find any.",
    };

    static int arrLen = jokes.length;

    public int getRandomNumber(int min, int max)
    {
        return (int) ((Math.random() * (max - min)) + min);
    }

    void Randomjoke()
    {
        String RandomJk = jokes[getRandomNumber(0, arrLen)];
        System.out.println(RandomJk);
    }

}