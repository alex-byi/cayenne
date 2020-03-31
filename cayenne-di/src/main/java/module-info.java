module cayenneDI {
    requires java.desktop;
    requires java.base;
    requires java.datatransfer;
    requires java.prefs;
    requires java.sql;
    requires java.xml;

    exports org.apache.cayenne.di;
    exports org.apache.cayenne.di.spi;

    uses org.apache.cayenne.di.spi.ModuleProvider;
}