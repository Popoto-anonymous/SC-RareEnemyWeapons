package rareenemykillers;

import legend.core.GameEngine;
import legend.game.characters.ElementSet;
import legend.game.inventory.Equipment;
import legend.game.inventory.EquipmentRegistryEvent;
import legend.game.inventory.ItemIcon;
import legend.game.types.EquipmentSlot;
import legend.lodmod.LodMod;
import org.legendofdragoon.modloader.registries.Registrar;
import org.legendofdragoon.modloader.registries.RegistryDelegate;

public class Weapons {
  private Weapons() { }

  private static final Registrar<Equipment, EquipmentRegistryEvent> EQUIPMENT_REGISTRAR = new Registrar<>(GameEngine.REGISTRIES.equipment, RareEnemyKillers.MOD_ID);

  // DART

  public static final RegistryDelegate<Equipment> RARE_SLAYERP = EQUIPMENT_REGISTRAR.register("rare_slayerp", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.SWORD, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x80));
  public static final RegistryDelegate<Equipment> RARE_SLAYERC = EQUIPMENT_REGISTRAR.register("rare_slayerc", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.SWORD, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x4));

  // LAVITZ\ALBERT

  public static final RegistryDelegate<Equipment> RARE_IMPALERP = EQUIPMENT_REGISTRAR.register("rare_impalerp", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.SPEAR, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x80));
  public static final RegistryDelegate<Equipment> RARE_IMPALERC = EQUIPMENT_REGISTRAR.register("rare_impalerc", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.SPEAR, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x4));

  // SHANA\MIRANDA

  public static final RegistryDelegate<Equipment> RARE_SHOTP = EQUIPMENT_REGISTRAR.register("rare_shotp", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.BOW, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x80));
  public static final RegistryDelegate<Equipment> RARE_SHOTC = EQUIPMENT_REGISTRAR.register("rare_shotc", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.BOW, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x4));

  // ROSE

  public static final RegistryDelegate<Equipment> RARE_PIERCERP = EQUIPMENT_REGISTRAR.register("rare_piercerp", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.SWORD, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x80));
  public static final RegistryDelegate<Equipment> RARE_PIERCERC = EQUIPMENT_REGISTRAR.register("rare_piercerc", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.SWORD, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x4));

  // HASCHEL

  public static final RegistryDelegate<Equipment> RARE_IMPACTP = EQUIPMENT_REGISTRAR.register("rare_impactp", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.BOXING_GLOVE, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x80));
  public static final RegistryDelegate<Equipment> RARE_IMPACTC = EQUIPMENT_REGISTRAR.register("rare_impactc", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.BOXING_GLOVE, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x4));

  // MERU

  public static final RegistryDelegate<Equipment> RARE_BONKERP = EQUIPMENT_REGISTRAR.register("rare_bonkerp", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.HAMMER, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x80));
  public static final RegistryDelegate<Equipment> RARE_BONKERC = EQUIPMENT_REGISTRAR.register("rare_bonkerc", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.HAMMER, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x4));

  // KONGOL

  public static final RegistryDelegate<Equipment> RARE_DIVIDERP = EQUIPMENT_REGISTRAR.register("rare_dividerp", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.AXE, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x80));
  public static final RegistryDelegate<Equipment> RARE_DIVIDERC = EQUIPMENT_REGISTRAR.register("rare_dividerc", () -> new Equipment(100, 0x0, EquipmentSlot.WEAPON, LodMod.NO_ELEMENT.get(), new ElementSet(), new ElementSet(), 0x0, 1, 0, 0, 0, 0, 0, 0, 0, false, false, false, false, 100, 0, 0, 0, 0, ItemIcon.AXE, 0, 0, 0, 0, 0, 50, 50, 0, 0, 100, 0x4));

  static void register ( final EquipmentRegistryEvent event){EQUIPMENT_REGISTRAR.registryEvent(event);}
}
