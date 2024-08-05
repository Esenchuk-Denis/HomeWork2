public class Main {
    public static void main(String[] args){
        //Task 1
        System.out.println("Task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("  ");
        //Task 2
        System.out.println("Task 2");
        dog= dog+4;
        System.out.println(dog);
        cat=cat+4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);

        System.out.println("  ");
        //Task 3
        System.out.println("Task 3");
        dog= dog-3.5;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper+7639;
        System.out.println(paper);

        System.out.println("  ");
        //Task 4
        System.out.println("Task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("  ");
        //Task 5
        System.out.println("Task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        System.out.println("   ");
        //Task 6
        System.out.println("Task 6");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров составляет " + totalWeight +" кг");
        var weightDifference = secondBoxer - firstBoxer;
        System.out.println("Разница в весе боксеров составляет " + weightDifference +" кг");

        System.out.println("   ");
        //Task 7
        System.out.println("Task 7");
        var remainder = secondBoxer % firstBoxer;
        System.out.println(remainder);

        System.out.println("   ");
        //Task 8.1
        System.out.println("Task 8.1");
        var totalHours = 640;
        var totalPeople = totalHours / 8;
        System.out.println("Всего работников в компании — " + totalPeople + " человек");

        System.out.println("   ");
        //Task 8.2
        System.out.println("Task 8.2");
        totalPeople = totalPeople + 94;
        var totalHoursNew = totalPeople * 8;

        System.out.println("Если в компании работает "+ totalPeople + " человек, то всего "+ totalHoursNew + " часов работы может быть поделено между сотрудниками");


    }

}