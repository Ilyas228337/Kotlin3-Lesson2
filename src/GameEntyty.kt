open class GameEntity {
    private var health: Int = 0
    private var damage: Int = 0
    private var ability: String? = null

    fun getHealth(): Int {
        return health
    }

    fun getDamage(): Int {
        return damage
    }

    fun getAbility(): String? {
        return ability
    }

    fun setHealth(health: Int) {
        this.health = health
    }

    fun setDamage(damage: Int) {
        this.damage = damage
    }

    fun setAbility(ability: String?) {
        this.ability = ability
    }
}