package dev.esonofander.mcbv3d;

import dev.esonofander.mcbv3d.init.McbvBlockInit;
import dev.esonofander.mcbv3d.init.McbvItemInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MoreChiseledBookshelfVariants3D implements ModInitializer {
    public static final String MODID = "esamcbv3d";
    public static final Logger LOGGER = LoggerFactory.getLogger(MODID);

    @Override
    public void onInitialize() {
        McbvBlockInit.registerBlocks();
        McbvItemInit.registerItems();
    }

    public static ResourceLocation asId(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}