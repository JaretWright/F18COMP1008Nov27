/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18comp1008nov20;

import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author jwright
 */
public class StudentCreatorController implements Initializable {

    @FXML
    private TextField firstNameTextField;

    @FXML
    private TextField lastNameTextField;

    @FXML
    private DatePicker birthdayDatePicker;

    @FXML
    private ComboBox<String> genderComboBox;

    @FXML
    private ImageView imageView;
    
    @FXML
    private Label errMsgLabel;
    
    
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //configure the combobox
        genderComboBox.setPromptText("Select gender");
        genderComboBox.getItems().add("male");
        genderComboBox.getItems().add("female");
        genderComboBox.getItems().add("other");
        
        errMsgLabel.setText("");
        
    }    
    
    @FXML
    public void genderChanger()
    {
        String gender = genderComboBox.getValue();
        if (gender.equalsIgnoreCase("male"))
            imageView.setImage(new Image("./images/male.png"));
        else if (gender.equalsIgnoreCase("female"))
            imageView.setImage(new Image("./images/female.png"));
        else
            imageView.setImage(new Image("./images/other.png"));
    }
    
    @FXML
    public void createStudentButtonPushed()
    {
        if (this.birthdayDatePicker.getValue() != null)
        {
            try{
                Student newStudent = new Student(1, 
                                        this.firstNameTextField.getText(),
                                        this.lastNameTextField.getText(),
                                        this.genderComboBox.getValue(), 
                                        this.birthdayDatePicker.getValue());
                System.out.println(newStudent);
            } catch (IllegalArgumentException e)
            {
                errMsgLabel.setText(e.getMessage());
            }
        }
        else
        {
            errMsgLabel.setText("You need to set the birthday");
        }
        
    }
    
}
