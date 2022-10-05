public class Cat {
    String name;
    String color;
    int age;
    String sex;

    public static void main(String[] args) {

        Cat myrka = new Cat();

        myrka.age = 1;
        myrka.color = "black";
        myrka.sex = "Девочка";
        myrka.name = "Мурка";


        System.out.println("Добрый день, отдам кошку в хорошие руки, зовут " + myrka.name + " ей уже " + myrka.age
        + " год, она у нас " + myrka.sex + ", звоните, пишите в любое время!");


    }
}
