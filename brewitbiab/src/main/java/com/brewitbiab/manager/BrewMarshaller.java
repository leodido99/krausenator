package com.brewitbiab.manager;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Class used to unmarshall object lists from xml file.
 * The class tries to unmarshall the given file using the class type provided through the generic type.
 */
public class BrewMarshaller <T> {

    /**
     * Default constructor
     */
    private BrewMarshaller() {

    }

    /**
     * 
     */
    private T marshalled;

    /**
     * Try to extract objects of the generic type specified from the XML file
     * @param xmlFileName XML file to marshall
     */
    public BrewMarshaller(Class<T> marshallTo, String xmlFileName) throws FileNotFoundException {
        try {
            /* Get file from resource folder */
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource(xmlFileName).getFile());
            if (file.exists() == false) {
                throw new FileNotFoundException();
            }
            JAXBContext jaxbContext = JAXBContext.newInstance(marshallTo);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            this.marshalled = (T)jaxbUnmarshaller.unmarshal(file);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    /**
     * Returns the marshalled item, depending on the class type
     * @return marshalled item
     */
    public T getMarshalled() {
        return this.marshalled;
    }

    /**
     * Sets the marshalled
     * @param value marshalled
     */
    public void setMarshalled(T value) {
        this.marshalled = value;
    }

}