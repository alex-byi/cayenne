module cayenneServer {
    requires slf4j.api;
    requires java.desktop;
    requires java.base;
    requires java.datatransfer;
    requires java.prefs;
    requires java.sql;
    requires java.xml;

    exports org.apache.cayenne.configuration.server;
    exports org.apache.cayenne.util;
}