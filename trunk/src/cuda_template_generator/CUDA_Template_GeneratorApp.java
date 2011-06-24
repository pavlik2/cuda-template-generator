/*
 * CUDA_Template_GeneratorApp.java
 */

package cuda_template_generator;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;

/**
 * The main class of the application.
 */
public class CUDA_Template_GeneratorApp extends SingleFrameApplication {

    /**
     * At startup create and show the main frame of the application.
     */
    @Override protected void startup() {
        show(new CUDA_Template_GeneratorView(this));
    }

    /**
     * This method is to initialize the specified window by injecting resources.
     * Windows shown in our application come fully initialized from the GUI
     * builder, so this additional configuration is not needed.
     */
    @Override protected void configureWindow(java.awt.Window root) {
    }

    /**
     * A convenient static getter for the application instance.
     * @return the instance of CUDA_Template_GeneratorApp
     */
    public static CUDA_Template_GeneratorApp getApplication() {
        return Application.getInstance(CUDA_Template_GeneratorApp.class);
    }

    /**
     * Main method launching the application.
     */
    public static void main(String[] args) {
        launch(CUDA_Template_GeneratorApp.class, args);
    }
}
