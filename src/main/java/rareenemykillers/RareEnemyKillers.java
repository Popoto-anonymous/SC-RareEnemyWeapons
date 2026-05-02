package rareenemykillers;

import legend.game.inventory.EquipmentRegistryEvent;
import legend.game.inventory.EquipmentTypes;
import legend.game.inventory.GatherEquipmentTypesEvent;
import legend.game.inventory.screens.ShopScreen;
import legend.game.modding.events.inventory.ShopContentsEvent;
import legend.lodmod.LodShops;
import org.legendofdragoon.modloader.Mod;
import org.legendofdragoon.modloader.events.EventListener;
import org.legendofdragoon.modloader.registries.RegistryId;

import static legend.core.GameEngine.EVENTS;

@Mod(id = RareEnemyKillers.MOD_ID, version = "^3.0.0")
public class RareEnemyKillers {
  public static final String MOD_ID = "rareenemykillers";

  public RareEnemyKillers() {
    EVENTS.register(this);
  }

  public static RegistryId id(final String entryId) {
    return new RegistryId(MOD_ID, entryId);
  }

  @EventListener
  public void registerEquipments(final EquipmentRegistryEvent event) { Weapons.register(event); }
  @EventListener
  public void shopEquipmentEvent(final ShopContentsEvent event) {
    if (event.shop == LodShops.BALE_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_SLAYERP.get(), 100));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_IMPALERP.get(), 100));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_SHOTP.get(), 100));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_PIERCERP.get(), 100));
    }
    if (event.shop == LodShops.KAZAS_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_IMPACTP.get(), 100));
    }
    if (event.shop == LodShops.DONAU_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_BONKERP.get(), 100));
    }
    if (event.shop == LodShops.QUEEN_FURY_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_DIVIDERP.get(), 100));
    }
    if (event.shop == LodShops.VELLWEB_EQUIPMENT_SHOP.get()) {
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_SLAYERC.get(), 100));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_IMPALERC.get(), 100));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_SHOTC.get(), 100));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_PIERCERC.get(), 100));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_IMPACTC.get(), 100));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_BONKERC.get(), 100));
      event.contents.add(new ShopScreen.ShopEntry<>(Weapons.RARE_DIVIDERC.get(), 100));
    }
  }
  @EventListener
  public static void gatherEquipmentTypes(final GatherEquipmentTypesEvent event) {
    event.add(Weapons.RARE_SLAYERP.get(), EquipmentTypes.LONGSWORD);
    event.add(Weapons.RARE_SLAYERC.get(), EquipmentTypes.LONGSWORD);
    event.add(Weapons.RARE_IMPALERP.get(), EquipmentTypes.POLEARM);
    event.add(Weapons.RARE_IMPALERC.get(), EquipmentTypes.POLEARM);
    event.add(Weapons.RARE_SHOTP.get(), EquipmentTypes.BOW);
    event.add(Weapons.RARE_SHOTC.get(), EquipmentTypes.BOW);
    event.add(Weapons.RARE_PIERCERP.get(), EquipmentTypes.SHORTSWORD);
    event.add(Weapons.RARE_PIERCERC.get(), EquipmentTypes.SHORTSWORD);
    event.add(Weapons.RARE_IMPACTP.get(), EquipmentTypes.HAND);
    event.add(Weapons.RARE_IMPACTC.get(), EquipmentTypes.HAND);
    event.add(Weapons.RARE_BONKERP.get(), EquipmentTypes.HAMMER);
    event.add(Weapons.RARE_BONKERC.get(), EquipmentTypes.HAMMER);
    event.add(Weapons.RARE_DIVIDERP.get(), EquipmentTypes.AXE);
    event.add(Weapons.RARE_DIVIDERC.get(), EquipmentTypes.AXE);
  }
}

