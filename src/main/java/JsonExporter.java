import com.fasterxml.jackson.databind.ObjectMapper;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.io.IOException;
import java.util.*;

public class JsonExporter {

    public static void exportTableToJson(JTable table, String filePath) {
        DefaultTableModel model = (DefaultTableModel) table.getModel();
        List<Map<String, Object>> rows = new ArrayList<>();

        for (int i = 0; i < model.getRowCount(); i++) {
            Map<String, Object> rowData = new LinkedHashMap<>();
            for (int j = 0; j < model.getColumnCount(); j++) {
                rowData.put(model.getColumnName(j), model.getValueAt(i, j));
            }
            rows.add(rowData);
        }

        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writerWithDefaultPrettyPrinter().writeValue(new File(filePath), rows);
            System.out.println(" Export successful: " + filePath);
        } catch (IOException e) {
            System.err.println("Export failed:");
            e.printStackTrace();
        }
    }
}
