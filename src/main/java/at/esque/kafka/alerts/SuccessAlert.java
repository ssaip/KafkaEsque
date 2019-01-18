package at.esque.kafka.alerts;

import at.esque.kafka.Main;
import javafx.scene.control.Alert;

public final class SuccessAlert {
    public static void show(String title, String header, String content) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        Main.applyStylesheet(alert.getDialogPane().getScene());
        Main.applyIcon(alert);

        alert.showAndWait();
    }
}
