package org.miscar.funboard;

import edu.wpi.first.shuffleboard.api.plugin.Description;
import edu.wpi.first.shuffleboard.api.plugin.Plugin;
import edu.wpi.first.shuffleboard.api.theme.Theme;
import edu.wpi.first.shuffleboard.api.widget.ComponentType;
import edu.wpi.first.shuffleboard.api.widget.WidgetType;
import org.miscar.funboard.widget.ImageWidgetController;

import java.util.List;

@Description(
        group="org.miscar",
        name = "Funboard",
        version = "2021.1.1",
        summary = "MisCar's fun shuffleboard plugin"
)
public final class FunboardPlugin extends Plugin {
    @Override
    public List<ComponentType> getComponents() {
        return List.of(
                WidgetType.forAnnotatedWidget(ImageWidgetController.class)
        );
    }

    @Override
    public List<Theme> getThemes() {
        System.out.println("Get Themes Called");
        return List.of(new Theme(getClass(), "MisCar Dark", "miscar-dark.css"));
    }
}