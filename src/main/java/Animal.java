 abstract class Animal{
    protected String name;
    protected int age;
    protected String type;
    protected int position;

    public Animal(String name, int age, String type, int position){
        this.name = name;
        this.age = age;
        this.type = type;
        this.position = position;
    }
    
    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public String getType(){
        return this.type;
    }

    public int getPosition(){
        return this.position;
    }
    
    public String sleep(){
        return "Zzz";
    }

    abstract String animalSound();

    abstract void move();
}