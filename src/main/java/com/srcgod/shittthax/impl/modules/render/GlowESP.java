package com.srcgod.shittthax.impl.modules.render;

import com.srcgod.shittthax.api.module.Module;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;
import java.util.ArrayList;
import java.util.List;

public class GlowESP extends Module {

    private static List<Entity> glowed = new ArrayList<>();

    public GlowESP() {

        super("GlowESP", Keyboard.KEY_NONE, Category.RENDER);

        ArrayList<String> options = new ArrayList<>();
    }

    @SubscribeEvent

    public void onRender(RenderWorldLastEvent e) {

        for (EntityPlayer playerEntity : mc.world.playerEntities) {

            if (playerEntity != mc.player && playerEntity != glowed) {

                playerEntity.setGlowing(true);

                glowed.add(playerEntity);

            }

        }

    }

    @Override

    public void onDisable() {

        for (Entity entity : glowed) {

            entity.setGlowing(false);

        }

        glowed.clear();

        super.onDisable();

    }

}