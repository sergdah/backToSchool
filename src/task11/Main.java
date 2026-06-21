package task11;

public class Main {
    public static void main(String[] args) {
        RobotCooker cooker = new RobotCooker("Chef-2000", 80, "Japan", "multi-cooker");
        RobotCooker cooker2 = new RobotCooker("Chef-2026", 180, "Japan", "extramulti-cooker");
        RobotSaper saper = new RobotSaper("SaperStarper", 150, "FJ@$&%KJHKJ", "c4");
        RobotSaper saper2 = new RobotSaper("SuperStarper", 250, "FJ@$&%FRGJK", "toluol");
        RobotBuilder builder = new RobotBuilder("Build-2026", 300, "Germany", "crane", "steel");

        saper.repair();
        builder.repair();
        cooker.repair();
        System.out.println("==================================");

        saper.turnOn();
        builder.turnOn();
        cooker.turnOn();
        System.out.println("==================================");

        // expo
        Robot[] expoAll = new Robot[] {cooker,cooker2, saper, saper2,builder};
        RobotEngineer[] expoEngineers = new RobotEngineer[] {saper,saper2, builder };
        RobotSaper[] expoSaper = new RobotSaper[] {saper,saper2};

        System.out.println("ALL:");
        for (Robot r : expoAll) r.uniquePossibility();
        System.out.println("==================================");

        System.out.println("Engineers:");
        for (RobotEngineer eng : expoEngineers) eng.createItem();
        System.out.println("==================================");

        System.out.println("Sapers:");
        for (RobotSaper s : expoSaper) s.uniquePossibility();
    }
}