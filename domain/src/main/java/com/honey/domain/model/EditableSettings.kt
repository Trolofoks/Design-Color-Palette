package com.honey.domain.model

import kotlinx.serialization.Serializable

@Serializable
data class EditableSettings(
    val palette: Palette,
    val themeConfig: ThemeConfig
)