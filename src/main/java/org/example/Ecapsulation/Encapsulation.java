package org.example.Ecapsulation;

public class Encapsulation {

    private int id;
    private String name;
    private int age;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name= name;
    }

    public static void main(String[] args) {

        Encapsulation escp = new Encapsulation();
        escp.setId(1);
        escp.setName("Neha");
        escp.setAge(21);

        System.out.println("ID" + escp.getId());
        System.out.println("Name"+ escp.getName());
        System.out.println("Age"+ escp.getAge());
    }

}


