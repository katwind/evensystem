package model;

public interface UserBuilder {
    public User.Builder setFname(String fname);
    public User.Builder setSname(String sname);
    public User.Builder setTname(String tname);
    public User.Builder setAddress(String address);
    public User.Builder setTel(String tel);
    public User.Builder setSex(String sex);
    public User.Builder setBirthdate(String birthdate);
    public User.Builder setPassseries(String passseries);
    public User.Builder setPassnumber(String passnum);
    public User.Builder setPassgiven(String passgiven);
    public User.Builder setPassdate(String passdate);
    public User.Builder setPasspers(String passpers);
    public User.Builder setPosition(String position);
    public User.Builder setEducation(String education);
    public User.Builder setExperience(String experience);
    public User.Builder setFunctions (String functions);
    public User.Builder setFamilystatus (String fstatus);
    public User.Builder setChildren (String children);
    public User.Builder setHobbies (String hobbies);
    public User.Builder setAdditional (String additional);
    public User build();
}
