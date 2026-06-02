package task7;

/*
1.  Создать класс Student c полями id (тип int), name (тип String), surname (тип String), faculty (факультет, тип String ), course(тип int) , Группа(тип String),
средняя оценка (тип int). Инициализацию студента в классе main выполнять через конструктор с параметрами. Также определите конструктор без параметров.
2. Создать метод, который будет выводить информацию по полям которые есть в классе и назвать его info
3. Создать метод, который будет изменять текущую группу студента (сам метод в качестве параметра будет принимать новую группу)
4. Создать метод, который будет возвращать текущую группу студента.
5. Создать метод, который будет изменять оценку студента и группу студента.
6. В классе main создать массив из пяти студентов.
7. Создать метод в классе Student, который будет принимать массив студентов и возвращать из них массив тех студентов,
у которых оценка выше переданной оценке в методе. (Сигнатура метода будет выглядеть так PublicStudent[]getStudents(Students[] students, int mark)
8. В классе main из полученных студентов из задания 7 пройтись в цикле по массиву и вызвать на каждом студенте метод info, который вы создавали в задании 2
 */
public class Student {
    private int id, course, averageMark;
    private String name, surname, faculty, group;

    // конструктор с параметрами
    public Student(int id, int course, int averageMark, String name, String surname, String faculty, String group) {
        this.id = id;
        this.course = course;
        this.averageMark = averageMark;
        this.name = name;
        this.surname = surname;
        this.faculty = faculty;
        this.group = group;
    }

    //конструктор без параметров
    public Student() {
    }

    //метод для вывода инфо
    public void info() {
        System.out.println("Информация о студенте:" + " ID: " + id+ " Имя: " + name+" Фамилия: " + surname+" Факультет: " + faculty+" Курс: " + course+" Группа: " + group+" Средняя оценка: " + averageMark);
    }


    //метод для изменения группы
    public void changeGroup(String newGroup) {
        this.group = newGroup;
        System.out.println("Новая группа" + this.group);
    }


    //метод для получения текущей группы
    public String getCurrentGroup() {
        return this.group;
    }

    //метод для изменения группы
    public void changeMarkAndGroup(int newAverageMark, String newGroup) {
        this.averageMark = newAverageMark;
        this.group = newGroup;
        System.out.println("Новая средняя оценка" + this.averageMark);
        System.out.println("Новая группа" + this.group);
    }

    public static Student[] getStudents(Student[] students, int mark) {
        int count = 0;
        //посчитать размер массива
        for (Student student : students) {
            if (student.averageMark > mark) {
                System.out.println(student);
                count++;
            }
        }
        //создать новый объект - массив подсчитанного размера
        Student[] bestStudents = new Student[count];
        //записать в каждый элемент массива студента с высокой оценкой
        int index = 0;
        for (Student student : students) {
            if (student.averageMark > mark) {
                System.out.println(student);
                bestStudents[index] = student;
                index++;
            }
        }
        //вернуть новый список студентов
        return bestStudents;
    }
}

