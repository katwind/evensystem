package UI;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.event.ActionEvent;
import manager.DataManager;
import model.User;


public class UsersController {

    @FXML
    private TextField fNametext;

    @FXML
    private TextField sNametext;

    @FXML
    private TextField tNametext;

    @FXML
    private TextField addresstext;

    @FXML
    private TextField teltext;

    @FXML
    private TextField sextext;

    @FXML
    private TextField bdatetext;

    @FXML
    private TextField seriestext;

    @FXML
    private TextField numtext;

    @FXML
    private TextField datetext;

    @FXML
    private TextField giventext;

    @FXML
    private TextField persontext;

    @FXML
    private TextField positiontext;

    @FXML
    private TextField educattext;

    @FXML
    private TextField exptext;

    @FXML
    private TextField functext;

    @FXML
    private TextField famtext;

    @FXML
    private TextField childtext;

    @FXML
    private TextField hobbytext;

    @FXML
    private TextField addittext;

    @FXML
    private Button accept;

    @FXML
    private Button upd;

    @FXML
    private Button back;

    @FXML
    private Button del;

    public void saveUser(ActionEvent event){

        User u = (new User.Builder())
                .setFname(fNametext.getText())
                .setSname(sNametext.getText())
                .setTname(tNametext.getText())
                .setAddress(addresstext.getText())
                .setTel(teltext.getText())
                .setSex(sextext.getText())
                .setBirthdate(bdatetext.getText())
                .setPassseries(seriestext.getText())
                .setPassnumber(numtext.getText())
                .setPassgiven(giventext.getText())
                .setPassdate(datetext.getText())
                .setPasspers(persontext.getText())
                .setPosition(positiontext.getText())
                .setEducation(educattext.getText())
                .setExperience(exptext.getText())
                .setFunctions(functext.getText())
                .setFamilystatus(famtext.getText())
                .setChildren(childtext.getText())
                .setHobbies(hobbytext.getText())
                .setAdditional(addittext.getText())
                .build();

        DataManager.getInstance().addUser(u);
    }
}
