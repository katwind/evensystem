package model;

public class User {
    public String fname;
    public String sname;
    public String tname;
    public String address;
    public String tel;
    public String sex;
    public String birthdate;
    public String passseries;
    public String passnum;
    public String passgiven;
    public String passdate;
    public String passpers;
    public String position;
    public String education;
    public String experience;
    public String functions;
    public String fstatus;
    public String children;
    public String hobbies;
    public String additional;

    private User() {

    }

    public static class Builder implements UserBuilder {
        private static User user = new User();

        public void Builder(){
        }

        @Override
        public Builder setFname(String fname) {
            user.fname = fname;
            return this;
        }

        @Override
        public Builder setSname(String sname) {
            user.sname = sname;
            return this;
        }

        @Override
        public Builder setTname(String tname) {
            user.tname = tname;
            return this;
        }

        @Override
        public Builder setAddress(String address) {
            user.address = address;
            return this;
        }

        @Override
        public Builder setTel(String tel) {
            user.tel = tel;
            return this;
        }

        @Override
        public Builder setSex (String sex) {
            user.sex = sex;
            return this;
        }

        @Override
        public Builder setBirthdate(String birthdate) {
            user.birthdate = birthdate;
            return this;
        }

        @Override
        public Builder setPassseries(String passseries) {
            user.passseries = passseries;
            return this;
        }

        @Override
        public Builder setPassnumber(String passnum) {
            user.passnum = passnum;
            return this;
        }

        @Override
        public Builder setPassgiven(String passgiven) {
            user.passgiven = passgiven;
            return this;
        }

        @Override
        public Builder setPassdate(String passdate) {
            user.passdate = passdate;
            return this;
        }

        @Override
        public Builder setPasspers(String passpers) {
            user.passpers = passpers;
            return this;
        }

        @Override
        public Builder setPosition(String position) {
            user.position = position;
            return this;
        }

        @Override
        public Builder setEducation(String education) {
            user.education = education;
            return this;
        }

        @Override
        public Builder setExperience(String experience) {
            user.experience = experience;
            return this;
        }

        @Override
        public Builder setFunctions(String functions) {
            user.functions = functions;
            return this;
        }

        @Override
        public Builder setFamilystatus(String fstatus) {
            user.fstatus = fstatus;
            return this;
        }

        @Override
        public Builder setChildren(String children) {
            user.children = children;
            return this;
        }

        @Override
        public Builder setHobbies(String hobbies) {
            user.hobbies = hobbies;
            return this;
        }

        @Override
        public Builder setAdditional(String additional) {
            user.additional = additional;
            return this;
        }

        public User build() {
            if(user.fname != null && user.sname != null && user.tname != null && user.address != null && user.tel != null) {
                return this.user;
            }
            return null;
        }
    }
}
