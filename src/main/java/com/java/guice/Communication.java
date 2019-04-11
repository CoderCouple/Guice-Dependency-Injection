package com.java.guice;

import com.google.inject.name.Named;
import javax.inject.Inject;
import java.util.logging.Logger;

public class Communication {

    @Inject @Named("Default")
    private Communicator communicator;

    @Inject @Named("SMSComm")
    private CommunicationMode smsCommunicationMode;

    private CommunicationMode emailCommunicationMode;

    @Inject @Named("IMComm")
    private CommunicationMode imCommunicationMode;

    @Inject
    private Logger logger;

    public Communication(Boolean keepTrack) {
        if(keepTrack){
            System.out.println("Logging is enabled !!!");
        }
    }

    @Inject
    public Communication(@Named("IMComm") CommunicationMode imCommunicationMode) {
        this.imCommunicationMode=imCommunicationMode;
    }

    @Inject
    public void setEmailCommunicationMode(@Named("EmailComm") CommunicationMode emailCommunicationMode) {
        this.emailCommunicationMode = emailCommunicationMode;
    }

    boolean sendMessage(String message){
        return communicator.sendMessage();
    }

}
