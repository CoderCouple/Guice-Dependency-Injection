package com.java.guice;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.google.inject.name.Names;

public class BasicModule extends AbstractModule {
    @Override
    protected void configure() {
        bind(Communicator.class).annotatedWith(Names.named("Default")).to(DefaultCommunicatorImpl.class).in(Scopes.SINGLETON);
        bind(Communicator.class).toInstance(new DefaultCommunicatorImpl());
        bind(CommunicationMode.class).annotatedWith(Names.named("SMSComm")).to(SMSCommunicationMode.class);
        bind(CommunicationMode.class).annotatedWith(Names.named("EmailComm")).to(EmailCommunicationMode.class);
        bind(CommunicationMode.class).annotatedWith(Names.named("IMComm")).to(IMCommunicationMode.class);

    }
}
