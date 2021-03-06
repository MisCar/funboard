package org.miscar.funboard.widget;

import com.google.common.collect.ImmutableList;
import edu.wpi.first.shuffleboard.api.prefs.Group;
import edu.wpi.first.shuffleboard.api.prefs.Setting;
import edu.wpi.first.shuffleboard.api.widget.Description;
import edu.wpi.first.shuffleboard.api.widget.ParametrizedController;
import edu.wpi.first.shuffleboard.api.widget.SimpleAnnotatedWidget;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.image.ImageView;

import java.util.List;

@Description(
        name = "Image",
        dataTypes = String.class,
        summary = "Displays an image"
)
@ParametrizedController("ImageWidget.fxml")
public final class ImageWidgetController extends SimpleAnnotatedWidget<String> {
    @FXML
    private Pane root;

    @FXML
    private ImageView image;

    @FXML
    private void initialize() {
        dataOrDefault.addListener((__, oldUrl, newUrl) -> {
            image.setImage(new Image(newUrl));
        });

        image.setImage(new Image("file://C:\\Users\\progr\\Developer\\2022-robot\\src\\main\\resources\\images\\kumkum.png"));

        root.widthProperty().addListener((__, oldWidth, newWidth) -> {
            image.setFitWidth((double)newWidth - 10);
        });

        root.heightProperty().addListener((__, oldHeight, newHeight) -> {
            image.setFitHeight((double)newHeight - 10);
        });
    }

    @Override
    public Pane getView() {
        return root;
    }

    @Override
    public List<Group> getSettings() {
        return ImmutableList.of();
    }
}
