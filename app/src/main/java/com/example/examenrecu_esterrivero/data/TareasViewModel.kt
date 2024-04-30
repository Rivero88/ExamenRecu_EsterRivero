package com.example.examenrecu_esterrivero.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

class TareasViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(TareasUiState())
    val uiState: StateFlow<TareasUiState> = _uiState.asStateFlow()

    var nombreTarea by mutableStateOf("")

    fun TareaNueva (nuevoNombreTarea: String){
        nombreTarea = nuevoNombreTarea
    }

}