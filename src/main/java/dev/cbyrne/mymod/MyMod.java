package dev.cbyrne.mymod;

import dev.cbyrne.pufferfishmodloader.mods.core.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("mymod")
public class MyMod {
    private static final Logger LOGGER = LogManager.getLogger("MyMod");

    public void start() {
        LOGGER.info("MyMod started!");
    }
}

