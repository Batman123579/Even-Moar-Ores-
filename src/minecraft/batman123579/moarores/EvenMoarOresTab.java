package batman123579.moarores;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public final class EvenMoarOresTab extends CreativeTabs
{
    public EvenMoarOresTab(int par1, String par2Str) 
        {
                super(par1, par2Str);
        }
        

		//sets the image for the creative tab
        @SideOnly(Side.CLIENT)
        public int getTabIconItemIndex()
        {
                return Block.oreIron.blockID;
        }
   
        //sets the title/name for the creative tab
        public String getTranslatedTabLabel()
        {
         return "Even Moar Ores";
        }
}