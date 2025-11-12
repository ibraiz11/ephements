pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "ephements"


include(
    ":app",
    ":core:common",
    ":core:network",
    ":core:database",
    ":core:datastore",
    ":core:location",
    ":core:bluetooth",
    ":core:ai",
    ":core:designsystem",
    ":data:marker",
    ":data:user",
    ":data:connection",
    ":data:notification",
    ":data:collaboration",
    ":domain:marker",
    ":domain:user",
    ":domain:connection",
    ":domain:notification",
    ":domain:collaboration",
    ":feature:map",
    ":feature:marker",
    ":feature:profile",
    ":feature:discovery",
    ":feature:proximity",
    ":feature:collaboration",
    ":feature:onboarding",
    ":feature:settings",
    ":test:test-common",
    ":test:test-fixtures"
)
