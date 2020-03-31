module cayenneProject {
    requires java.desktop;
    requires java.base;
    requires java.datatransfer;
    requires java.prefs;
    requires java.sql;
    requires java.xml;

    requires cayenneServer;
    requires cayenneDI;
    requires org.slf4j;

    exports org.apache.cayenne.project;
    exports org.apache.cayenne.project.extension;
    exports org.apache.cayenne.project.extension.info;
    exports org.apache.cayenne.project.validation;
    exports org.apache.cayenne.project.upgrade;

    opens org.apache.cayenne.project.validation;
    opens org.apache.cayenne.project to cayenneDI;

    uses org.apache.cayenne.di.spi.ModuleProvider;

    provides org.apache.cayenne.configuration.server.CayenneServerModuleProvider with org.apache.cayenne.project.ProjectServerModuleProvider;

}