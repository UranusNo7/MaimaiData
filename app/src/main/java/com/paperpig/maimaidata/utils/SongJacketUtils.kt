package com.paperpig.maimaidata.utils

import java.util.Locale

/**
 * 曲绘统一从本地 assets/Music 读取。
 * 标准曲目 id、DX 曲目 id(10000+)、宴会场曲目 id(100000+) 均按 id % 10000 映射到六位编号文件。
 */
object SongJacketUtils {
    private const val JACKET_ASSET_DIR = "Music"
    private const val JACKET_FILE_PREFIX = "ui_jacket_"
    private const val JACKET_ASSET_PREFIX = "file:///android_asset/$JACKET_ASSET_DIR/"

    fun jacketFileName(songId: Int): String =
        String.format(Locale.ROOT, "$JACKET_FILE_PREFIX%06d.webp", songId % 10000)

    fun jacketAssetUrl(songId: Int): String = JACKET_ASSET_PREFIX + jacketFileName(songId)
}
