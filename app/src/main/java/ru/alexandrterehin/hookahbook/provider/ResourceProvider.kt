package ru.alexandrterehin.hookahbook.provider

import android.graphics.drawable.Drawable
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

/**
 * Поставщик ресурсов
 *
 */
interface ResourceProvider {

    /**
     * Получить идентификатор ресурса по имени
     *
     * @param name
     * @return
     */
    fun getResourceIdByName(name: String): Int

    /**
     * Получить строку
     *
     * @param id идентификатор ресурса строки
     * @return строка
     */
    fun getString(@StringRes id: Int): String

    /**
     * TODO
     *
     * @param id
     * @return
     */
    fun getStringParams(id: Int, vararg params: Any): String

    /**
     * Получить drawable
     *
     * @param id идентификатор ресурса изображения
     * @return drawable
     */
    fun getDrawable(@DrawableRes id: Int): Drawable?

    /**
     * Получить drawable по наименованию
     *
     * @param nameRes наименование ресурса
     * @return
     */
    fun getDrawableByName(nameRes: String): Drawable?
}