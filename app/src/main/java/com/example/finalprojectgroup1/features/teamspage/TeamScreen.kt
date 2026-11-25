package com.example.finalprojectgroup1.features.teamspage

// to do: teamScreen - Marianne
// just making the file i will add to this later

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items



@Composable
fun TeamRow(name: String, members: String, modifier: Modifier = Modifier){
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                // add title from teamsview model here later, edit it so that it can be changed, just doing bare
                // bones text for now.
                text = name,
                modifier = Modifier.weight(1f)
            )
            IconButton(onClick = {}) {
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
        Text(
            members
        )
    }
}


@Composable
fun TeamScreen(modifier: Modifier = Modifier){
    val teams = listOf<String>("Team 1", "Team 2", "Team 3")
    LazyColumn(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        items(teams) {
            teams -> TeamRow(teams, "Luxray, Lucario, Togekiss, Arceus")
        }
    }
}