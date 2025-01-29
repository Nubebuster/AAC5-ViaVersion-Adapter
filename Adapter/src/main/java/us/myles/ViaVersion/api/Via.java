package us.myles.ViaVersion.api;

import org.bukkit.plugin.java.JavaPlugin;


public class Via<T> extends JavaPlugin implements ViaAPI<T> {

    private static Via INSTANCE = null;

    public Via() {
        INSTANCE = this;
    }

    @Deprecated
    public static ViaAPI getAPI() {
        return INSTANCE;
    }

    public int getPlayerVersion(T player) {
        return com.viaversion.viaversion.api.Via.getAPI().getPlayerVersion(player);
    }

}
