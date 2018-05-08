package mcpe.nukkit.servername;

import cn.nukkit.plugin.PluginBase;

public class MainClass extends PluginBase {

    @Override
    public void onEnable() {
        saveDefaultConfig();
        getServer().getNetwork().setName(getConfig().getString("Server-name"));
    }
}
