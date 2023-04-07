package com.jonapoul.alakazam.prefs

import android.annotation.SuppressLint
import android.content.Context
import android.content.res.ColorStateList
import android.util.AttributeSet
import android.widget.ImageView
import android.widget.TextView
import androidx.core.content.res.TypedArrayUtils
import androidx.core.content.withStyledAttributes
import androidx.core.widget.ImageViewCompat
import androidx.preference.PreferenceCategory
import androidx.preference.PreferenceViewHolder
import com.jonapoul.alakazam.core.getColorFromAttr

@SuppressLint("RestrictedApi")
class CommonPreferenceCategory @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = TypedArrayUtils.getAttr(
        context,
        R.attr.preferenceCategoryStyle,
        android.R.attr.preferenceCategoryStyle
    ),
    defStyleRes: Int = 0,
) : PreferenceCategory(
    context,
    attrs,
    defStyleAttr,
    defStyleRes,
) {
    private var categoryTint: Int = context.getColorFromAttr(R.attr.colorPrimary)

    init {
        val styleable = R.styleable.CommonPreferenceCategory
        context.withStyledAttributes(attrs, styleable, defStyleAttr, defStyleRes) {
            categoryTint = getColor(R.styleable.CommonPreferenceCategory_cpc_tint, categoryTint)
        }
    }

    override fun onBindViewHolder(holder: PreferenceViewHolder) {
        super.onBindViewHolder(holder)
        /* Set icon colour */
        val imageView = holder.findViewById(android.R.id.icon) as ImageView
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(categoryTint))

        /* Set text colour */
        val titleView = holder.findViewById(android.R.id.title) as TextView
        titleView.setTextColor(categoryTint)
    }
}
