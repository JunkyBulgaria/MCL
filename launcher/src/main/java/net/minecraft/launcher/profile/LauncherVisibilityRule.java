package net.minecraft.launcher.profile;

public enum LauncherVisibilityRule {
    HIDE_LAUNCHER("Hide launcher and re-open when game closes"), CLOSE_LAUNCHER("Close launcher when game starts"), DO_NOTHING("Keep the launcher open");

    private final String name;

    private LauncherVisibilityRule(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}