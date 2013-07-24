package batman123579.moarores;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class Hematite extends Item{

	public Hematite(int ID) {
		super(ID);
		this.setCreativeTab(mod_MainClass.EvenMoarOresTab);
		this.maxStackSize = 64;
	}

    @Override
    public void registerIcons(IconRegister reg)
    {
        this.itemIcon = reg.registerIcon("evenmoarores:Hematite");
    }
}
