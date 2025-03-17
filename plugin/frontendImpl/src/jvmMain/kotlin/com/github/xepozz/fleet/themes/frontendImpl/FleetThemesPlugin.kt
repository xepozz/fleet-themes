package com.github.xepozz.fleet.themes.frontendImpl

import fleet.dock.api.ThemeId
import fleet.frontend.theme.registerTheme
import fleet.kernel.plugins.ContributionScope
import fleet.kernel.plugins.Plugin
import fleet.kernel.plugins.PluginScope

class FleetThemesPlugin : Plugin<Unit> {
    companion object : Plugin.Key<Unit>

    override val key: Plugin.Key<Unit> = FleetThemesPlugin

    override fun ContributionScope.load(pluginScope: PluginScope) {
        registerTheme(ThemeId(id = "intellij_dark"))
        registerTheme(ThemeId(id = "cutcode_dark"))
    }
}
