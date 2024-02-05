package alakazam.android.prefs

import alakazam.android.core.getColorFromAttr
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

@SuppressLint("RestrictedApi")
public class CommonPreferenceCategory @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = TypedArrayUtils.getAttr(
    context,
    androidx.preference.R.attr.preferenceCategoryStyle,
    android.R.attr.preferenceCategoryStyle
  ),
  defStyleRes: Int = 0,
) : PreferenceCategory(context, attrs, defStyleAttr, defStyleRes) {
  private var categoryTint: Int = context.getColorFromAttr(android.R.attr.colorPrimary)

  init {
    context.withStyledAttributes(attrs, R.styleable.CommonPreferenceCategory, defStyleAttr, defStyleRes) {
      categoryTint = getColor(R.styleable.CommonPreferenceCategory_cpc_tint, categoryTint)
    }
  }

  override fun onBindViewHolder(holder: PreferenceViewHolder) {
    super.onBindViewHolder(holder)
    // Set icon colour
    val imageView = holder.findViewById(android.R.id.icon) as ImageView
    ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(categoryTint))

    // Set text colour
    val titleView = holder.findViewById(android.R.id.title) as TextView
    titleView.setTextColor(categoryTint)
  }
}
