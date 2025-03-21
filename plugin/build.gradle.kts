plugins {
    base
    alias(libs.plugins.fleet.plugin)
}

version = "2025.0.4"

fleetPlugin {

    id = "com.github.xepozz.fleet.themes"

    // STEP 2: set up the sensible metadata for your plugin
    metadata {
        readableName = "Fleet Themes"
        description = """
         Set of the Fleet themes from the public repository: https://github.com/xepozz/fleet-themes
         Create a pull request to add your themes to the plugin.

         Dark Themes in the plugin:
         - Intellij IDEA – Dark (@xepozz)
         - CutCode – Dark (@lee-to)
         """.trimIndent()

        icons {
            default = project.layout.projectDirectory.file("frontendImpl/src/jvmMain/resources/pluginIcon.svg")
            dark = project.layout.projectDirectory.file("frontendImpl/src/jvmMain/resources/pluginIcon.svg")
        }
    }

    fleetRuntime {
        version = libs.versions.fleet.runtime
    }
}
