fun main() {
    val boss = Boss()
    boss.setAbility("Barrier")
    boss.setDamage(99)
    boss.setHealth(1000)

    val weapon = Weapon()
    weapon.setWeaponName("Sword")
    weapon.setWeaponType("Рубящее,режущее")

    println("Boss Ability - ${boss.getAbility()}")
    println("Boss Damage - ${boss.getDamage()}")
    println("Boss Health - ${boss.getHealth()}")
    println("Boss WeaponName - ${weapon.getWeaponName()}")
    println("Boss WeaponType - ${weapon.getWeaponType()}")
}