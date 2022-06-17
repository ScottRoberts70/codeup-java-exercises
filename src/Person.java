public class Person {
    private String name;

    public String getName(){
    return name;
    }

    public void setName(String name){
    this.name = name;
    }

    public void sayHello() {
        System.out.printf("Hello %s !", this.name);
    }

    public Person(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Person scott = new Person("Scott");
        System.out.println(scott.getName());
        System.out.printf(scott.sayHello());

    }

}

