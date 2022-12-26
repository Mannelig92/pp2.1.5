package koschei;

import koschei.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/*
По заданию. Исправление.
Да, что-то я упустил в том как нужно сделать задание, исправил на все виды связывания.
Имя компонента прописывать явно не обязательно, но Треуголов говорил что это хороший тон. Тем не менее убрал.
 */
public class Application {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        KoscheiTheDeathless koscheiTheDeathless =
                applicationContext.getBean(KoscheiTheDeathless.class);
        System.out.println(koscheiTheDeathless.getRulesByDeth());
    }
}
