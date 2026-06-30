/*
Домашнее задание №11.
 Гербер Шилдт. Полное руководство. Java 12 -ое издание. Страницы: 246-273
https://javarush.com/groups/posts/1963-kak-ispoljhzovatjh-klass-enum   (Enum)
Задачи
1. Создать интерфейс Робот. В нём определены методы: Дефолтный метод:  Отремонтировать робота и абстрактные методы: включить робота, выключить,
продемонстрировать уникальные способности (uniquePossibility).
1.1 Создать классы роботов.
РоботПовар поля: модель, потребляемая мощность, страна производитель, агрегат для приготовления, включение робота (boolean isOn).
РоботСапёр. Поля: модель, потребляемая мощность, средство для разминирования (шасси номер), материал, включение робота (boolean isOn)
РоботСроитель. Поля: модель, потребляемая мощность, страна производитель, агрегат для строительства, материал, включение робота (boolean isOn.)
Все три класса должны имплементировать интерфейс Робот. Реализовать все методы, к классах, которые требует интерфейс.
В классе РоботСапёр переопределите дефолтный метод (отремонтировать робота)
1.2 В классе Main создайте по экземпляру объекта (РоботСапёр, роботСтроитель, РоботПовар) и вызовите метод отремантировать робота
(результаты выполнения методы выведите в консоль)
1.3 Метод включения и выключения робота должен менять поле в каждом роботе Boolean isOn.
1.4 Метод uniquePossibility и переопределите во всех классах роботах. (повар готовит, строитель строит и т.д.)
1.5 Добавить интерфейс, который будет называться РоботИнженер. Он должен расширить интерфейс Робот. От этого интерфейса должны наследоваться РоботСапёр
и РоботСтроитель. В этом интерфейсе определите абстрактный метод createItem (Робот строитель создаёт бетон,
РоботСапёр создаёт приспособление для разминирования).
1.6 Создать 3 выставки (массива) роботов в классе Main. Одна выставка будет включать в себя все виды роботов (робот-повар, робот сапёр, робот строитель).
Вторая выставка- только для инженерных роботов. Третья выставка- для роботов сапёров. Продемонстрировать способности всех роботов,
которые представлены на выставках (вызвать метод uniquePossibility)
Продемонстрировать способности всех роботов-инженеров на выставке Роботов-инженеров, вызвав метод createItem на каждом Роботе, который есть на выставке.

Сроки выполнения 21.06.2026 Ссылку на пул реквест бросать мне в личку в телеграмме
Вопросы для проработки:
1. Что такое интерфейс?
2. Отличие интерфейса от абстрактного класса
3. Что такое полиморфизм?
4. Что такое default методы в интерфейсе?
5. Какие переменные можно задать в интерфейсе? Какие методы могут быть определены в интерфейсе?
 */
package task11;


import java.util.List;


public class Main {
    public static void main(String[] args) {
        RobotCooker cooker = new RobotCooker("Chef-2000", 80, "Japan", "multi-cooker");
        RobotCooker cooker2 = new RobotCooker("Chef-2026", 180, "Japan", "extramulti-cooker");
        RobotSaper saper = new RobotSaper("SaperStarper", 150, "FJ@$&%KJHKJ", "c4");
        RobotSaper saper2 = new RobotSaper("SuperStarper", 250, "FJ@$&%FRGJK", "toluol");
        RobotBuilder builder = new RobotBuilder("Build-2026", 300, "Germany", "crane", "steel");
//use array
//        saper.repair();
//        builder.repair();
//        cooker.repair();
//        System.out.println("==================================");
//
//        saper.turnOn();
//        builder.turnOn();
//        cooker.turnOn();
//        System.out.println("==================================");
//
//        // expo
//        Robot[] expoAll = new Robot[] {cooker,cooker2, saper, saper2,builder};
//        RobotEngineer[] expoEngineers = new RobotEngineer[] {saper,saper2, builder };
//        RobotSaper[] expoSaper = new RobotSaper[] {saper,saper2};
//
//        System.out.println("ALL:");
//        for (Robot r : expoAll) r.uniquePossibility();
//        System.out.println("==================================");
//
//        System.out.println("Engineers:");
//        for (RobotEngineer eng : expoEngineers) eng.createItem();
//        System.out.println("==================================");
//
//        System.out.println("Sapers:");
//        for (RobotSaper s : expoSaper) s.uniquePossibility();

        //use List
        List<Robot> all = List.of(cooker,cooker2, saper2,saper, builder);
        all.forEach(Robot::repair);
        System.out.println("==================================");
        all.forEach(Robot::turnOn);
        System.out.println("==================================");

        System.out.println("Expo All:");
        all.forEach(Robot::uniquePossibility);
        System.out.println("==================================");

        List<RobotEngineer> engineers = List.of(saper,saper2, builder);
        System.out.println("Expo Eng");
        engineers.forEach(RobotEngineer::createItem);
        System.out.println("==================================");

        System.out.println("Expo Sap:");
        List<RobotSaper> s = List.of(saper,saper2);
        s.forEach(RobotSaper::uniquePossibility);
    }
}