package model.formatters;

import java.io.PrintStream;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import javax.annotation.Nonnull;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import model.FileInterface;


/**
 * A class to format the data in different ways
 */
public class DataFormatter {

    /**
     * Private constructor to prevent instantiation.
     */
    private DataFormatter() {

    }
    

    /**
     * Pretty print the data in a human readable format.
     *
     * @param records the records to print
     * @param out the output stream to write to
     */
    private static void prettyPrint(Collection<FileInterface.PetRecord> records, OutputStream out) {
        PrintStream pout = new PrintStream(out); // so i can use println
        for (FileInterface.PetRecord record : records) {
            prettySingle(record, pout);
            pout.println();
        }
    }

    /**
     * Pretty print a single record.
     * @param record the record to print
     * @param out the output stream to write to
     */
    private static void prettySingle(@Nonnull FileInterface.PetRecord record, @Nonnull PrintStream out) {
        out.println(record.name());
        out.println("                 Animal: " + record.animal());
        out.println("                     ID: " + record.id());
        out.println("                    Age: " + record.age());
        out.println("                  Breed: " + record.breed());
        out.println("                 Weight: " + record.weight());
        out.println("                 Gender: " + record.gender());
        out.println(" IsIndoorOnly/Istrained: " + record.specialInfo());

    }



    /**
     * Write the data as XML.
     *
     * @param records the records to write
     * @param out the output stream to write to
     */
    private static void writeXmlData(Collection<FileInterface.PetRecord> records, OutputStream out) {
        try {
            XmlMapper mapper = new XmlMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            PetXmlWrapper wrapper = new PetXmlWrapper(records);
            mapper.writeValue(out, wrapper);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Write the data as JSON.
     *
     * @param records the records to write
     * @param out the output stream to write to
     */
    private static void writeJsonData(Collection<FileInterface.PetRecord> records, OutputStream out) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.enable(SerializationFeature.INDENT_OUTPUT);
            mapper.writeValue(out, records);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    /**
     * Write the data in the specified format.
     *
     * @param records the records to write
     * @param format the format to write the records in
     * @param out the output stream to write to
     */
    public static void write(@Nonnull List<FileInterface.PetRecord> records, @Nonnull Formats format,
                             @Nonnull OutputStream out) {

        switch (format) {
            case XML:
                writeXmlData(records, out);
                break;
            case JSON:
                writeJsonData(records, out);
                break;
            default:
                prettyPrint(records, out);

        }
    }
    
    

}
