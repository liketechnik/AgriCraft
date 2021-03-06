/*
 */
package com.infinityraider.agricraft.api.plant;

import java.util.Collection;
import java.util.Set;

/**
 * An interface for managing AgriCraft plants.
 *
 * @author AgriCraft Team
 */
public interface IAgriPlantRegistry {

    boolean isPlant(IAgriPlant plant);

    IAgriPlant getPlant(String id);

    boolean addPlant(IAgriPlant plant);

    boolean removePlant(IAgriPlant plant);

    Collection<IAgriPlant> getPlants();

    Set<String> getPlantIds();

}
