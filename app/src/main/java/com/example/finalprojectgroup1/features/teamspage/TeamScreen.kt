package com.example.finalprojectgroup1.features.teamspage

// to do: teamScreen - Marianne
// just making the file i will add to this later

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Composable
fun TeamRow(modifier: Modifier){
    Row(
        verticalAlignment = Alignment.CenterVertically, modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Text(
            // add title from teamsview model here later, edit it so that it can be changed, just doing bare
            // bones text for now.
            "Team 1"
        )
        IconButton(onClick = {}){
            Icon(
                imageVector = Icons.Default.Edit,
                contentDescription = "Edit team"
            )
        }
        IconButton(onClick = {}) {
            Icon(
                imageVector = Icons.Default.Delete,
                contentDescription = "Delete Team"
            )
        }
    }
}