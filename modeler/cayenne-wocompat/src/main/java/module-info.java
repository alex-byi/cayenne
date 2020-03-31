module cayenneWocompat {
    exports org.apache.cayenne.wocompat;
    requires org.slf4j;
    requires java.desktop;
    requires java.base;
    requires java.datatransfer;
    requires java.prefs;
    requires java.sql;
    requires java.xml;
    requires cayenneServer;
    requires cayenneDBSync;
}