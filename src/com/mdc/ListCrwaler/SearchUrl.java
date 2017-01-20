package com.mdc.ListCrwaler;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by CaDyMaN on 13.01.2017.
 */
public class SearchUrl implements Runnable {
    List<String> urls = new ArrayList<>();
    String name;
    private Random randomGenerator;

    SearchUrl(String name) {
        this.name = name;
        randomGenerator = new Random();
    }

    @Override
    public void run() {

        String[] words = generateRandomWords(1000);
        for (String word:words) {
            urls.add(word);
        }

        while (urls.size() > 0) {
            int index = randomGenerator.nextInt(urls.size());
            String url = urls.get(index);
            System.out.println(name + ":" + url);
            open(url);
            urls.remove(index);
            System.out.println(urls.size());
        }

//        for (
//                String url : urls
//                )
//
//        {
//            try {
//                System.out.println(name+":"+url);
//                URL u = new URL(url);
//                BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));
//                in.close();
//            } catch (Exception e) {
//            }
//
//        }
    }

    private void open(String url) {
        try {

            URL u = new URL(url);
            BufferedReader in = new BufferedReader(new InputStreamReader(u.openStream()));
//                String inputLine;
//                while ((inputLine = in.readLine()) != null){
//                    System.out.println(inputLine);
//                }
            in.close();

        } catch (Exception e) {
        }
    }

    public  String[] generateRandomWords(int numberOfWords)
    {
        String[] randomStrings = new String[numberOfWords];
        Random random = new Random();
        for(int i = 0; i < numberOfWords; i++)
        {
            char[] word = new char[random.nextInt(8)+3]; // words of length 3 through 10. (1 and 2 letter words are boring.)
            for(int j = 0; j < word.length; j++)
            {
                word[j] = (char)('a' + random.nextInt(26));
            }
            randomStrings[i] = new String(word);
        }

        return randomStrings;
    }

}
