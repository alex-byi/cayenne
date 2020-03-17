module cayenneDBSync {
    requires slf4j.api;
    requires java.desktop;
    requires java.base;
    requires java.datatransfer;
    requires java.prefs;
    requires java.sql;
    requires java.xml;
    requires cayenneServer;

    exports org.apache.cayenne.dbsync;
}