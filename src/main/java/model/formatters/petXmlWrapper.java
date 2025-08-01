package model.formatters;

import java.util.Collection;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;

import model.FileInterface;


/**
 * This wrapper helps when using Jackson to serialize a list of domain records to xml. Without this,
 * it tries to use <ArrayList> and <item> tags instead of <petList> and <pet> tags
 */
@JacksonXmlRootElement(localName = "petList")
public final class PetXmlWrapper {

    /** List of the records. */
    @JacksonXmlElementWrapper(useWrapping = false)
    private Collection<FileInterface.PetRecord> pet;


    /**
     * Empty constructor for Jackson.
     */
    public PetXmlWrapper() {
        // Needed for Jackson
    }

    /**
     * Constructor.
     * @param records the records to wrap
     */
    public PetXmlWrapper(Collection<FileInterface.PetRecord> records) {
        this.pet = records;
    }

    /**
     * Get domain from collections of DNRecord.
     *
     * @return Collection of DNRecord of its Domain.
     */
    public Collection<FileInterface.PetRecord> getPet() {
        return pet;
    }


    /**
     * Set each DNRecord of Domain.
     * @param pet
     */
    public void setDomain(Collection<FileInterface.PetRecord> pet) {
        this.pet = pet;
    }



    
}
