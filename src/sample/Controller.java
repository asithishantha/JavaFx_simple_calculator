//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {
    float data = 0.0F;
    int operation = -1;
    float answer=0f;
    @FXML
    private Button add;
    @FXML
    private Button sub;
    @FXML
    private Button nine;
    @FXML
    private Button mul;
    @FXML
    private Button six;
    @FXML
    private Button one;
    @FXML
    private TextField display;
    @FXML
    private Button clear;
    @FXML
    private Button seven;
    @FXML
    private Button three;
    @FXML
    private Button two;
    @FXML
    private Button eight;
    @FXML
    private Button equal;
    @FXML
    private Button zero;
    @FXML
    private Button four;
    @FXML
    private Button division;
    @FXML
    private Button five;

    public Controller() {
    }

    @FXML  //this is button click event. if user clicks any button , it will redirect to here. according to the value of button , task will process.
    void pressButtonAction(ActionEvent event) {
        if (event.getSource() == this.one) {
            this.display.setText(this.display.getText() + "1");
        } else if (event.getSource() == this.two) {
            this.display.setText(this.display.getText() + "2");
        } else if (event.getSource() == this.three) {
            this.display.setText(this.display.getText() + "3");
        } else if (event.getSource() == this.four) {
            this.display.setText(this.display.getText() + "4");
        } else if (event.getSource() == this.five) {
            this.display.setText(this.display.getText() + "5");
        } else if (event.getSource() == this.six) {
            this.display.setText(this.display.getText() + "6");
        } else if (event.getSource() == this.seven) {
            this.display.setText(this.display.getText() + "7");
        } else if (event.getSource() == this.eight) {
            this.display.setText(this.display.getText() + "8");
        } else if (event.getSource() == this.nine) {
            this.display.setText(this.display.getText() + "9");
        } else if (event.getSource() == this.zero) {
            this.display.setText(this.display.getText() + "0");
        } else if (event.getSource() == this.clear) {
            this.display.setText("");
        } else if (event.getSource() == this.add) {
            this.data = Float.parseFloat(this.display.getText());
            this.operation = 1;
            this.display.setText("");
        } else if (event.getSource() == this.sub) {
            this.data = Float.parseFloat(this.display.getText());
            this.operation = 2;
            this.display.setText("");
        } else if (event.getSource() == this.mul) {
            this.data = Float.parseFloat(this.display.getText());
            this.operation = 3;
            this.display.setText("");
        } else if (event.getSource() == this.division) {
            this.data = Float.parseFloat(this.display.getText());
            this.operation = 4;
            this.display.setText("");
        } else if (event.getSource() == this.equal) {
            float secondOperand = Float.parseFloat(this.display.getText());

            switch(this.operation) {
                case 1:
                    answer = this.data + secondOperand;
                    this.display.setText(String.valueOf(answer));answer=0;
                    break;
                case 2:
                    answer = this.data - secondOperand;
                    this.display.setText(String.valueOf(answer));answer=0;
                    break;
                case 3:
                    answer = this.data * secondOperand;
                    this.display.setText(String.valueOf(answer));answer=0;
                    break;
                case 4:

//handle the division with try catch exception
                    try {
                        answer = this.data / secondOperand;
                    } catch (ArithmeticException e) {
                        this.display.setText("division by zero ");
                    }

                    this.display.setText(String.valueOf(answer));
            }
        }

    }
}
