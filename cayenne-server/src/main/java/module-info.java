module cayenneServer {
    requires slf4j.api;
    requires java.desktop;
    requires java.base;
    requires java.datatransfer;
    requires java.prefs;
    requires java.sql;
    requires java.xml;

    requires cayenneDI;
    requires java.naming;

    exports org.apache.cayenne.configuration.server;
    exports org.apache.cayenne.configuration;
    exports org.apache.cayenne.configuration.xml;
    exports org.apache.cayenne.dba;
    exports org.apache.cayenne.validation;
    exports org.apache.cayenne.query;
    exports org.apache.cayenne;
    exports org.apache.cayenne.map;
    exports org.apache.cayenne.util;
    exports org.apache.cayenne.resource;
    exports org.apache.cayenne.ejbql;
    exports org.apache.cayenne.exp;
    exports org.apache.cayenne.dba.db2;
    exports org.apache.cayenne.dba.derby;
    exports org.apache.cayenne.dba.firebird;
    exports org.apache.cayenne.dba.h2;
    exports org.apache.cayenne.dba.hsqldb;
    exports org.apache.cayenne.dba.ingres;
    exports org.apache.cayenne.dba.mysql;
    exports org.apache.cayenne.dba.openbase;
    exports org.apache.cayenne.dba.oracle;
    exports org.apache.cayenne.dba.postgres;
    exports org.apache.cayenne.dba.sqlserver;
    exports org.apache.cayenne.dba.sybase;
    exports org.apache.cayenne.conn;
    exports org.apache.cayenne.datasource;
    exports org.apache.cayenne.access.types;
    exports org.apache.cayenne.access.translator.batch;
    exports org.apache.cayenne.log;
    exports org.apache.cayenne.dba.frontbase;
    exports org.apache.cayenne.dba.mariadb;
    exports org.apache.cayenne.dba.sqlite;
    exports org.apache.cayenne.access.flush;
    exports org.apache.cayenne.access.flush.operation;
    exports org.apache.cayenne.access;
    exports org.apache.cayenne.map.event;
    exports org.apache.cayenne.access.translator;
    exports org.apache.cayenne.reflect;
    exports org.apache.cayenne.event;
    exports org.apache.cayenne.exp.parser;
    exports org.apache.cayenne.exp.property;
    exports org.apache.cayenne.access.dbsync;

    exports org.apache.cayenne.cache;
    exports org.apache.cayenne.tx;
    exports org.apache.cayenne.ashwood;
    exports org.apache.cayenne.access.translator.select;
    exports org.apache.cayenne.access.jdbc.reader;
    exports org.apache.cayenne.template;

    exports org.apache.cayenne.graph;
    exports org.apache.cayenne.access.event;
    exports org.apache.cayenne.access.jdbc;

    opens org.apache.cayenne.access;
    opens org.apache.cayenne.access.flush;
    opens org.apache.cayenne.configuration.server;
    opens org.apache.cayenne.configuration;

    opens org.apache.cayenne.dba;
    opens org.apache.cayenne.access.dbsync;
    opens org.apache.cayenne.configuration.xml;
    opens org.apache.cayenne.tx;

    uses org.apache.cayenne.configuration.server.CayenneServerModuleProvider;

    uses org.apache.cayenne.di.spi.ModuleProvider;

    provides org.apache.cayenne.di.spi.ModuleProvider with org.apache.cayenne.configuration.server.MainCayenneServerModuleProvider;

    provides org.apache.cayenne.configuration.server.CayenneServerModuleProvider with org.apache.cayenne.configuration.server.MainCayenneServerModuleProvider;
}

/*
Exception in thread "main" java.util.ServiceConfigurationError: com.mydeveloperplanet.serviceproviderinterface.spi.ServiceProviderInterface: module com.mydeveloperplanet.serviceproviderinterface does
 not declare `uses`
 at java.base/java.util.ServiceLoader.fail(ServiceLoader.java:588)
 at java.base/java.util.ServiceLoader.checkCaller(ServiceLoader.java:574)
 at java.base/java.util.ServiceLoader.<init>(ServiceLoader.java:503)
 at java.base/java.util.ServiceLoader.load(ServiceLoader.java:1684)
 at com.mydeveloperplanet.serviceproviderinterface/com.mydeveloperplanet.serviceproviderinterface.Service.printServiceNames(Service.java:25)
 at com.mydeveloperplanet.jpmshello/com.mydeveloperplanet.jpmshello.HelloModules.checkProvidesWith(HelloModules.java:48)
 at com.mydeveloperplanet.jpmshello/com.mydeveloperplanet.jpmshello.HelloModules.main(HelloModules.java:21)


Add the provides...with directive to the module-info.java of com.mydeveloperplanet.serviceprovider1. After provides, we add the interface. After with, we add the implementation:

module com.mydeveloperplanet.serviceprovider1 {
    requires com.mydeveloperplanet.serviceproviderinterface;
    provides com.mydeveloperplanet.serviceproviderinterface.spi.ServiceProviderInterface with com.mydeveloperplanet.serviceprovider1.ServiceProvider1;
}


Add the uses directive to the module-info of com.mydeveloperplanet.serviceproviderinterface. After uses, we add the interface:

module com.mydeveloperplanet.serviceproviderinterface {
    exports com.mydeveloperplanet.serviceproviderinterface.spi;
    exports com.mydeveloperplanet.serviceproviderinterface;
    uses com.mydeveloperplanet.serviceproviderinterface.spi.ServiceProviderInterface;
}
* */