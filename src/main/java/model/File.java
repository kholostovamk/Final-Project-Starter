package model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import model.formatters.PetXmlWrapper;
import model.formatters.DataFormatter;
import model.formatters.Formats;

public class File implements FileInterface {
    String DATAPATH = "data/petslist.xml";
    private final File xmlFile;

    public File() {
        this.xmlFile = new File();
    }
    

    @Override
    public List<PetRecord> loadInventoryFromFile() {
        if (!xmlFile.exists()) {
            System.out.println("XML file does not exist");
            return Collections.emptyList();
        }

        try {
            XmlMapper mapper = new XmlMapper();
            PetXmlWrapper wrapper = mapper.readValue(xmlFile, PetXmlWrapper.class);
            Collection<PetRecord> pet = wrapper.getPet();

            if (pet == null || pet.isEmpty()) {
                return Collections.emptyList();
            }
            return new ArrayList<>(pet);

        } catch (IOException e) {
            System.out.println("Error loading records from " + e.getMessage());
            e.printStackTrace();
            return Collections.emptyList();
        }

    }

    @Override
    public void saveInventoryToFile(List<PetRecord> pets, java.io.File file, Formats format) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'saveInventoryToFile'");
    }
    
    
} 
