# Ephements

A modern Android app built with Jetpack Compose.

## Project Structure

The app is structured with the following key components:

### Main Entry Points

- **`MainActivity.kt`** - The main activity that serves as the entry point to the app
- **`EphementsApp.kt`** - The root Compose UI component that defines the main app structure

### UI Theme

- **`ui/theme/Color.kt`** - Color definitions for the app's theme
- **`ui/theme/Type.kt`** - Typography definitions for the app's theme
- **`ui/theme/Theme.kt`** - Main theme composable that applies Material 3 theming

## Features

- Modern Material 3 design system
- Dynamic color support (Android 12+)
- Dark/Light theme support
- Edge-to-edge display with proper insets handling

## Tech Stack

- **Kotlin** 2.0.21
- **Jetpack Compose** with BOM 2024.10.00
- **Material 3** design components
- **Activity Compose** for integration with activities
- **Edge-to-edge** display support

## Build Configuration

The app uses Gradle version catalogs for dependency management and includes:

- Compose BOM for consistent versioning
- Kotlin Compose Compiler plugin
- Material 3 components
- Activity Compose integration

## Getting Started

1. Clone the repository
2. Open in Android Studio
3. Sync the project
4. Run the app

The app displays a welcome message in the center of the screen using Material 3 theming.