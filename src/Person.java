class Person {
    private String name;
    private int age;
    private boolean marriage;
public Person(String name ,int age,boolean marriage){
    this.name=name;
    this.age=age;
    this.marriage=marriage;

}
    public String getName() {
        return name;
    }

    public int getAge() {
        return age ;
    }

    public boolean isMarried() {
        return marriage;
    }
}