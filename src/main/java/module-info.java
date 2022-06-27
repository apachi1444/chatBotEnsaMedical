module com.n2mbot.n4mbot
{
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires org.controlsfx.controls;
    requires javafx.graphics;
//    requires google.cloud.dialogflow;
//    requires proto.google.cloud.dialogflow.v2;
    requires gax;


    exports com.ensabot.main.hello;
    opens com.ensabot.main.hello to javafx.fxml;

    exports com.ensabot.main.login;
    opens com.ensabot.main.login to javafx.fxml;

    exports com.ensabot.main.register;
    opens com.ensabot.main.register to javafx.fxml;

    exports com.ensabot.main.home;
    opens com.ensabot.main.home to javafx.fxml;

    exports com.ensabot.main.chatbots.alexa;
    opens com.ensabot.main.chatbots.alexa to javafx.fxml;



    exports com.ensabot.main.chatbots.siri;
    opens com.ensabot.main.chatbots.siri to javafx.fxml;

    exports com.ensabot.main.parameter;
    opens com.ensabot.main.parameter to javafx.fxml;

}