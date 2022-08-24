package com.hib.model;

import javax.persistence.*;

@Entity
@Table(name = "USER")
public class User {
    private Integer id;
    private String fullname;
    private String email;
    private String password;
    private int age;
    private double salary;
    private String city;

    public User() {}

    public User(String fullname, String email, String password, int age, double salary, String city) {
        this.fullname = fullname;
        this.email = email;
        this.password = password;
        this.age = age;
       this.salary = salary;
        this.city = city;
            }

    /**
     * this @Column is creating a column in the table and naming it User_ID
     * @Id is creating a Primary key and that value is generated automatically
     * @return
     */
    // name is an attribute whos name is USER_ID
    @Column(name ="USER_ID")
    @Id
    // strategy is an attribute
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }
}
