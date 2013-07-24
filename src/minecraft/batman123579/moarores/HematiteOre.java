package batman123579.moarores;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockOre;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import batman123579.moarores.*;

public class HematiteOre extends BlockOre{

	public HematiteOre(int par1) {
		super(par1);

		this.setCreativeTab(mod_MainClass.EvenMoarOresTab);
	}
	
	@Override
	public void registerIcons(IconRegister reg)
	{
		this.blockIcon = reg.registerIcon("evenmoarores:HematiteOre");
	}
}