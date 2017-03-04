package com.borjabravo.simpleratingbar

interface OnRatingChangedListener {
    fun onRatingChange(oldRating: Float, newRating: Float)
}