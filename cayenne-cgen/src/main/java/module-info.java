module cayenneCgen {
    exports org.apache.cayenne.gen.xml;
    exports org.apache.cayenne.gen;
    exports org.apache.cayenne.tools;
    requires slf4j.api;
    requires java.desktop;
    requires java.base;
    requires java.datatransfer;
    requires java.prefs;
    requires java.sql;
    requires java.xml;
    requires cayenneServer;
    requires cayenneDI;
    requires cayenneProject;
    requires inflector;
    requires cayenneDBSync;
    requires velocity.engine.core;
    requires velocity.tools.generic;

    opens org.apache.cayenne.gen;

}