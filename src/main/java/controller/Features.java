package controller;

import java.io.File;
import model.formatters.Formats;

public interface Features {
    /**
     * Search the text input in the file.
     */
    void search();

    /**
     * Export the list to the file.
     */
    void exportList(File file, Formats format);
    
}
