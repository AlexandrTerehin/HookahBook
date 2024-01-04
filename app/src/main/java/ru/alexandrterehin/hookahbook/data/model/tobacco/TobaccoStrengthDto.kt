package ru.alexandrterehin.hookahbook.data.model.tobacco

/**
 * Перечисление крепости табака
 */
enum class TobaccoStrengthDto(val typeIndex: Int) {

    /**
     * Без никотина
     */
    ZERO(0),

    /**
     * Легкий
     */
    LIGHT(1),

    /**
     * Средний
     */
    MEDIUM(2),

    /**
     * Тяжелый
     */
    STRONG(3),
}