package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;

public class Controller {

    double num1,num2,result;
    double degrees,radians,exp;
    boolean isNumber;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtInput1;

    @FXML
    private TextField txtInput2;

    @FXML
    private Label lblOutput;

    @FXML
    private Button btnSin;

    @FXML
    private Button btnE;

    @FXML
    private Button btnTan;

    @FXML
    private Button btnCos;

    /*Check numbers in the two textfields are numbers or not for Addition, Subtraction,
    Multiplication and Division */
    public boolean checkInputsAreNumbers(){

        try{
            num1=Double.parseDouble(txtInput1.getText());
            num2=Double.parseDouble(txtInput2.getText());
            isNumber=true;
        }catch (NumberFormatException e){

            lblOutput.setText("Please enter a number");
            isNumber = false;
        }
        return isNumber;
    }

    /*Check numbers in the one textfield is a number or not for sine, cosine
    tan, and exponential */
    public boolean checkInputIsANumber(){
        try{
            num1=Double.parseDouble(txtInput1.getText());
            isNumber= true;

        }catch (NumberFormatException e){

            lblOutput.setText("Please enter a number");
            isNumber= false;
        }
        return isNumber;
    }

    //Clear all the textfields, output label and enable sin,cos,tan,exponential buttons
    @FXML
    void DeleteAction(ActionEvent event) {
        txtInput1.setText("");
        txtInput2.setText("");
        lblOutput.setText("");
        btnSin.setDisable(false);
        btnCos.setDisable(false);
        btnTan.setDisable(false);
        btnE.setDisable(false);
    }

    //Addition
    @FXML
    void additionAction(ActionEvent event) {
       boolean number=checkInputsAreNumbers();
            if(number) {
                result = num1 + num2;
                lblOutput.setText(Double.toString(result));
            }
    }

    //Subtraction
    @FXML
    void subtractionAction(ActionEvent event) {
        boolean number=checkInputsAreNumbers();
        if(number){
            result=num1-num2;
            lblOutput.setText(Double.toString(result));
        }
    }

    //Division
    @FXML
    void divisionAction(ActionEvent event) {
        boolean number=checkInputsAreNumbers();
        if(number){
            result=num1/num2;
            lblOutput.setText(Double.toString(result));
        }
    }


    //Multiplication
    @FXML
    void multiplicationAction(ActionEvent event) {
        boolean number=checkInputsAreNumbers();
        if(number){
            result=num1*num2;
            lblOutput.setText(Double.toString(result));
        }
    }

    //Sine
    @FXML
    void sinAction(ActionEvent event) {
        boolean number=checkInputIsANumber();
        if(number){
            degrees=num1;
            radians=Math.toRadians(degrees);
            lblOutput.setText(Double.toString(Math.sin(radians)));
        }
    }

    //Cosine
    @FXML
    void cosAction(ActionEvent event) {
        boolean number=checkInputIsANumber();
        if(number){
            degrees=num1;
            radians=Math.toRadians(degrees);
            lblOutput.setText(Double.toString(Math.cos(radians)));
        }
    }

    //tan
    @FXML
    void tanAction(ActionEvent event) {
        boolean number=checkInputIsANumber();
        if(number){
            degrees=num1;
            radians=Math.toRadians(degrees);
            lblOutput.setText(Double.toString(Math.tan(radians)));
        }
    }

    //exponential
    @FXML
    void exponentialAction(ActionEvent event) {
        boolean number=checkInputIsANumber();
        if(number){
            exp=num1;
            lblOutput.setText(Double.toString(Math.exp(exp)));
        }
    }

    //textInput1
    @FXML
    void txtInputAction1(KeyEvent event) {
    }

    //textInput2
    @FXML
    void txtInputAction2(KeyEvent event) {
        btnSin.setDisable(true);
        btnCos.setDisable(true);
        btnTan.setDisable(true);
        btnE.setDisable(true);
    }

    @FXML
    void initialize() {

    }
}
