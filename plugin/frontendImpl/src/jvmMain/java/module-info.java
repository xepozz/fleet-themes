module com.github.xepozz.fleet.themes.frontendImpl {
    requires fleet.frontend;
    requires fleet.kernel;
    requires fleet.util.logging.api;
    requires fleet.rhizomedb;
    requires fleet.frontend.ui;

    exports com.github.xepozz.fleet.themes.frontendImpl;
    provides fleet.kernel.plugins.Plugin with com.github.xepozz.fleet.themes.frontendImpl.FleetThemesPlugin;
}