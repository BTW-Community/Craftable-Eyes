package btw.community.craftableEyes;

import btw.AddonHandler;
import btw.BTWAddon;
import btw.crafting.recipe.RecipeManager;
import net.minecraft.src.Item;
import net.minecraft.src.ItemStack;

import java.util.Map;

public class craftableEyesAddon extends BTWAddon {
    private static craftableEyesAddon instance;

    public craftableEyesAddon() {
        super();
    }

    @Override
    public void initialize() {
        AddonHandler.logMessage(this.getName() + " Version " + this.getVersionString() + " Initializing...");

        RecipeManager.addShapelessRecipe(new ItemStack(Item.eyeOfEnder, 1 ), new Object[] {
                new ItemStack( Item.enderPearl),
                new ItemStack( Item.blazePowder),
        });
    }

/*
    @Override
    public void preInitialize() {
        this.registerProperty("ForceWhiteGUIText", "False", "Force all text to be white. WARNING: will break all colored text rendering");
        this.registerProperty("NoPotionOffset", "True", "Disable the offset to the GUI when you have potion effects");
        this.registerProperty("RenderTranslucentGUI", "True", "Allow the game to render translucent GUI textures. Disabling this may have a minor performance improvement");
    }

    @Override
    public void handleConfigProperties(Map<String, String> propertyValues) {
        shouldForceWhiteGUIText = Boolean.parseBoolean(propertyValues.get("ForceWhiteGUIText"));
        shouldNotPotionOffset = Boolean.parseBoolean(propertyValues.get("NoPotionOffset"));
        shouldRenderTranslucency = Boolean.parseBoolean(propertyValues.get("RenderTranslucentGUI"));
    }
    */
}