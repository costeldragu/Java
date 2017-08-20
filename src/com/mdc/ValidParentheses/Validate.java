package com.mdc.ValidParentheses;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Stack;

public class Validate {


    public static boolean validate(String context) {
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Deque<Character> deque = new ArrayDeque<>();

        int tabs = 0;

        for (int i = 0; i < context.length(); i++) {
            char curr = context.charAt(i);

            if (map.keySet().contains(curr)) {
                System.out.printf(addTabs(tabs++) + "Add:"+ curr + "\n" );
                deque.addFirst(curr);
            } else if (map.values().contains(curr)) {
                if (!deque.isEmpty() && map.get(deque.peek()) == curr) {
                    System.out.println(addTabs(--tabs) + "Remove:"+curr + "\n");
                    deque.pop();
                } else {
                    return false;
                }
            }
        }

        return deque.isEmpty();
    }

    public static String addTabs(int tabs) {
        StringBuilder tabsS = new StringBuilder("\t");
        for (int x=1;x<tabs;++x) {
            tabsS.append("\t");
        }

        return tabsS.toString() ;
    }
}
