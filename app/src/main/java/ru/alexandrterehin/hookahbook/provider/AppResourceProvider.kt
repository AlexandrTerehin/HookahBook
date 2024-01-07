package ru.alexandrterehin.hookahbook.provider

import android.content.Context
import android.graphics.drawable.Drawable

/**
 * Реализация поставщика ресурсов
 *
 * @property context контекст приложения
 */
internal class AppResourceProvider(private val context: Context) : ResourceProvider {

    override fun getResourceIdByName(name: String): Int =
        context.resources.getIdentifier(
            name,
            "id",
            context.packageName
        )

    override fun getString(id: Int): String = context.getString(id)

    override fun getStringParams(id: Int, vararg params: Any): String =
        context.resources.getString(id, params)

    override fun getDrawable(id: Int): Drawable? = context.getDrawable(id)

    override fun getDrawableByName(nameRes: String): Drawable? =
        getDrawable(getResourceIdByName(nameRes))
}