package ru.eugene.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.eugene.app.service.IService;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ru.eugene.app");
        String[] definitionNames = context.getBeanDefinitionNames();
        for (String definitionName : definitionNames) {
            System.out.println(definitionName);
        }

        IService iService = context.getBean(IService.class);
        String daoString = iService.interactWithDaoString();
        System.out.println(daoString);
    }
}
