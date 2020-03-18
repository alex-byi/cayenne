module cayenneModeler {
    requires slf4j.api;
    requires java.desktop;
    requires java.base;
    requires java.datatransfer;
    requires java.prefs;
    requires java.sql;
    requires java.xml;

    requires cayenneDBSync;
    requires cayenneServer;
    requires cayenneDI;
    requires cayenneProject;
    requires cayenneCgen;
    requires forms;
    requires jgraph;
    requires cayenneWocompat;
    requires ognl;

    exports org.slf4j.impl;
    exports org.apache.cayenne.modeler.action;
    exports org.apache.cayenne.modeler;
    exports org.apache.cayenne.modeler.init.platform;
    exports org.apache.cayenne.modeler.util;
}