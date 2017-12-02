package com.polaritech.minecraft.pos;


import net.minecraftforge.common.config.Configuration;
import org.apache.logging.log4j.Level;
import com.polaritech.minecraft.pos.proxy.CommonProxy;

public class Config {

    private static final String CATEGORY_GENERAL = "general";
    private static final String CATEGORY_ABUNDANCES = "abundances";


    public static void readConfig() {
        Configuration cfg = CommonProxy.config;
        try {
            cfg.load();
            initGeneralConfig(cfg);
        }
        catch (Exception exception) {
            PriceOfSpice.logger.log(Level.ERROR, "Error loading config file!", exception);
        }
        finally {
            if (cfg.hasChanged()) {
                cfg.save();
            }
        }
    }

    private static void initGeneralConfig(Configuration cfg) {
        cfg.addCustomCategoryComment(CATEGORY_GENERAL, "General Configuration");
        cfg.addCustomCategoryComment(CATEGORY_ABUNDANCES, "Abundances configuration");
    }
}
