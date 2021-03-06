package adver.sarius.ssb.gen;

import adver.sarius.ssb.gui.GuiCustomizeSSB;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkGenerator;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class WorldTypeSSB extends WorldType {

	public WorldTypeSSB(String name) {
		// auto register type
		super(name);		
	}

	@Override
	public IChunkGenerator getChunkGenerator(World world, String generatorOptions) {
		return new ChunkProviderOverworldSSB(world, world.getSeed(), world.getWorldInfo().isMapFeaturesEnabled(), generatorOptions);
	}
	// Don't want to override getSpawnFuzz, because then you can't change it ingame via gamerules.
	
	///////////////////////////////// TODO: Implement own customize.
	
	/**
     * Called when the 'Customize' button is pressed on world creation GUI
     * @param mc The Minecraft instance
     * @param guiCreateWorld the createworld GUI
     */
	@Override
    @SideOnly(Side.CLIENT)
    public void onCustomizeButton(net.minecraft.client.Minecraft mc, net.minecraft.client.gui.GuiCreateWorld guiCreateWorld)
    {
//		mc.displayGuiScreen(new GuiCustomizeSSB(guiCreateWorld, guiCreateWorld.chunkProviderSettingsJson));
		
//        if (this == WorldType.FLAT)
//        {
//            mc.displayGuiScreen(new net.minecraft.client.gui.GuiCreateFlatWorld(guiCreateWorld, guiCreateWorld.chunkProviderSettingsJson));
//        }
//        else if (this == WorldType.CUSTOMIZED)
//        {
//            mc.displayGuiScreen(new net.minecraft.client.gui.GuiCustomizeWorldScreen(guiCreateWorld, guiCreateWorld.chunkProviderSettingsJson));
//        }
    }

    /**
     * Should world creation GUI show 'Customize' button for this world type?
     * @return if this world type has customization parameters
     */
    public boolean isCustomizable()
    {
    	return false;
    }
}