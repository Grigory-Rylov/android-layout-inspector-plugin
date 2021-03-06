package com.github.grishberg.android.layoutinspector.common

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.swing.Swing

class CoroutinesDispatchersImpl : CoroutinesDispatchers {
    override val worker: CoroutineDispatcher = Dispatchers.IO
    override val ui: CoroutineDispatcher = Dispatchers.Swing
}
