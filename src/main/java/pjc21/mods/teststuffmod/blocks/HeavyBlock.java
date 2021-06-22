package pjc21.mods.teststuffmod.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.ToolType;

import javax.annotation.Nullable;
import java.util.List;

public class HeavyBlock extends FallingBlock {
    public HeavyBlock() {
        super(AbstractBlock.Properties.of(Material.METAL)
            .harvestLevel(2)
            .harvestTool(ToolType.PICKAXE)
            .sound(SoundType.METAL)
            .strength(2.0F)
        );
    }

    @OnlyIn(Dist.CLIENT)
    @Override
    public void appendHoverText(ItemStack itemStack, @Nullable IBlockReader reader, List<ITextComponent> list, ITooltipFlag flag) {
        list.add(new TranslationTextComponent("message.heavy_block").withStyle(TextFormatting.DARK_AQUA));
    }
}
