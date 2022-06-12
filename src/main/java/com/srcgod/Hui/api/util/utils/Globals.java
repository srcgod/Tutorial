package com.srcgod.Hui.api.util.utils;

import com.srcgod.Hui.impl.Hui;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScaledResolution;

import java.util.Random;

public interface Globals {
    Minecraft mc = Minecraft.getMinecraft();
    Random random = new Random();
    ScaledResolution sr = new ScaledResolution(mc);

    default boolean nullCheck(){
        return mc.player == null || mc.world == null;
    }
}
