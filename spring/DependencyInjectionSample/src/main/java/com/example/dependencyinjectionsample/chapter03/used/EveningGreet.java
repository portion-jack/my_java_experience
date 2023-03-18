package com.example.dependencyinjectionsample.chapter03.used;

import org.springframework.stereotype.Component;

@Component
public class EveningGreet implements Greet{
    @Override
    public void greeting() {
        System.out.println("---");
        System.out.println("좋은저녁");
        System.out.println("---");
    }
}
