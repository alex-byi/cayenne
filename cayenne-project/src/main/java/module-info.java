module cayenneProject {
    requires java.desktop;
    requires java.base;
    requires java.datatransfer;
    requires java.prefs;
    requires java.sql;
    requires java.xml;

    requires cayenneServer;
    requires cayenneDI;
    requires slf4j.api;

    exports org.apache.cayenne.project;
    exports org.apache.cayenne.project.extension;
    exports org.apache.cayenne.project.extension.info;
    exports org.apache.cayenne.project.validation;
    exports org.apache.cayenne.project.upgrade;

    opens org.apache.cayenne.project.validation;
}