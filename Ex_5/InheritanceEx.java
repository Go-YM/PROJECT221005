package Ex_5;

class Person
{
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int weight)
    {
        this.weight = weight;
    }

    public int getWeight()
    {
        return weight;
    }
}

class Student extends Person
{
    public void set()
    {
        age = 30;
        name = "홍길동";
        height = 175;
        setWeight(99);
    }
}

public class InheritanceEx
{
    public static void main(String[] args)
    {
        Student s = new Student();
        s.set();
        System.out.println("상속 관계에 있는 클래스간 멤버 접근여부 확인");
    }
}
