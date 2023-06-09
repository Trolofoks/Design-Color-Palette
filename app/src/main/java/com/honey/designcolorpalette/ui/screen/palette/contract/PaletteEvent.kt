package com.honey.designcolorpalette.ui.screen.palette.contract

import com.honey.designcolorpalette.base.ViewEvent
import com.honey.domain.model.Palette

sealed class PaletteEvent: ViewEvent {
    data class SelectSubPalette (val palette: Palette) : PaletteEvent()
    object UpdatePalette : PaletteEvent()
}