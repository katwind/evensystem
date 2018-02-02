package manager;

import model.User;
import model.Form;

public class DataManager {

    User user;
    Form form;

    private static DataManager instance;

    private DataManager() {

    }

    public static DataManager getInstance() {
        if (instance == null)
            instance = new DataManager();
        return instance;
    }

    public void createNewUser(String fname, String sname, String tname, String address, String tel,
                              String sex, String birthdate, String passseries, String passnum,
                              String passgiven, String passdate, String passpers, String position,
                              String education, String experience, String functions, String fstatus,
                              String children, String hobbies, String additional) {

        this.user = (new User.Builder())
                .setFname(fname)
                .setSname(sname)
                .setTname(tname)
                .setAddress(address)
                .setTel(tel)
                .setSex(sex)
                .setBirthdate(birthdate)
                .setPassseries(passseries)
                .setPassnumber(passnum)
                .setPassgiven(passgiven)
                .setPassdate(passdate)
                .setPasspers(passpers)
                .setPosition(position)
                .setEducation(education)
                .setExperience(experience)
                .setFunctions(functions)
                .setFamilystatus(fstatus)
                .setChildren(children)
                .setHobbies(hobbies)
                .setAdditional(additional)
                .build();
    }

    public void addUser(User u) {
        this.user = u;
    }

    public void addForm(User u) {
        this.user = u;
    }
}
