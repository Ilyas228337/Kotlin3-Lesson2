class Weapon {
    private var weaponType: String? = null
    private var weaponSword: String? = null

    fun getWeaponType(): String? {
        return weaponType
    }

    fun getWeaponName(): String? {
        return weaponSword
    }

    fun setWeaponType(weaponType: String?) {
        this.weaponType = weaponType
    }

    fun setWeaponName(weaponSword: String?) {
        this.weaponSword = weaponSword
    }
}