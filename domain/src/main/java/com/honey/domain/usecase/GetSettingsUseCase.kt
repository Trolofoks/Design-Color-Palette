package com.honey.domain.usecase

import com.honey.domain.model.EditableSettings
import com.honey.domain.repository.SettingsRepository

class GetSettingsUseCase(private val settingsRepository: SettingsRepository) {
    fun invoke(): EditableSettings {
        return settingsRepository.getUserSettings()
    }
}