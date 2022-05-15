package com.mohammadbahadori.core

sealed class DataState<T> {
    data class Response<T>(val uiComponent: UiComponent) : DataState<T>()
    data class Data<T>(val data: T?)
    data class Loading<T>(val progressBarState: ProgressBarState = ProgressBarState.Idle) :
        DataState<T>()
}