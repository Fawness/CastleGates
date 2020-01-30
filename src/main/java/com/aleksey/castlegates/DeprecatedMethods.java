  
/**
 * @author Aleksey Terzi
 *
 */

package com.aleksey.castlegates;

import org.bukkit.Material;
import org.bukkit.block.Block;

import com.aleksey.castlegates.types.BlockState;

@SuppressWarnings("deprecation")
public class DeprecatedMethods {
	public static Material getMaterial(String i) {
		return Material.getMaterial(i);
	}

	public static int getMaterialId(Material material) {
		return material.getId();
	}

	public static Material getTypeId(Block block) {
		return block.getType();
	}

	public static byte getMeta(Block block) {
		return block.getData();
	}

	public static void setTypeIdAndData(Block block, int type, byte meta) {
		((DeprecatedMethods) block).setTypeIdAndData(type, meta, true);
	}

	private void setTypeIdAndData(int type, byte meta, boolean b) {
		// TODO Auto-generated method stub
		
	}

	public static void setTypeIdAndData(Block block, Material material, byte meta) {
		((DeprecatedMethods) block).setTypeIdAndData(material.getId(), meta, true);
	}
	
	public static org.bukkit.block.BlockState toCraftBukkit(Block block, BlockState blockState) {
		org.bukkit.block.BlockState state = block.getState();
		state.setType(blockState.id);
		state.setRawData(blockState.meta);
		return state;
	}
	
	public static void commitCraftBukkit(org.bukkit.block.BlockState state) {
		setTypeIdAndData(state.getBlock(), state.getType(), state.getRawData());
	}

	public static Material getMaterialId(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}
}