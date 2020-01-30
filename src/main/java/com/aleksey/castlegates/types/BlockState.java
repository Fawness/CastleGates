/**
 * @author Aleksey Terzi
 *
 */

package com.aleksey.castlegates.types;

import org.bukkit.Material;
import org.bukkit.block.Block;

import com.aleksey.castlegates.DeprecatedMethods;
import com.aleksey.castlegates.database.ReinforcementInfo;

public class BlockState {
	public static final int BytesPerBlock = 3;

	public Material id;
	public byte meta;
	public ReinforcementInfo reinforcement;

	public BlockState() {
	}

	public BlockState(Block block) {
		this.id = DeprecatedMethods.getTypeId(block);
		this.meta = DeprecatedMethods.getMeta(block);
	}

}
