package com.bawp.jettrivia.screens

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import com.bawp.jettrivia.component.Questions

@Composable
fun TriviaHome( viewModel: QuestionsViewModel = hiltViewModel()) = Questions(viewModel)

