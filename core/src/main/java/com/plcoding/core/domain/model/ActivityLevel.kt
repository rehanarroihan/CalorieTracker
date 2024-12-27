package com.plcoding.core.domain.model

sealed class ActivityLevel(val name: String) {
    object Low: ActivityLevel("low")
    object Medium: ActivityLevel("medium")
    object High: ActivityLevel("hight")

    companion object {
        fun fromString(name: String): ActivityLevel {
            return when(name) {
                "low" -> Low
                "medium" -> Medium
                "high" -> High
                else -> Medium
            }
        }
    }
}