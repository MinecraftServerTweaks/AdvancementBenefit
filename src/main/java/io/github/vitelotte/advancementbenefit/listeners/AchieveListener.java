package io.github.vitelotte.advancementbenefit.listeners;

import org.bukkit.attribute.Attributable;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeInstance;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAdvancementDoneEvent;

public class AchieveListener implements Listener {

    @EventHandler
    public void onAchieve(PlayerAdvancementDoneEvent event) {
        Player player = event.getPlayer();
        AttributeInstance maxHealthAttribute = player.getAttribute(Attribute.GENERIC_MAX_HEALTH);
        maxHealthAttribute.setBaseValue(maxHealthAttribute.getBaseValue() + 1);
    }
}
