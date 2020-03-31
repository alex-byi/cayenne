open module cayenneDBSync {
    requires org.slf4j;
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

    exports org.apache.cayenne.dbsync;
    exports org.apache.cayenne.dbsync.xml;
    exports org.apache.cayenne.dbsync.reverse.dbimport;
    exports org.apache.cayenne.dbsync.filter;
    exports org.apache.cayenne.dbsync.naming;
    exports org.apache.cayenne.dbsync.merge.context;
    exports org.apache.cayenne.dbsync.reverse.dbload;
    exports org.apache.cayenne.dbsync.merge.factory;
    exports org.apache.cayenne.dbsync.reverse.filters;
    exports org.apache.cayenne.dbsync.reverse.configuration;
    exports org.apache.cayenne.dbsync.merge.token;
    exports org.apache.cayenne.dbsync.merge;
    exports org.apache.cayenne.dbsync.merge.token.db;

    provides org.apache.cayenne.configuration.server.CayenneServerModuleProvider with org.apache.cayenne.dbsync.DbSyncServerModuleProvider;
}