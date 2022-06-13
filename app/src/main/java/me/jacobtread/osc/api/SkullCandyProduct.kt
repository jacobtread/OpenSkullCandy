package me.jacobtread.osc.api

enum class SkullCandyProduct(
    val deviceName: String,
    val modelId: Int,
    val alternativeNames: List<String> = emptyList(),
    val audiodoEnabled: Boolean = false,
    val airohaModelId: Int = modelId
) {

    CRUSHER_ANC("Crusher ANC", 1),
    CRUSHER_ENV("Crusher EVO", 2),
    INDY_ANC("Indy ANC", 7, audiodoEnabled = true),
    INDY_FUEL("Indy Fuel", 4, airohaModelId = 11),
    INDY_EVO("Indy Evo", 3, airohaModelId = 10),
    PUSH_ULTRA("Push Ultra", 5),
    PUSH_ACTIVE("Push Active", 8),
    GRIND("Grind", 9),
    GRIND_FUEL("Grind Fuel", 99),
    JIB_TRUE_XT2("Jib True 2", 13, listOf("Jib True XT 2")),
    DIME_2("Dime 2", 18),
    SESH_ANC("Sesh ANC", 12, listOf("Sesh ANC LE")),
    MOD("Mod", 18),
    RIFF_WIRELESS_2("Riff Wireless 2", 20, listOf("Riff2", "Riff2-EVT"))
}