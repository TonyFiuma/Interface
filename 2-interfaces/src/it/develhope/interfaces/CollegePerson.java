package it.develhope.interfaces;

/**
 * Generic superclass that describes a person that goes daily to the college.
 */
/*
3 attributes (`name`, `surname` and a numeric `collegeId`)
  * a method `goToCollege` that prints all the `CollegePerson` attributes
 */
public class CollegePerson{
    private String name;
    private String surname;
    private int collegeId;

    public CollegePerson(){
    }

    public CollegePerson(String name,String surname,int collegeId){
        this.name = name;
        this.surname = surname;
        this.collegeId = collegeId;
    }



    public void goToCollege(){
        System.out.println("CollegePerson{"+"name='"+name+'\''+", surname='"+surname+'\''+", collegeId="+collegeId+'}');
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getSurname(){
        return surname;
    }

    public void setSurname(String surname){
        this.surname = surname;
    }

    public int getCollegeId(){
        return collegeId;
    }

    public void setCollegeId(int collegeId){
        this.collegeId = collegeId;
    }
}

