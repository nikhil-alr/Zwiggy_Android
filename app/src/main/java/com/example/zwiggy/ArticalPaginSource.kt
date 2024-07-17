package com.example.zwiggy

import androidx.paging.PagingSource
import kotlin.math.max

import androidx.paging.PagingState

class ArticlePagingSource : PagingSource<Int, String>() {
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, String> {

    }
    override fun getRefreshKey(state: PagingState<Int, String>): Int? {
        
    }
}

