package com.example;

import com.google.common.collect.ImmutableList;

public class App {
    public static void main(String[] args) {
        ImmutableList<String> items = ImmutableList.of("Hello", "Renovate", "Bot");
        items.forEach(System.out::println);
    }
}
