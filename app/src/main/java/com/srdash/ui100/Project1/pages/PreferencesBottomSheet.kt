package com.srdash.ui100.Project1.pages

import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.srdash.ui100.Project1.black

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showBackground = true)
@Composable
fun PreferencesBottomSheet(open: Boolean = true){
    ModalBottomSheet(
        onDismissRequest = {},
        sheetState = rememberModalBottomSheetState(),
        contentColor = Color.White
    ) {

    }
}