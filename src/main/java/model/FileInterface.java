package model;
// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// import com.fasterxml.jackson.annotation.JsonPropertyOrder;
// import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
// import student.model.formatters.Formats;


import java.io.File;
import java.io.IOException;
import java.util.List;

import model.formatters.Formats;


public interface FileInterface {

    /** Do not change the file address! */
    String DATAPATH = "data/petslist.xml";

    /**
     * Get the pet records from the file.
     * @return The list of records
     */
    List<PetRecord> loadInventoryFromFile();


    /**
     * Save the pet list records.
     * @param pets All pets records to be saved
     * @param File The Filename
     * @param format The format
     * @throws IOException If errors, throw error message
     */
    void saveInventoryToFile(List<PetRecord> pets, File file, Formats format);


    
    // +saveDesiredList(DesiredPetList, filename: String): void
    // +loadDesiredList(filename: String): DesiredPetList


    /**
     * The record to pass around between objects. Is immutable and uses Jackson annotations for serialization.
     * @param animal 
     * @param id
     * @param name
     * @param age
     * @param breed
     * @param weight
     * @param gender
     * @param specialInfo
     * @return return the record
     */
    // @JsonIgnoreProperties(ignoreUnknown = true)
    // @JacksonXmlRootElement(localName = "pet")
    // @JsonPropertyOrder({"animal,"id", "name", "age", "breed", "weight", "gender", "specialInfo"})
    record PetRecord(String animal, String id, String name, int age, String breed, double weight, char gender, boolean specialInfo) {
    }

}

