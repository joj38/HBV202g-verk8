package org.example;

public class Student extends User{
    private boolean feePiad;

    public Student(String name, boolean feePiad){
        super(name);
        this.feePiad=feePiad;
    }

    public boolean isFeePiad(){
        return feePiad;
    }

    public void setFeePiad(boolean feePiad) {
        this.feePiad = feePiad;
    }
}
