package com.SpringSystem.oopsConcept;

class Person {
    private String person_name; //Encapsulation data
    private String designation;

    public String getPerson_name() {
        return person_name;
    }

    public void setPerson_name(String person_name) {
        this.person_name = person_name;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        if(designation != null) {
        this.designation = designation;
    }
  }
}
class BankAccount {
    private double balance;
    public void deposit(double Amount) {
        balance += Amount;
    }
    public void withDraw(double Amount) {
        balance -= Amount;
    }
    public double getBalance() {
        return balance;
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        Person obj = new Person();
        obj.setPerson_name("Sonu Shina");
        obj.setDesignation("Businessman");
        System.out.println(obj.getPerson_name());
        System.out.println(obj.getDesignation());

        BankAccount bankAccount = new BankAccount();
        bankAccount.deposit(1000);
        bankAccount.deposit(2000);
        bankAccount.withDraw(500);
        System.out.println("Current Balance in your account "+bankAccount.getBalance());
    }
}
