package com.example.wswsw.takehomeassignment09;

public class Client {
    public String name;
    public String country;
    public int age;
    public boolean isMale;

    public String getName(){return name;}

    public String getCountry(){return country;}

    public int getAge(){return age;}

    public boolean getIsMale(){return isMale;}

    public void setName(String name){this.name=name;}
    public void setCountry(String country){this.country=country;}
    public void setAge(int age){this.age=age;}
    public void setIsMale(boolean aMale){this.isMale=isMale;}

    public Client(String name, String country, int age, boolean isMale){
        this.name = name;
        this.country = country;
        this.age = age;
        this.isMale = isMale;
    }

    public Client() {
    }

    public String toString(){
        return "Name: "+name+"\nCountry: "+country+"\nAge: "+age+"\nMale: "+isMale;
    }

}
