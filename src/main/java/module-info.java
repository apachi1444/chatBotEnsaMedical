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


    exports com.n4mbot.master.hello;
    opens com.n4mbot.master.hello to javafx.fxml;

    exports com.n4mbot.master.login;
    opens com.n4mbot.master.login to javafx.fxml;

    exports com.n4mbot.master.register;
    opens com.n4mbot.master.register to javafx.fxml;

    exports com.n4mbot.master.home;
    opens com.n4mbot.master.home to javafx.fxml;

    exports com.n4mbot.master.chats.alexa;
    opens com.n4mbot.master.chats.alexa to javafx.fxml;

    exports com.n4mbot.master.chats.glover;
    opens com.n4mbot.master.chats.glover to javafx.fxml;

    exports com.n4mbot.master.chats.siri;
    opens com.n4mbot.master.chats.siri to javafx.fxml;

    exports com.n4mbot.master.parameter;
    opens com.n4mbot.master.parameter to javafx.fxml;

}