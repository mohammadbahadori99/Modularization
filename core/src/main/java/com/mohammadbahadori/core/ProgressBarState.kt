package com.mohammadbahadori.core

sealed class ProgressBarState {
    object Idle : ProgressBarState()
    object Loading : ProgressBarState()
}
